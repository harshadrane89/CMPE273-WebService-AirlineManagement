package com.airlinemgmt.beans;

import java.io.Serializable;

public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int paymentID;
	private String paymentType;
	private String fName;
	private String lName;
	private String cardNum;
	private int journeyId;
	
	
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public int getJourneyId() {
		return journeyId;
	}
	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}
	
	
}