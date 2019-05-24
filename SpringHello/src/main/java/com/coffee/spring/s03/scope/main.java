/**
 * <p>Title: main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-5  
* @version 1.0  
 */
package com.coffee.spring.s03.scope;

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
		BeanFactory beanFactory = 
				new ClassPathXmlApplicationContext("conf/conf-scope.xml");
		Boss boss1 = beanFactory.getBean("boss1", Boss.class);
		Boss boss2 = beanFactory.getBean("boss2", Boss.class);
		Boss boss3 = beanFactory.getBean("boss3", Boss.class);
		System.out.println(boss1.getIcar()+"!"+boss1);
		System.out.println(boss2.getIcar()+"!"+boss2);
		System.out.println(boss3.getIcar()+"!"+boss3);

	}

}
