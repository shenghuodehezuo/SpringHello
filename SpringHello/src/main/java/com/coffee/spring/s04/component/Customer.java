/**
 * <p>Title: Customer.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-9  
* @version 1.0  
 */
package com.coffee.spring.s04.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author hp
 *
 */

//@Scope("prototype")
@Component("customer")
public class Customer {
	
	
	private Person person;
	 /**
	 * @param person the person to set
	 */
	 
	@Required
	@Autowired
	public void setPerson(@Qualifier("person")Person person) {
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
