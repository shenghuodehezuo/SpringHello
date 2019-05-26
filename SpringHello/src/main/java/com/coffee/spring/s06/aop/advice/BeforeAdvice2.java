package com.coffee.spring.s06.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvice2 implements MethodBeforeAdvice {
    public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
        System.out.println(arg0.getName()+(String)arg1[0]+"222222前置增强要干些啥！");
    }
}
