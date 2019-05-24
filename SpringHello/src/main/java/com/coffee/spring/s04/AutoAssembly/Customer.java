/**
 * <p>Title: Customer.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-6  
* @version 1.0  
 */
package com.coffee.spring.s04.AutoAssembly;

/**
 * @author hp
 *
 */
public class Customer {
 private Person person;
 /**
 * @param person the person to set
 */
 
 
public void setPerson(Person person) {
	this.person = person;
}
/**
 * @param person
 */
public Customer() {
}
public Customer(Person person) {
	super();
	this.person = person;
}

public void show(){
	System.out.println(person.toString());
	
}
}
