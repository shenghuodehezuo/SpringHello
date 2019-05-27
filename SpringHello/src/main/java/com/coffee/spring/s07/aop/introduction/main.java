package com.coffee.spring.s07.aop.introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("conf/conf-Introduction.xml");
        UserDaoImpl userDao= (UserDaoImpl) ctx.getBean("UserDao");
        Monitor2 mp= (Monitor2) userDao;
        mp.setMonitorActive(true);
        mp.say();
    }
}
