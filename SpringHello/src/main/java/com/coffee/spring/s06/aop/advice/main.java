package com.coffee.spring.s06.aop.advice;

import java.sql.SQLException;

import javax.swing.table.TableColumn;

import org.aopalliance.aop.Advice;
import org.junit.Test;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coffee.spring.s06.aop.aspect.Student;

public class main {
    public static void main(String[] args) {
        ThrowsAdviceByXML();
    }

    public static void ThrowsAdviceByXML() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("conf/conf-advice.xml");
        StudentServer studentServer=(StudentServer) ctx.getBean("ProxyFactory");
        studentServer.removeStu(1);
        studentServer.updateStu(new StudentImpl("weiliu", 10, 5));

    }

    public static void AdvicestestXML() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("conf/conf-advice.xml");
        IStudent stu=(IStudent) ctx.getBean("proxy");
        stu.run("coffeerun");
        //stu.sleep("coffeesleep");
    }
    public static void Advicestest(){
        IStudent stu=new StudentImpl("liuwei", 20, 1);
        BeforeAdvice advice=new BeforeAdvice1();
        BeforeAdvice advice1=new BeforeAdvice2();
        AfterAdvice1 afterAdvice=new AfterAdvice1();
        AroundAdvise aroundAdvise=new AroundAdvise();
        ProxyFactory pf=new ProxyFactory();
        pf.setOptimize(true);//cglib
        pf.setTarget(stu);
        pf.addAdvice(0, advice);pf.addAdvice(1, advice1);
        pf.addAdvice(afterAdvice);pf.addAdvice((Advice) aroundAdvise);
        IStudent proxyIStudent=(IStudent) pf.getProxy();
        proxyIStudent.study("liuweistudy");
//    	proxyIStudent.sleep("liuweisleep");
//    	proxyIStudent.run("liuweirun");

    }

    public static void ThrowsAdviceByCode() {
        IStudent stu=new StudentImpl("coffeliu", 18, 1);
        StudentServer studentServer=new StudentServer();
        TransactionManager transactionManager=new TransactionManager();
        ProxyFactory pf=new ProxyFactory();
        //cglib
        pf.setOptimize(true);
        pf.setTarget(studentServer);
        pf.addAdvice(transactionManager);
        StudentServer studentServer2=(StudentServer) pf.getProxy();

        studentServer2.updateStu(stu);

    }
}
