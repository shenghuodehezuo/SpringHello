/**
 * <p>Title: AnnoExpression.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-17  
* @version 1.0  
 */
package com.coffee.spring.s05.spel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hp
 *
 */
public class AnnoExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  ApplicationContext beanFactory=new ClassPathXmlApplicationContext("conf/con-spel.xml");
	  AnnoExpression helloBean1=beanFactory.getBean("helloBean1", AnnoExpression.class);
	  AnnoExpression helloBean2=beanFactory.getBean("helloBean2", AnnoExpression.class);
 System.out.println("helloBean1:"+helloBean1.getValue());
 System.out.println("helloBean2:"+helloBean2.getValue());
	}
	
	@Value("#{'Hello'+world}")
private String value;
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
}
