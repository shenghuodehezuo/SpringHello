package com.coffee.spring.s07.aop.introduction;

public class UserDaoMonitor {
    public static void begain(){
        System.out.println("数据库操作之前干些什么");
    }
    public static void end(){
        System.out.println("数据库操作之后干什么！");
    }
}
