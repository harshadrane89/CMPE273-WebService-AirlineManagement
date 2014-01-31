package com.airlinemgmt.cache;

import java.util.ArrayList;
import java.util.List;

import com.airlinemgmt.DAO.CustomerDAO;
import com.airlinemgmt.DAO.EmployeeDAO;
import com.airlinemgmt.DAO.FlightDetailsDAO;
import com.airlinemgmt.beans.AirlineEmployee;
import com.airlinemgmt.beans.FlightDetails;
import com.airlinemgmt.beans.Reservation;
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.service.AirlineMgmtService;

public class CacheObject {
	public static AirlineEmployee[] airlineEmployee;
	public static Traveller[] traveller;
	public static FlightDetails[] flight;
	public static List<AirlineEmployee> empList = new ArrayList<AirlineEmployee>();
	public static List<Traveller> custList = new ArrayList<Traveller>();
	public static List<FlightDetails> flightList = new ArrayList<FlightDetails>();
	private AirlineMgmtService service = new AirlineMgmtService();

	public static  void getCachedEmployees() {

		EmployeeDAO empDao = new EmployeeDAO();
		airlineEmployee = empDao.getAllEmployees();
		System.out.println("****Employee Array Size*****"
				+ airlineEmployee.length);
		for (AirlineEmployee temp : airlineEmployee) {
			empList.add(temp);
		}
	}

	public  static void getCachedCustomers() {

		CustomerDAO custDao = new CustomerDAO();
		traveller = custDao.getAllCustomers(true);
		System.out.println("****Customer Array Size*****" + traveller.length);
		for (Traveller temp : traveller) {
			custList.add(temp);
		}
	}

	public static void getCachedFlights() {

		FlightDetailsDAO service = new FlightDetailsDAO();
		flight = service.getAllFlights(true);
		System.out.println("****Flight Array Size*****" + flight.length);
		for (FlightDetails temp : flight) {
			flightList.add(temp);
		}
	}
}