package com.coffee.spring.s06.aop.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lz
 */
public class AroundAdvise implements MethodInterceptor {

    public Object invoke(MethodInvocation i) throws Throwable {
        System.out.println("method:"+i.getMethod()+"|is called by:"+i.getThis()+"|args:"+i.getArguments()[0]);
        Object retObject=i.proceed();
        System.out.println("method"+i.getMethod()+"returns:"+retObject);
        return retObject;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }
}
