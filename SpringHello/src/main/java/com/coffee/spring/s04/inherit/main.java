package com.coffee.spring.s04.inherit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext beanFactory=new ClassPathXmlApplicationContext("conf/conf-inherit.xml");
        Customer customer=beanFactory.getBean("customer",Customer.class);
        System.out.println(customer);
    }
}
