/**
 * <p>Title: UserBean.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-3-1  
* @version 1.0  
 */
package com.coffee;
import java.io.Serializable;
public class UserBean implements Serializable {
	
	private String usn;
	private String psw;
	public UserBean() {
		super();
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	@Override
	public String toString() {
		return "UserBean [usn=" + usn + ", psw=" + psw + "]";
	}
	

}
