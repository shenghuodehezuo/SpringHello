/**
 * <p>Title: Person.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-4-22  
* @version 1.0  
 */
package com.coffee.spring.s01;

/**
 * @author hp
 *
 */
public class Person {
	//Constructor
	
	//Field
 private IHello hellomessage;

 
 //Method
public IHello getHellomessage() {
	return hellomessage;
}

public void setHellomessage(IHello hellomessage) {
	this.hellomessage = hellomessage;
}
 public String sayHello(){
	 return this.hellomessage.sayHello();
	 
 }
}
