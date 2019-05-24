/**
 * <p>Title: 教学.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-4-25  
* @version 1.0  
 */
package com.coffee.spring.s02.ico;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coffee.spring.s01.Person;
import com.sun.org.apache.regexp.internal.recompile;



/**
 * @author hp
 *
 */
public class 教学 {
	public void teaching(){ 
		IJava教师  t=new liuwei();
	 I任课Java r=new I课程体系();
	 r.injectJavaTeacher(t);
	 ((I课程体系)r).TeachJava();
	 ///////////////////
	 I课程体系 aI课程体系=new I课程体系();
	 aI课程体系.setJt(t);
	 aI课程体系.TeachJava();
	}
	public static void main(String[] args) {
	//	教学 t教学=new 教学();
	//	t教学.teaching();
		BeanFactory factory=new ClassPathXmlApplicationContext("teaching.xml");
		I课程体系 i课程体系=factory.getBean("teaching", I课程体系.class);
		i课程体系.TeachJava();
		
	}

}
