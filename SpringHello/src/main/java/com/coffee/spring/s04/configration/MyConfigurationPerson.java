/**
 * <p>Title: MyConfigurationPerson.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-10  
* @version 1.0  
 */
package com.coffee.spring.s04.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hp
 *
 */
@Configuration
public class MyConfigurationPerson {
	@Bean
public Person person(){
	return new Person("newliuwei",22);
}

}
