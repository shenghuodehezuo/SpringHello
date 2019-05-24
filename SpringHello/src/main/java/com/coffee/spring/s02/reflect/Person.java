/**
 * <p>Title: Person.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2017-11-2  
* @version 1.0  
 */
package com.coffee.spring.s02.reflect;

/**
 * @author hp
 *
 */
public class Person {
   private String name;
   private int age;
   private String job;
/**
 * @param name
 * @param age
 * @param job
 */
   public Person() {
		super();
	}
public Person(String name, int age, String job) {
	this.name = name;
	this.age = age;
	this.job = job;
}

/**
 * 
 */


public void showPerson(){
	   System.out.println("name:"+name+";age:"+age+";job"+job);  
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

public String getJob() {
	return job;
}

public void setJob(String job) {
	this.job = job;
}
   
}
