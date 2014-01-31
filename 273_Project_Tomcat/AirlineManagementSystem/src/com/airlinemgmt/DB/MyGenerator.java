package com.airlinemgmt.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class MyGenerator {
	private static String userName;
	private static String password;
	private static String url;
	private static Connection conn=null;
	public static Connection getConnection() {
		 conn = null;
		try {
			userName = "root";
			password = "root";
			url = "jdbc:mysql://localhost:3306/airlinemanagementsystem";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println(conn.isClosed());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		return conn;
	}
	
	public static void closeConnection(){
		
		try {
			if( !conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}