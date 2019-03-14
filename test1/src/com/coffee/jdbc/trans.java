/**
 * <p>Title: trans.java</p>  
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

public class trans {
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
		public static void insertuser(Connection connection) throws SQLException {
			//Connection connection=getConnection();
			String sql="INSERT INTO tbl_user(id,name,email,password) VALUES(5,'liu5','liu5@qq.com','111111')";
			Statement statement=null;

				statement=connection.createStatement();
				System.out.println("insert user:"+statement.executeUpdate(sql));
			
		
		}
		public static void insertaddress(Connection connection) throws SQLException {
			//Connection connection=getConnection();
			String sql="INSERT INTO tbl_address(id,city,country,user_id) VALUES(1,'nanjin','china',5)";
			Statement statement=null;
			
				statement=connection.createStatement();
				System.out.println("insert address:"+statement.executeUpdate(sql));
			
			
		}
	public static void main(String[] args) {
		Connection connection=null;
		connection=getConnection();
		try {
			insertuser(connection);
			insertaddress(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
