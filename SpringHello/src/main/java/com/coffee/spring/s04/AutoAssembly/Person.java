/**
 * <p>Title: Peron.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-6  
* @version 1.0  
 */
package com.coffee.spring.s04.AutoAssembly;
public class Person {
 private String name;
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

 
}
