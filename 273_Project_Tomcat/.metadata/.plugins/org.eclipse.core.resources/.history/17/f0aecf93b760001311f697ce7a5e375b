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
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class FlightProcessorServlet
 */
@WebServlet("/FlightProcessorServlet")
public class FlightProcessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FlightProcessorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		FlightDetails flight = new FlightDetails();
		flight.setAirlineName(request.getParameter("fName"));
		flight.setSrc(request.getParameter("fSource"));
		flight.setDest(request.getParameter("fDestn"));
		flight.setFlightDate(request.getParameter("fTDate"));
		flight.setFlightNum(request.getParameter("flightNumber"));
		flight.setNumOfSeats(Integer.parseInt(request.getParameter("fSeats")));

		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		String result = proxy.validateFlight(flight);
		if (result == null) {

			Journey[] ref = new Journey[1];
			ref[0] = new Journey();
			ref[0].setAirline(flight.getAirlineName());
			ref[0].setFlightNum(flight.getFlightNum());
			ref[0].setBoardingPoint(flight.getSrc());
			ref[0].setDestinationPoint(flight.getDest());
			ref[0].setDepartureDate(flight.getFlightDate());
			ref[0].setArrivalDate((String) request.getParameter("fLDate"));
			ref[0].setFare(Float.parseFloat(request.getParameter("fare")));
			ref[0].setIsActive(1);
			result = proxy.validateJourney(ref[0]);
			System.out.println("RESJbdojadhojdocksdhjcldkcbdjhbfdoich"+result);
			if (result.equalsIgnoreCase("true")) {
				flight.setJourneyInfo(ref);
				session.setAttribute("newFlight", flight);
				session.setAttribute("error", "");
				session.setAttribute("destination",
						"/TwitterGUI/AddJourney.jsp");
				response.sendRedirect("TwitterGUI/Dashboard.jsp");
			} else {
				session.setAttribute("newFlight", flight);
				session.setAttribute("error", result);
				response.sendRedirect("TwitterGUI/Dashboard.jsp");
			}

		} else {
			session.setAttribute("newFlight", flight);
			session.setAttribute("error", result);
			response.sendRedirect("TwitterGUI/Dashboard.jsp");
		}
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
				.getAttribute("newFlight");
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		proxy.addUpdateFlight(flight, "insert");
		session.setAttribute("destination", "/TwitterGUI/SuccessFlight.jsp");
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	}

}
