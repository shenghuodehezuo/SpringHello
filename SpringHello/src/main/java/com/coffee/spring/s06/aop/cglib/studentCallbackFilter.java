package com.coffee.spring.s06.aop.cglib;

import org.springframework.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class studentCallbackFilter implements CallbackFilter {
    public int accept(Method method){
        if("study".equals(method.getName())){
            return 2;
        }
        return 0;
    }
}
