/**
 * <p>Title: HelloWorldImpl.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-4-29  
* @version 1.0  
 */
package com.coffee.spring.s03.entity;

/**
 * @author hp
 *
 */
public class HelloWorldImpl implements HelloWorld {
    private String message;
    
    public HelloWorldImpl(){
    	this.message="Hello World";
    	
    }
    public HelloWorldImpl( String message){
    	this.message=message;
    }
	/* (non-Javadoc)
	 * @see com.coffee.spring.s03.entity.HelloWorld#sayHello()
	 */
	@Override
	public void sayHello() {
		System.out.println(message);

	}

}
