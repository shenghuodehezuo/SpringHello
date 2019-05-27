package com.coffee.spring.s07.aop.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class ControllerUserDaoMonitor extends DelegatingIntroductionInterceptor implements Monitor,Monitor2 {
    private String c1="刘伟";
    private ThreadLocal<Boolean> monitorStatusMap=new ThreadLocal<Boolean>();

    public void setMonitorActive(boolean active) {
        monitorStatusMap.set(active);
    }
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable{
        Object obj=null;
        if(monitorStatusMap.get()!=null&&monitorStatusMap.get()){
            UserDaoMonitor.begain();
            obj=super.invoke(mi);
            UserDaoMonitor.end();
        }else {
            obj=super.invoke(mi);
        }
        return obj;
    }
    public void say(){
        System.out.println(c1);
    }
}
