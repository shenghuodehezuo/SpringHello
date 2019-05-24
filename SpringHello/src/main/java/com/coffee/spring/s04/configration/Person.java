/**
 * <p>Title: Peron.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-6  
* @version 1.0  
 */
package com.coffee.spring.s04.configration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
 private String name;	
 private int age;
 public Person(){}
public Person(String name, int age) {
	//super();
	this.name = name;
	this.age = age;
	System.out.println(name+"我有名字啦！"+age);
}

	@PostConstruct
public void init(){
	System.out.println(name+"我活啦！"+age);
}
@PreDestroy
 public void die(){

 	System.out.println(name+"我死啦！"+age);
 }

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
@Override
	public String toString() {
		return "Person(name=" + this.getName() + ", age=" + this.getAge() + ")";
	}
}
