package com.airlinemgmt.container;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airlinemgmt.beans.FlightDetails;
import com.airlinemgmt.beans.Journey;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class ModifyFlightProcessor
 */
@WebServlet("/ModifyFlightProcessor")
public class ModifyFlightProcessor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifyFlightProcessor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		FlightDetails flight = (FlightDetails) session
				.getAttribute("flightObj");

		flight.setAirlineName(request.getParameter("fName"));
		flight.setSrc(request.getParameter("fSource"));
		flight.setDest(request.getParameter("fDestn"));
		flight.setFlightDate(request.getParameter("fTDate"));
		// flight.setFlightNum(request.getParameter("flightNumber"));
		flight.setNumOfSeats(Integer.parseInt(request.getParameter("fSeats")));

		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");

		String result = "true";
		result = proxy.validateFlight(flight);

		Journey mother = flight.getJourneyInfo()[0];
		mother.setDestinationPoint(request.getParameter("fDestn"));
		mother.setBoardingPoint(request.getParameter("fSource"));
		mother.setDepartureDate(request.getParameter("fTDate"));
		mother.setArrivalDate(request.getParameter("fLDate"));
		mother.setFare(Float.parseFloat(request.getParameter("fare")));
		flight.getJourneyInfo()[0] = mother;
		// flight.getJourneyInfo()[0].setFare(Float.parseFloat(
		// request.getParameter("fare")));

		proxy.addUpdateFlight(flight, "update");

		System.out.println("REAHCKKHOHOHHOHLJHNohj");
//		System.out.println("sijbadihgd" + flight.getNewJourney().length);
		if (flight.getNewJourney() != null) {
			System.out.println("Reached here");
			if (flight.getNewJourney().length > 0) {
				proxy.updateJourneyDetails(flight.getNewJourney());
			}
		}
		Journey ref[] = new Journey[1];
		ref[0] = flight.getJourneyInfo()[0];
		proxy.updateJourneyDetails(ref);
		session.setAttribute("flightObj", flight);
		session.setAttribute("destination", "/TwitterGUI/ViewFlight.jsp");
		session.setAttribute("leftNavBar", null);
		response.sendRedirect("TwitterGUI/Dashboard.jsp");

	}

}
