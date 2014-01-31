package com.airlinemgmt.beans;

import java.io.Serializable;

public class Journey implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int journeyId;
	private String custId;
	private String flightNum;
	private String destinationPoint;
	private String boardingPoint;
	private String arrivalDate;
	private String departureDate;
	private float fare;
	private int isActive;
	private int numberOfSeats;
	private String airline;
	
	private String minFare;
	private String maxFare;
	
	
	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	
	public String getMinFare() {
		return minFare;
	}

	public void setMinFare(String minFare) {
		this.minFare = minFare;
	}

	public String getMaxFare() {
		return maxFare;
	}

	public void setMaxFare(String maxFare) {
		this.maxFare = maxFare;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}


	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}


	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

}
