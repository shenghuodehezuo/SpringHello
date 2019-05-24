package com.coffee.spring.s06.aop.proxy;

public class Main {
    public static void main(String[] args) {
            studentInterface s1=new StudentBean("liuwei",-1);
            ProxyFactory factory=new ProxyFactory();
            studentInterface s2= (studentInterface) factory.createStudentProxy(s1);
            s1.printName();s1.say();

    }
}
