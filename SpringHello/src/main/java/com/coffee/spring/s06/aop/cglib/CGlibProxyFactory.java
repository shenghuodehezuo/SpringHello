package com.coffee.spring.s06.aop.cglib;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.CallbackFilter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

public class CGlibProxyFactory {
    public Object createProxy(Class targetClass,Class[] argTypes,Object[] argObjects){
        Callback[] callbacks={NoOp.INSTANCE,new SayInterceptor(),new StudyInterceptor()};
        CallbackFilter filter=new studentCallbackFilter();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallbacks(callbacks);
        enhancer.setCallbackFilter(filter);
        return enhancer.create(argTypes, argObjects);
    }
}
