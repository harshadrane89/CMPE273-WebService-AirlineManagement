package com.airlinemgmt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.airlinemgmt.DB.DBManager;
import com.airlinemgmt.beans.Person;
import com.sun.org.apache.regexp.internal.recompile;

public class PersonDAO {

	
	public boolean validateExistingUser(String userName) {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		boolean result = false;
		try {
			String sql = "SELECT * FROM PERSON WHERE USERNAME =(?)";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userName);

			rs = ps.executeQuery();

			while (rs.next()) {
				
				result=true;
				
			}

		} catch (Exception e) {
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
			if(rs!=null)
			{
				try {
					rs.close();
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
		}
		
		return result;
	}
	
	
	public Person validateUser(String userName, String password) {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Person personObj = null;
		try {
			String sql = "SELECT * FROM PERSON WHERE USERNAME =(?) AND PASSWORD =(?)";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, password);

			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("IsActive"));
				if (rs.getString("IsActive").equalsIgnoreCase("true")) {

					personObj = new Person();
					personObj.setPersonId(rs.getInt("PersonId"));
					personObj.setfName(rs.getString("FName"));
					personObj.setlName(rs.getString("LName"));
					personObj.setCity(rs.getString("Address"));
					personObj.setState(rs.getString("State"));
					personObj.setZipCode(rs.getString("ZipCode"));
					personObj.setDob(rs.getString("DOB"));
					personObj.setRoleId(rs.getString("RoleId"));
					personObj.setContactNo(rs.getString("contactNo"));
					personObj.setUserName(rs.getString("userName"));
					personObj.setPassword(rs.getString("password"));
					
				}
				System.out.println("IN PERSON DAO");
			}

		} catch (Exception e) {
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
			if(rs!=null)
			{
				try {
					rs.close();
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
		}
		
		return personObj;
	}

}
