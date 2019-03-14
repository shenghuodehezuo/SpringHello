/**
 * <p>Title: testsql.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-3-8  
* @version 1.0  
 */
package com.coffee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testsql {

	public static void main(String[] args) {
	 String sql="select * from tbl_user";
      Connection connection=null;
      Statement statement=null;
      ResultSet resultSet=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//1
			connection=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jsp_db1","root","111111");//2
			////////////////////////////////////////////////////////////////////////
			statement=connection.createStatement();
           resultSet=statement.executeQuery(sql);
           while (resultSet.next()) {
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("name"));
			
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally{
		try {
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
      
	
	}

}
