/**
 * <p>Title: HelloWorldStaticFactory.java</p>  
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
public class HelloWorldStaticFactory {
  public static HelloWorld newInstance(String message){
	  return new HelloWorldImpl(message);
  }
}
