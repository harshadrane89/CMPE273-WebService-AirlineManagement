package com.airlinemgmt.beans;

import java.io.Serializable;

public class Traveller extends Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String custId;
	private String passNum;
	private String nationality;
	private String creditCardNum;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getPassNum() {
		return passNum;
	}
	public void setPassNum(String passNum) {
		this.passNum = passNum;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}	
}
