package com.coffee.spring.s06.aop.proxy;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

public class ProxyFactory implements InvocationHandler {
            private Object stu;
            public Object createStudentProxy(Object stu){
                this.stu=stu;
                return Proxy.newProxyInstance(stu.getClass().getClassLoader(), stu.getClass().getInterfaces(),this);
            }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        StudentBean s=(StudentBean) stu;
        Object object=null;
        if ((s.getName()!=null)&&(s.getAge()>0)) {
            object=method.invoke(stu, args);
        }else {
            System.out.println("不合法！");
        }
        return object;
    }
}
