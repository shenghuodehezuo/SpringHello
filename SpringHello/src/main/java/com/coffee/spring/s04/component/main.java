/**
 * <p>Title: main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-6  
* @version 1.0  
 */
package com.coffee.spring.s04.component;

import org.springframework.beans.factory.BeanFactory;
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
   BeanFactory beanFactory=new ClassPathXmlApplicationContext("conf/conf-component.xml");
   Customer customer=beanFactory.getBean("customer", Customer.class);
   customer.show();
	}

}
