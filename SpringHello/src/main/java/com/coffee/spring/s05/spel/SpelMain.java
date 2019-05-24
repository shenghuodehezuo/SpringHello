/**
 * <p>Title: SpelMain.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-17  
* @version 1.0  
 */
package com.coffee.spring.s05.spel;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hp
 *
 */
public class SpelMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSpelCounter();
	}
	
	public static void testSpelCounter() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("conf/con-spel.xml");
    	SpelMath seplMath=ctx.getBean("spelMath", SpelMath.class);
    	System.out.println(seplMath.getAdjusteAmount()+":"+seplMath.getCircum()+seplMath.getArea()+seplMath.getAverage()+seplMath.getRemaider()+seplMath.getFullname());
	}
	
	public static void testSpelClass() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("conf/con-spel.xml");
    	SeplClass seplClass=ctx.getBean("spelClass", SeplClass.class);
    	System.out.println("pi:"+seplClass.getPi());
    	System.out.println("random:"+seplClass.getRandom());
	}
    public static void testSpelLiteral(){
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("conf/con-spel.xml");
    	SeplLiteral seplLiteral=ctx.getBean("seplLiteral", SeplLiteral.class);
    
		  System.out.println("count:"+seplLiteral.getCount());
		  System.out.println("message:"+seplLiteral.getMessage());
		  System.out.println("frequency:"+seplLiteral.getFrequency());
		  System.out.println("capacity:"+seplLiteral.getCapacity());
		  System.out.println("name1:"+seplLiteral.getName1());
		  System.out.println("name2:"+seplLiteral.getName2());
		  System.out.println("enabled:"+seplLiteral.isEnabled());
    	
    }
    @Test
	public static void testSpelCityList(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("conf/con-spel.xml");
		SpelCityList seplcitylist =ctx.getBean("spelCityList",SpelCityList.class);
		System.out.println("city1:"+seplcitylist.getCity1().getName());
		System.out.println("city2:"+seplcitylist.getCity2().getName());
		System.out.println("bigCitys:"+seplcitylist.getBigCitys().size());
		System.out.println("bigcity1:"+seplcitylist.getBigcity1().getName());
		System.out.println("bigcity2:"+seplcitylist.getBigcity2().getName());
		System.out.println("cityname1:"+seplcitylist.getCityname1().size());
		System.out.println("cityname2:"+seplcitylist.getCityname2().size());
		System.out.println("cityname3:"+seplcitylist.getCityname3().size());

	}

}
