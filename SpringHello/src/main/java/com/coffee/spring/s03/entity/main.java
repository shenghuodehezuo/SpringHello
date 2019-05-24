/**
 * <p>Title: main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-4-29  
* @version 1.0  
 */
package com.coffee.spring.s03.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coffee.spring.s01.Person;

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
		sayHelloWorldWithInstanceFactory();
	}
	public static void sayHelloWorldWithNoArgs(){
		BeanFactory factory=new ClassPathXmlApplicationContext("classpath:**/conf-instance.xml");
		HelloWorld world=factory.getBean("helloWorldWithNoArgs", HelloWorld.class);
		world.sayHello();
	}
	public static void sayHelloWorldWithArgs(){
		BeanFactory factory=new ClassPathXmlApplicationContext("classpath:**/conf-instance.xml");
		HelloWorld world=factory.getBean("helloWorldWithArgs", HelloWorld.class);
		world.sayHello();
	}
	public static void sayHelloWorldWithStaticFactory(){
		BeanFactory factory=new ClassPathXmlApplicationContext("classpath:**/conf-instance.xml");
		HelloWorld world=factory.getBean("helloWorldStaticFactory", HelloWorld.class);
		world.sayHello();
	}
	
	public static void sayHelloWorldWithInstanceFactory(){
		BeanFactory factory=new ClassPathXmlApplicationContext("classpath:**/conf-instance.xml");
		HelloWorld world=factory.getBean("helloWorldInstance", HelloWorld.class);
		world.sayHello();
	}
}
