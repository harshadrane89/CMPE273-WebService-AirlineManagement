package com.airlinemgmt.service;

import java.sql.SQLException;
import java.text.ParseException;

import javax.jws.WebService;

import com.airlinemgmt.DAO.CustomerDAO;
import com.airlinemgmt.DAO.EmployeeDAO;
import com.airlinemgmt.DAO.FlightDetailsDAO;
import com.airlinemgmt.DAO.JourneyDAO;
import com.airlinemgmt.DAO.PersonDAO;
import com.airlinemgmt.DAO.ReservationDAO;
import com.airlinemgmt.beans.AirlineEmployee;
import com.airlinemgmt.beans.FlightDetails;
import com.airlinemgmt.beans.Journey;
import com.airlinemgmt.beans.Payment;
import com.airlinemgmt.beans.Person;
import com.airlinemgmt.beans.Reservation;
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.validations.Validations;

@WebService
public class AirlineMgmtService {

	public Person signIn(String uName, String passwd) {
		Person personObj = null;
		PersonDAO personDAO = new PersonDAO();
		personObj = personDAO.validateUser(uName, passwd);
		return personObj;
	}

	public AirlineEmployee getEmployeeDetailsById(String personId) {
		AirlineEmployee emp = null;
		EmployeeDAO empDAO = new EmployeeDAO();
		emp = empDAO.searchEmployeeById(personId);
		return emp;
	}

	public Traveller getTravellerDetails(String personId) {
		Traveller travellerObj = null;
		CustomerDAO customerDAO = new CustomerDAO();
		travellerObj = customerDAO.getTravellerDetails(personId);
		return travellerObj;
	}

	public String validateJourney(Journey journey) {
		JourneyDAO jDao = new JourneyDAO();
		String result = jDao.validateFields(journey);
		return result;
	}

	public String addUpdateEmployee(AirlineEmployee employee, String operation) {

		EmployeeDAO empDao = new EmployeeDAO();
		String result = empDao.validateFields(employee);
		if (result.equalsIgnoreCase("true")) {
			if (operation.equalsIgnoreCase("insert")) {
				if (empDao.insertEmployee(employee)) {
					return "true";
				}
			} else if (operation.equalsIgnoreCase("update")) {
				if (empDao.updateEmployee(employee)) {
					return "true";
				}
			} else if (operation.equalsIgnoreCase("delete")) {

				if (empDao.deleteEmployee(employee.getPersonId())) {
					return "true";
				}
			}
		}

		return result;

	}

	public AirlineEmployee[] getEmployeeDetails(AirlineEmployee emp) {
		EmployeeDAO employee = new EmployeeDAO();
		return employee.searchEmployee(emp);
	}

	public String addUpdateCustomer(Traveller traveller, String operation) {
		CustomerDAO customerDao = new CustomerDAO();
		String result = customerDao.validateFields(traveller);
		if (result.equalsIgnoreCase("true")) {
			if (operation.equalsIgnoreCase("insert")) {
				if (customerDao.insertPersonDetails(traveller)) {
					return "true";
				}

			} else {
				if (customerDao.updatePersonDetails(traveller)) {
					return "true";
				}

			}
		} else {
			return result;
		}
		return "true";
	}

	public Traveller[] getCustomerDetails(Traveller input) {
		Traveller[] customerList = null;
		CustomerDAO customerDao = new CustomerDAO();
		customerList = customerDao.getCustomerDetails(input);
		return customerList;
	}

	public Journey[] searchJourney(Journey journey) {
		JourneyDAO journeyDAO = new JourneyDAO();
		return journeyDAO.searchJourney(journey);
	}

	public boolean deleteJourney(String journeyId) {
		JourneyDAO journeyDAO = new JourneyDAO();
		return journeyDAO.deleteJourneyInfo(journeyId);
	}

	public boolean updateJourneyDetails(Journey[] journeyObj) {
		JourneyDAO journeyDAO = new JourneyDAO();
		return journeyDAO.processJourneyInfo(journeyObj);
	}

	public boolean createReservation(Reservation reservationObj) {
		ReservationDAO reservationDAO = new ReservationDAO();
		return reservationDAO.createReservation(reservationObj);
	}

	public boolean deleteReservation(String resId) {
		ReservationDAO reservationDAO = new ReservationDAO();
		return reservationDAO.deleteReservation(resId);
	}

	public Reservation[] getReservation(String customerId) {
		Reservation[] reservationObj = null;
		ReservationDAO reservationDAO = new ReservationDAO();
		if (!customerId.equalsIgnoreCase("")) {
			reservationObj = reservationDAO.getPassengerReservation(customerId);
		} else {
			reservationObj = reservationDAO.getAllReservation();
		}

		return reservationObj;
	}

	
	
	public String validateFlight(FlightDetails flight)
	{
		return new FlightDetailsDAO().validateFlight(flight); 
	}
	
	public String addUpdateFlight(FlightDetails flight, String operation)
			throws ParseException {

		FlightDetailsDAO flightDao = new FlightDetailsDAO();
		String result = "";
		if (result != null) {
			System.out.println("PErforming the operation:" + operation);
			if (operation.equalsIgnoreCase("insert")) {// Insert Record

				if (flightDao.insertFlightDetails(flight)) {
					return "true";
				}
			} else if (operation.equalsIgnoreCase("update")) {// Update Record
				if (flightDao.updateFlightDetails(flight)) {
					return  "true";
				}
			} else {// Delete Flight
				/*
				 * int personId = Integer.parseInt(operation);
				 * if(empDao.deleteEmployee(personId)){ return true;
				 */
			}
		}
		return result;
	}

	public FlightDetails[] getAllFlights() {
		FlightDetailsDAO fd = new FlightDetailsDAO();
		return fd.getAllFlights(false);
	}

	// Returns details of a flight based on search parameter
	public FlightDetails[] getFlightDetails(FlightDetails flight) {
		FlightDetailsDAO fd = new FlightDetailsDAO();
		if (flight != null) {
			return fd.getFlightDetails(flight.getAirlineName(),
					flight.getFlightNum(), flight.getSrc(), flight.getDest(),
					flight.getNumOfSeats(), flight.getFlightDate());
		} else {
			return fd.getAllFlights(false);
		}
	}

	// Not used

	public String setSessionInfo(String username, String loginTime) {
		System.out.println("Inside set Session Information");
		String result;
		CustomerDAO customerDao = new CustomerDAO();
		result = customerDao.setSessionInfo(username, loginTime);
		return result;
	}

	public String getSessionInfo(String username) throws SQLException {
		System.out.println("Inside get Session Information");
		String result;
		CustomerDAO customerDao = new CustomerDAO();
		result = customerDao.getSessionInfo(username);
		return result;
	}

	public int addUpdateJourneyDetails(Journey journey, String operation) {
		return 0;// journeyID
	}

	public int makePayment(Payment payment) {
		return 0;// ticketNum
	}

	public int issueTicket(int journeyId) {
		return 0;
	}

	public boolean createNewReservation(int ticketID) {
		return true;
	}

	public boolean cancelledReservation(int ticketID) {
		return true;
	}

	public Journey getJourneyDetails(int ticketID) {
		return null;
	}

	public Traveller[] getListOfFlightCustomers(String flightNum) {
		return null;

	}

	public String deleteAccount(String username) {
		String result;
		CustomerDAO customerDao = new CustomerDAO();
		result = customerDao.deleteAccount(username);
		return result;
	}
}
