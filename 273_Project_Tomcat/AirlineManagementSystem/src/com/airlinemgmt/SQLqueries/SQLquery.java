package com.airlinemgmt.SQLqueries;

public interface SQLquery {

	// Person(anup)
	String insertPersonDetail = "INSERT into airlineManagementSystem.person(fname,lname,address,city,state,zipcode,"
			+ "dob,RoleId,isActive,contactNo, userName, password) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

	// person(neha)
	String insertPersonDetails = "INSERT into AirlineManagementSystem.Person(fname,lname,username,password,address,city,state,zipcode,dob,roleId) VALUES(?,?,?,?,?,?,?,?,?,?)";

	String getPersonID = "SELECT personId from airlineManagementSystem.person where fname=? and lname=? and address=?";

	// Customer (its a traveller)
	String insertCustomerDetails = "INSERT into airlineManagementSystem.customer(personId,passNum,nationality,"
			+ "creditCardNum) VALUES(?,?,?,?)";

	// AirlineEmployee //personid,workdesc,hiredate, workpos, ssn
	String insertAirlineEmploee = "insert into airlineEmployee(personId, WorkDesc, HireDate, WorkPosition, SSN) values (?,?,?,?,?)";

	String getMaxPersonId = "select MAX(PersonId) from airlineManagementSystem.person";

	String updatePerson = "update person set fname = ?,lname = ?,address = ?,city = ?,state = ?,zipcode = ?,"
			+ "dob = ?,contactNo = ? where PersonId = ?";

	String updateEmployee = "update airlineemployee set WorkDesc = ?, HireDate = ?, WorkPosition = ? where PersonId = ?";

	String searchPersonById = "select * from person p, airlineemployee a where p.PersonId = a.PersonId and p.PersonId = ?;";
	String deletePerson = "update person set IsActive = 0 where PersonId = ?";

	// FlightDetails
	String getAllFlights = "SELECT * FROM  airlineManagementSystem.flightdetails";
	String searchFlightDetails = "call sp_getFlightDetails(?,?,?,?,?,?)";
	String insertFlightDetails = "INSERT into airlineManagementSystem.flightDetails(flightNum,airlineName,src,dest,numOfSeats,flightDate,availableSeats)"
			+ " VALUES(?,?,?,?,?,?,?)";
	String deleteFlight = "delete from person where flightId = ?";
	String updateFlight = "update airlineManagementSystem.flightdetails set src = ?, dest = ?, flightDate = ?,airlineName=?,numOfSeats=? WHERE flightNum=?";

	// Person
	String updatePersonDetails = "Update person set fname=?, lname=?, address=?, city=?, state=?, zipcode=?,dob=?,contactNo=?,username=?,password=? WHERE PERSONID=? ";
	/**
	 * All Customer
	 */
	String getAllCustomers = "SELECT * from person p, customer c where p.PersonId = c.PersonId";
	/**
	 * All Employee
	 */
	String getAllEmployees = "SELECT * from airlineemployee e, person p where e.PersonId = p.PersonId";
	/**
	 * All Reservations
	 */
	String getAllReservations = "SELECT * from reservation";

	String customerSignIn = "SELECT password, rollId, isActive FROM person WHERE username=?";

	// Session
	String updateSessionInfo = "UPDATE UserSession set loginTime= ? where username= ?";
	String insertIntoSessioninfo = "INSERT into UserSession (username, loginTime) values (?,?)";
	String getSessionInfo = "SELECT loginTime FROM UserSession WHERE username= ?";

	// Search
	String searchByName = "SELECT person.LName, person.Address, person.State, person.City, person.ZipCode, person.DOB, customer.custId, customer.passNum, customer.nationality, customer.creditCardNum FROM person INNER JOIN customer ON person.PersonID=customer.personID Where person.FName = ?";
	String searchByLastName = "SELECT Person.fname, Person.addresss, Person.state, Person.city, Person.zipcode, Person.dob, customer.custId, customer.passNum FROM Person INNER JOIN customer ON Person.personID=customer.personID Where Person.lname = ?";
	String searchByState = "SELECT Person.fname, Person.lname, Person.address, Person.city, Person.zipcode, Person.dob, customer.custId, customer.passNum FROM Person INNER JOIN customer ON Person.personID=customer.personID Where Person.state = ?";
	String searchByCity = "SELECT Person.fname, Person.lname, Person.address, Person.state, Person.zipcode, Person.dob, customer.custId, customer.passNum FROM Person INNER JOIN customer ON Person.personID=customer.personID Where Person.city = ?";

	String searchByElements = "SELECT person.FName, person.LName, person.Address, person.City, person.State, person.ZipCode, person.DOB, customer.CustId, customer.passNum FROM person INNER JOIN customer ON person.PersonId=customer.personID Where Person.city = ?";
	// String viewProfile =
	// "SELECT Person.fname,Person.lname, Person.address, Person.state, Person.city, Person.zipcode, Person.dob,customer.custId,customer.passNum, customer.nationality, customer.creditCardNum FROM Person INNER JOIN customer ON Person.personID=customer.personID Where person.username = ?";
	String viewProfile = "SELECT * FROM Person INNER JOIN customer ON Person.personID=customer.personID Where person.username = ?";

	// Delete account
	String deleteAccount = "UPDATE person set isActive = 0 where PersonId= ?";

	/**
	 * Create Customer Journey
	 */
	String insertCustomerJourney = "INSERT into AirlineManagementSystem.journey(custId,flightNum,destinationPoint,boardingPoint,departureDate,arrivalDate,fare) VALUES(?,?,?,?,?,?,?)";

	/**
	 * Create Customer Ticket
	 */
	String insertCustomerTicket = "INSERT into AirlineManagementSystem.ticket(ticketNum,seatNum,journeyId,paymentId) VALUES(?,?,?,?)";

	/**
	 * Create Customer Reservation
	 */
	String insertCustomerReservation = "INSERT into AirlineManagementSystem.reservation(journeyId,reservationDate,paymentId,ticketId) VALUES(?,?,?,?)";

}
