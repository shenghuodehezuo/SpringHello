package com.coffee.spring.s06.aop.cglib;

public class main {
    public static void main(String[] args) {
        Class[] argTypes={String.class,Integer.TYPE};
        Object[] argObjects={"liuwei",18};
        StudentBean sBean=(StudentBean)(new CGlibProxyFactory())
                .createProxy(StudentBean.class, argTypes, argObjects);
        sBean.say();
        sBean.study();
    }
}
