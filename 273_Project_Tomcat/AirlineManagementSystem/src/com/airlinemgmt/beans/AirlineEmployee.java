package com.airlinemgmt.beans;

import java.io.Serializable;

public class AirlineEmployee extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String empId;
	private String workDesc;
	private String hireDate;
	private String position;
	private String SSN;

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getWorkDesc() {
		return workDesc;
	}

	public void setWorkDesc(String workDesc) {
		this.workDesc = workDesc;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
