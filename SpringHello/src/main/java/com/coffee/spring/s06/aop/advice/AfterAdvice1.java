package com.coffee.spring.s06.aop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice1 implements AfterReturningAdvice {
    public void afterReturning(Object returnObject, Method method, Object[] args, Object object) throws Throwable {
        System.out.println(returnObject.toString()+(String)args[0]+"后置增强要干些啥！"+object.toString());
    }
}
