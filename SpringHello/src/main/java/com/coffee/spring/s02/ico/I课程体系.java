/**
 * <p>Title: I课程体系.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-4-25  
* @version 1.0  
 */
package com.coffee.spring.s02.ico;

/**
 * @author hp
 *
 */
public class I课程体系 implements I任课Java {
 private IJava教师 jt;
public void setJt(IJava教师 jt) {
	this.jt = jt;
}
	@Override
	public void injectJavaTeacher(IJava教师 JT) {
		this.jt=JT;
	}
 public void TeachJava(){
	  System.out.println("Java:"+jt.TeachJava());
	 
 }
}
