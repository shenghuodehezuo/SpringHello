/**
 * <p>Title: XmlExpression.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-17  
* @version 1.0  
 */
package com.coffee.spring.s05.spel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hp
 *
 */
public class XmlExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("conf/con-spel.xml");
		  String hello1=beanFactory.getBean("hello1",String.class);
		  String hello2=beanFactory.getBean("hello2",String.class);
		  String hello3=beanFactory.getBean("hello3",String.class);
		  System.out.println("hello1:"+hello1);
		  System.out.println("hello2:"+hello2);
		  System.out.println("hello3:"+hello3);

	}



}
