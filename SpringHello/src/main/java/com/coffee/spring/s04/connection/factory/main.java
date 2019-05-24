package com.coffee.spring.s04.connection.factory;

import com.coffee.spring.s02.springioc.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext beanFactory=new ClassPathXmlApplicationContext("conf/conf-collectionFactorys.xml");
        Customer customer=beanFactory.getBean("CustomerBean",Customer.class);
        System.out.println(customer);

    }
}
