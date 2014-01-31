package com.airlinemgmt.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.Context;
import javax.naming.NamingException;

public class DBManager {
	/*
	 * final static String url = "jdbc:mysql://localhost:3306/"; final static
	 * String dbName = "AirlineManagementSystem"; final static String driver =
	 * "com.mysql.jdbc.Driver"; final static String userName = "root"; final
	 * static String password = "";
	 */
	
	
	public DBManager() {
		// TODO Auto-generated constructor stub
		try {
			connectionPool = new ConnectionPool(
					"com.mysql.jdbc.Driver",
					"jdbc:mysql://localhost:3306/AirlineManagementSystem",
					"root", "root", 10, 100, false);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static	ConnectionPool connectionPool ;
	public static DataSource dataSource;
	public static Connection conn;
//	
	public static Connection getConnection() throws Exception {
		/*
		 * Class.forName(driver).newInstance(); Connection conn =
		 * DriverManager.getConnection(url + dbName, userName, password);
		 * System.out.println("Connected to Airline ManagementSystem"); return
		 * conn;
		 */

		// InitialContext initContext;
		try {
			conn = connectionPool.getConnection();

			// Context initContext = new InitialContext();
			// // Context envContext =
			// (Context)initContext.lookup("java:comp/env");
			// dataSource =
			// (DataSource)initContext.lookup("java:comp/env/jdbc/AirlineManagementSystem");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// conn = dataSource.getConnection();
		System.out.println(conn.isClosed());
		// System.out.println("Connection:" +conn);
		return conn;
		
		
		
//		return  (new MyGenerator().getConnection());
	}

	public static void main(String[] args) {

		try {
			DBManager.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}