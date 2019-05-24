/**
 * <p>Title: Peron.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-6  
* @version 1.0  
 */
package com.coffee.spring.s04.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("person")
public class Person {
	@Value("liuwei")
 private String name;
	@Value("18")
 private int age;
 public Person(){}
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Peron [name=" + name + ", age=" + age + "]";
}
public void init(){
	System.out.println(name+"我活啦！");
}
 public void die(){
	 System.out.println(name+"我死啦！");
 }
 @PostConstruct  
 public void init1(){
		System.out.println(name+"我活啦1！");
	}
 @PreDestroy
	 public void die1(){
		 System.out.println(name+"我死啦1！");
	 }
}
