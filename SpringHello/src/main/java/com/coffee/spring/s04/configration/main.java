/**
 * <p>Title: main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-6  
* @version 1.0  
 */
package com.coffee.spring.s04.configration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hp
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
  Customer customer=(Customer) context.getBean("customer");
  customer.show();
	}

}
