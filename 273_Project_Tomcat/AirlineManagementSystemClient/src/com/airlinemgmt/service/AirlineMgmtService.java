/**
 * AirlineMgmtService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.airlinemgmt.service;

public interface AirlineMgmtService extends java.rmi.Remote {
    public com.airlinemgmt.beans.AirlineEmployee getEmployeeDetailsById(java.lang.String personId) throws java.rmi.RemoteException;
    public java.lang.String validateJourney(com.airlinemgmt.beans.Journey journey) throws java.rmi.RemoteException;
    public com.airlinemgmt.beans.AirlineEmployee[] getEmployeeDetails(com.airlinemgmt.beans.AirlineEmployee emp) throws java.rmi.RemoteException;
    public java.lang.String addUpdateCustomer(com.airlinemgmt.beans.Traveller traveller, java.lang.String operation) throws java.rmi.RemoteException;
    public com.airlinemgmt.beans.Traveller getTravellerDetails(java.lang.String personId) throws java.rmi.RemoteException;
    public java.lang.String addUpdateEmployee(com.airlinemgmt.beans.AirlineEmployee employee, java.lang.String operation) throws java.rmi.RemoteException;
    public com.airlinemgmt.beans.Traveller[] getCustomerDetails(com.airlinemgmt.beans.Traveller input) throws java.rmi.RemoteException;
    public com.airlinemgmt.beans.Journey[] searchJourney(com.airlinemgmt.beans.Journey journey) throws java.rmi.RemoteException;
    public boolean deleteJourney(java.lang.String journeyId) throws java.rmi.RemoteException;
    public boolean updateJourneyDetails(com.airlinemgmt.beans.Journey[] journeyObj) throws java.rmi.RemoteException;
    public boolean createReservation(com.airlinemgmt.beans.Reservation reservationObj) throws java.rmi.RemoteException;
    public com.airlinemgmt.beans.Journey getJourneyDetails(int ticketID) throws java.rmi.RemoteException;
    public java.lang.String setSessionInfo(java.lang.String username, java.lang.String loginTime) throws java.rmi.RemoteException;
    public int addUpdateJourneyDetails(com.airlinemgmt.beans.Journey journey, java.lang.String operation) throws java.rmi.RemoteException;
    public com.airlinemgmt.beans.FlightDetails[] getFlightDetails(com.airlinemgmt.beans.FlightDetails flight) throws java.rmi.RemoteException;
    public java.lang.String addUpdateFlight(com.airlinemgmt.beans.FlightDetails flight, java.lang.String operation) throws java.rmi.RemoteException;
    public com.airlinemgmt.beans.Traveller[] getListOfFlightCustomers(java.lang.String flightNum) throws java.rmi.RemoteException;
    public com.airlinemgmt.beans.FlightDetails[] getAllFlights() throws java.rmi.RemoteException;
    public java.lang.String deleteAccount(java.lang.String username) throws java.rmi.RemoteException;
    public boolean createNewReservation(int ticketID) throws java.rmi.RemoteException;
    public boolean deleteReservation(java.lang.String resId) throws java.rmi.RemoteException;
    public com.airlinemgmt.beans.Reservation[] getReservation(java.lang.String customerId) throws java.rmi.RemoteException;
    public boolean cancelledReservation(int ticketID) throws java.rmi.RemoteException;
    public java.lang.String getSessionInfo(java.lang.String username) throws java.rmi.RemoteException;
    public com.airlinemgmt.beans.Person signIn(java.lang.String uName, java.lang.String passwd) throws java.rmi.RemoteException;
    public int makePayment(com.airlinemgmt.beans.Payment payment) throws java.rmi.RemoteException;
    public int issueTicket(int journeyId) throws java.rmi.RemoteException;
    public java.lang.String validateFlight(com.airlinemgmt.beans.FlightDetails flight) throws java.rmi.RemoteException;
}