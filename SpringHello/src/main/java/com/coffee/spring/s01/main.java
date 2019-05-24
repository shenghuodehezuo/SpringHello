/**
 * <p>Title: main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-4-22  
* @version 1.0  
 */
package com.coffee.spring.s01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * @author hp
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Resource resource=new FileSystemResource("HelloMessage.xml");
		//BeanFactory factory=new XmlBeanFactory(resource);
		BeanFactory factory=new ClassPathXmlApplicationContext("classpath:**/Hello*.xml");
		Person person=factory.getBean("alias5", Person.class);
		String s=person.sayHello();
		System.out.println(s);

	}

}
