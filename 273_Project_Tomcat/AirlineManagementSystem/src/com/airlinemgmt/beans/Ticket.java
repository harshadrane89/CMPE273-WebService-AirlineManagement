package com.airlinemgmt.beans;

import java.io.Serializable;

public class Ticket implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ticketNum;
	private String seatNum;
	private int journeyId;
	private String paymentId;

	public int getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(int ticketNum) {
		this.ticketNum = ticketNum;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	public int getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

}
