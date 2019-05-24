/**
 * <p>Title: reflecttest.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2017-11-2  
* @version 1.0  
 */
package com.coffee.spring.s02.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author hp
 *
 */
public class reflecttest {
	@SuppressWarnings("all")
   public static Person initbydefault() throws Throwable {
	   ClassLoader loader=Thread.currentThread().getContextClassLoader();
	   Class Cperson=loader.loadClass("com.coffee.spring.s02.reflect.Person");
	   Constructor con=Cperson.getDeclaredConstructor();
	   Person person=(Person) con.newInstance();
	   Method setName=Cperson.getMethod("setName", String.class);
	   setName.invoke(person, "liuwei");
	   Method setAge=Cperson.getMethod("setAge", int.class);
	   setAge.invoke(person, 18);
	   Method setJob=Cperson.getMethod("setJob", String.class);
	   setJob.invoke(person, "教师1");
	   return person;
   }
	public static Person initbyParam() throws Throwable{
		ClassLoader loader=Thread.currentThread().getContextClassLoader();
		   Class Cperson=loader.loadClass("com.coffee.spring.s02.reflect.Person");
		   Constructor con=Cperson.getDeclaredConstructor(new Class[]{String.class,int.class,String.class});
		   Person person=(Person) con.newInstance(new Object[]{"liuwei",18,"陈许愿"});
		   return person;
		   }
	public static void main(String[] args) throws Throwable {
 //  Person p1=initbydefault();
 //  Person p2=initbyParam();
 //  p1.showPerson();
 //  p2.showPerson();
    Class<?> c=   Class.forName("com.coffee.spring.s02.reflect.Person");
    ClassLoader loader1=c.getClassLoader();
    System.out.println(loader1);
    ClassLoader loader2=Person.class.getClassLoader();
    System.out.println(loader2);
    ClassLoader loader3=Thread.currentThread().getContextClassLoader();
    System.out.println(loader3);
   // System.out.println(loader2.getParent());
  //  System.out.println(loader2.getParent().getParent());
	}

}
