/**
 * <p>Title: Boss.java</p>  
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
public class Boss {
	  private String name ;
	    private ICar icar;
	    public Boss(){
	    }
	  

	/**
		 * @param name
		 */
		public Boss(String name) {
			super();
			this.name = name;
		}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ICar getIcar() {
			return icar;
		}


		public void setIcar(ICar icar) {
			this.icar = icar;
		}


	@Override
	    public String toString() {
	    	return "name:"+name+"\n car:"+icar;
	    }
	 
}
