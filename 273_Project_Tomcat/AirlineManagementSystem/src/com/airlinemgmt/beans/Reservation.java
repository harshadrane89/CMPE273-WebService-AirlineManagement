package com.airlinemgmt.beans;

import java.io.Serializable;

public class Reservation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerId;
	private int reservationId;
	private int journeyId;
	private String reservationDate;
	private int paymentId;
	private Traveller traveller;
	private Traveller[] passenger;
	private int isActive;
	private String creditCardNumber;
	private String expDate;
	private String cardCode;
	private Journey journeyInfo;
	private float fare;
	
	
	public Traveller getTraveller() {
		return traveller;
	}
	public void setTraveller(Traveller traveller) {
		this.traveller = traveller;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	public Journey getJourneyInfo() {
		return journeyInfo;
	}
	public void setJourneyInfo(Journey journeyInfo) {
		this.journeyInfo = journeyInfo;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCardCode() {
		return cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public Traveller[] getPassenger() {
		return passenger;
	}
	public void setPassenger(Traveller[] passenger) {
		this.passenger = passenger;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public int getJourneyId() {
		return journeyId;
	}
	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}
	public String getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	
	
}
