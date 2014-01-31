package com.airlinemgmt.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class DataGenerator {
	
	public boolean generateEmployeeData()
	{
		boolean result=false;
		String sql= "INSERT into airlineManagementSystem.person(fname,lname,address,city,state,zipcode,"
				+ "dob,RoleId,isActive,contactNo, userName, password) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
				
		
		try{
			con=MyGenerator.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, "John");
			ps.setString(2, "Doe");
			ps.setString(3, "74, North 1st Street");
			ps.setString(4, "San Jose");
			ps.setString(5, "CA");
			ps.setString(6, "95112");
			ps.setString(7, "01-01-10");
			ps.setString(8, "0");
			ps.setString(9, "1");
			ps.setString(10, "952-567-3267");
			ps.setString(11, "han@gmail.com");
			ps.setString(12, "123");
//			for(int i=10000;i<110000;i++)
//			{
//				System.out.println(i);
//				ps.execute();
//			}
			
			ps.close();
//			con.close();
			String sql2="insert into customer(custID,personId, passNum, Nationality, creditCardNum) values (?,?,?,?,?)";
			ps=con.prepareStatement(sql2);
			ps.setString(3,"008659534");
			ps.setString(4,"Indian");
			ps.setString(5,"1234123412341234");
			for(int i=10000;i<20000;i++)
			{
				System.out.println(i);
				ps.setString(2, (i+1)+"");
				ps.setString(1, (i+1)+"");
				ps.execute();
			}
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps!=null)
			{
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
			return result;
		
	}
	
	public static void main(String[] args) {
		new DataGenerator().generateEmployeeData();
	}

}
