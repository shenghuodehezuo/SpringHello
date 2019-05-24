/**
 * <p>Title: Car.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-5-5  
* @version 1.0  
 */
package com.coffee.spring.s03.scope;

/**
 * @author hp
 *
 */
public class Car implements ICar {

	/* (non-Javadoc)
	 * @see com.coffee.spring.s03.scope.ICar#ShowCar()
	 */
	private String color;
	private String brand;
	private double price;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void ShowCar() {
		System.out.println(color+":"+brand+":"+price);

	}

}
