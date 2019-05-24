package com.coffee.spring.s06.aop.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("conf/conf-aspect.xml");
        Student student= (Student) ctx.getBean("stu");
        student.say();
        student.study("liuwei2",36);

    }
}
