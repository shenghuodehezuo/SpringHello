/**
 * <p>Title: testsql1.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2019-3-8  
* @version 1.0  
 */
package com.coffee.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.UpdatableResultSet;

public class testsql1 {
   
 public static Connection getConnection()
 {
	 Connection connection=null;
	 try {
		Class.forName("com.mysql.jdbc.Driver");//1
			connection=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jsp_db1","root","111111");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return connection;
	 
 }
	public static void Update(){
		Connection connection=getConnection();
		String sql="UPDATE tbl_user SET email='liu1@gmail.com' WHERE name='liu'";
		Statement statement=null;
		try {
			statement=connection.createStatement();
			System.out.println("update:"+statement.executeUpdate(sql));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void delete(){
		Connection connection=getConnection();
		String sql="delete from tbl_user  WHERE name='liu'";
		Statement statement=null;
		try {
			statement=connection.createStatement();
			System.out.println("delete:"+statement.executeUpdate(sql));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public static void insert() {
		Connection connection=getConnection();
		String sql="INSERT INTO tbl_user(name,email,password) VALUES('liu','liu@qq.com','111111')";
		Statement statement=null;
		try {
			statement=connection.createStatement();
			System.out.println("insert:"+statement.executeUpdate(sql));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		//insert();
		//Update();
		delete();

	}

}
