package com.coffee.spring.s06.aop.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class SayInterceptor implements MethodInterceptor {
    public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy)throws Throwable{
        System.out.println("说之前干些什么！");
        Object robject=proxy.invokeSuper(object, args);
        System.out.println("说之后干些什么！");
        return robject;
    }
}
