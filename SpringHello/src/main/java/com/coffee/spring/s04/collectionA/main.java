package com.coffee.spring.s04.collectionA;

import com.coffee.spring.s02.springioc.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args){
        // TODO Auto-generated method stub
        ClassPathXmlApplicationContext beanFactory=new ClassPathXmlApplicationContext("conf/conf-collection.xml");
        Customer customer=beanFactory.getBean("CustomerBean", Customer.class);
        System.out.println(customer);    }
}
