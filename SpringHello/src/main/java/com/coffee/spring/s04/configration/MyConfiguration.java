/**
 * <p>Title: MyConfiguration.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-10  
* @version 1.0  
 */
package com.coffee.spring.s04.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:conf/conf-configuration.xml")
@Import(MyConfigurationPerson.class)
public class MyConfiguration {
//private Person person;
public MyConfiguration(){
	System.out.println("MyConfiguration");
}
@Bean
@Scope("prototype")
public Customer customer(){
	return new Customer();
}
}
