package com.airlinemgmt.service;

public class AirlineMgmtServiceProxy implements com.airlinemgmt.service.AirlineMgmtService {
  private String _endpoint = null;
  private com.airlinemgmt.service.AirlineMgmtService airlineMgmtService = null;
  
  public AirlineMgmtServiceProxy() {
    _initAirlineMgmtServiceProxy();
  }
  
  public AirlineMgmtServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAirlineMgmtServiceProxy();
  }
  
  private void _initAirlineMgmtServiceProxy() {
    try {
      airlineMgmtService = (new com.airlinemgmt.service.AirlineMgmtServiceServiceLocator()).getAirlineMgmtService();
      if (airlineMgmtService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)airlineMgmtService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)airlineMgmtService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (airlineMgmtService != null)
      ((javax.xml.rpc.Stub)airlineMgmtService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.airlinemgmt.service.AirlineMgmtService getAirlineMgmtService() {
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService;
  }
  
  public com.airlinemgmt.beans.AirlineEmployee getEmployeeDetailsById(java.lang.String personId) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.getEmployeeDetailsById(personId);
  }
  
  public java.lang.String validateJourney(com.airlinemgmt.beans.Journey journey) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.validateJourney(journey);
  }
  
  public com.airlinemgmt.beans.AirlineEmployee[] getEmployeeDetails(com.airlinemgmt.beans.AirlineEmployee emp) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.getEmployeeDetails(emp);
  }
  
  public java.lang.String addUpdateCustomer(com.airlinemgmt.beans.Traveller traveller, java.lang.String operation) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.addUpdateCustomer(traveller, operation);
  }
  
  public com.airlinemgmt.beans.Traveller getTravellerDetails(java.lang.String personId) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.getTravellerDetails(personId);
  }
  
  public java.lang.String addUpdateEmployee(com.airlinemgmt.beans.AirlineEmployee employee, java.lang.String operation) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.addUpdateEmployee(employee, operation);
  }
  
  public com.airlinemgmt.beans.Traveller[] getCustomerDetails(com.airlinemgmt.beans.Traveller input) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.getCustomerDetails(input);
  }
  
  public com.airlinemgmt.beans.Journey[] searchJourney(com.airlinemgmt.beans.Journey journey) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.searchJourney(journey);
  }
  
  public boolean deleteJourney(java.lang.String journeyId) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.deleteJourney(journeyId);
  }
  
  public boolean updateJourneyDetails(com.airlinemgmt.beans.Journey[] journeyObj) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.updateJourneyDetails(journeyObj);
  }
  
  public boolean createReservation(com.airlinemgmt.beans.Reservation reservationObj) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.createReservation(reservationObj);
  }
  
  public com.airlinemgmt.beans.Journey getJourneyDetails(int ticketID) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.getJourneyDetails(ticketID);
  }
  
  public java.lang.String setSessionInfo(java.lang.String username, java.lang.String loginTime) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.setSessionInfo(username, loginTime);
  }
  
  public int addUpdateJourneyDetails(com.airlinemgmt.beans.Journey journey, java.lang.String operation) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.addUpdateJourneyDetails(journey, operation);
  }
  
  public com.airlinemgmt.beans.FlightDetails[] getFlightDetails(com.airlinemgmt.beans.FlightDetails flight) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.getFlightDetails(flight);
  }
  
  public java.lang.String addUpdateFlight(com.airlinemgmt.beans.FlightDetails flight, java.lang.String operation) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.addUpdateFlight(flight, operation);
  }
  
  public com.airlinemgmt.beans.Traveller[] getListOfFlightCustomers(java.lang.String flightNum) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.getListOfFlightCustomers(flightNum);
  }
  
  public com.airlinemgmt.beans.FlightDetails[] getAllFlights() throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.getAllFlights();
  }
  
  public java.lang.String deleteAccount(java.lang.String username) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.deleteAccount(username);
  }
  
  public boolean createNewReservation(int ticketID) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.createNewReservation(ticketID);
  }
  
  public boolean deleteReservation(java.lang.String resId) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.deleteReservation(resId);
  }
  
  public com.airlinemgmt.beans.Reservation[] getReservation(java.lang.String customerId) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.getReservation(customerId);
  }
  
  public boolean cancelledReservation(int ticketID) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.cancelledReservation(ticketID);
  }
  
  public java.lang.String getSessionInfo(java.lang.String username) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.getSessionInfo(username);
  }
  
  public com.airlinemgmt.beans.Person signIn(java.lang.String uName, java.lang.String passwd) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.signIn(uName, passwd);
  }
  
  public int makePayment(com.airlinemgmt.beans.Payment payment) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.makePayment(payment);
  }
  
  public int issueTicket(int journeyId) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.issueTicket(journeyId);
  }
  
  public java.lang.String validateFlight(com.airlinemgmt.beans.FlightDetails flight) throws java.rmi.RemoteException{
    if (airlineMgmtService == null)
      _initAirlineMgmtServiceProxy();
    return airlineMgmtService.validateFlight(flight);
  }
  
  
}