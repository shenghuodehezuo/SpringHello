/**
 * <p>Title: Customer.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-9  
* @version 1.0  
 */
package com.coffee.spring.s04.configration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author hp
 *
 */
@Configuration("customer")
public class Customer {
	@Autowired
	@Qualifier("person1")
	private Person person; 

	@Autowired
	@Qualifier("person2")
	public void setPerson(Person person) {
		this.person = person;
	}
	public Person getPerson() {
		return person;
	}

	public Customer() {
		this.person=new Person("默认", 0);
	}
	public Customer(Person person) {
		super();
		this.person = person;
	}

	public void show(){
		System.out.println(this.getPerson());	
	}
	public void setName(String s){
		this.person.setName(s);
		
	}
}
