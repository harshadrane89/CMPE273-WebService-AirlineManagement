package com.airlinemgmt.beans;

import java.io.Serializable;

public class FlightDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String flightNum;
	private String airlineName;
	private String src;
	private String dest;
	private int numOfSeats;
	private int availableSeats;
	private String flightDate;
	private Journey[] journeyInfo;
	private Traveller[] passengerInfo;
	private Journey[] newJourney;
	
	
	public Journey[] getNewJourney() {
		return newJourney;
	}
	public void setNewJourney(Journey[] newJourney) {
		this.newJourney = newJourney;
	}
	public Traveller[] getPassengerInfo() {
		return passengerInfo;
	}
	public void setPassengerInfo(Traveller[] passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Journey[] getJourneyInfo() {
		return journeyInfo;
	}
	public void setJourneyInfo(Journey[] journeyInfo) {
		this.journeyInfo = journeyInfo;
	}
	public String getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	
	
}
