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
 * Servlet implementation class NewJourneyServlet
 */
@WebServlet("/NewJourneyServlet")
public class NewJourneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NewJourneyServlet() {
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
		HttpSession session = request.getSession();
		FlightDetails flight = (FlightDetails) session
				.getAttribute("newFlight");
		Journey[] journey = flight.getJourneyInfo();
		Journey[] temp = new Journey[journey.length - 1];

		int index = 0;
		for (int i = 0; i < journey.length; i++) {
			if (request.getParameter(i + "") == null) {
				temp[index++] = journey[i];
			}
		}
		flight.setJourneyInfo(temp);
		session.setAttribute("newFlight", flight);
		session.setAttribute("destination", "/TwitterGUI/AddJourney.jsp");
		session.setAttribute("leftNavBar", null);
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		Journey journey = new Journey();

		journey.setBoardingPoint(request.getParameter("src"));
		journey.setDestinationPoint(request.getParameter("dest"));
		journey.setArrivalDate(request.getParameter("arrDate"));
		journey.setDepartureDate(request.getParameter("deptDate"));
		journey.setFare(Float.parseFloat(request.getParameter("fare")));
		FlightDetails flight = (FlightDetails) session
				.getAttribute("newFlight");
		journey.setAirline(flight.getAirlineName());
		journey.setFlightNum(flight.getFlightNum());

		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		String result = "true";
		result = proxy.validateJourney(journey);
		if (result.equalsIgnoreCase("true")) {

			Journey[] jArray = flight.getJourneyInfo();
			boolean cont = true;
			for (Journey ref : jArray) {
				if ((ref.getBoardingPoint().equalsIgnoreCase(journey
						.getBoardingPoint()))
						&& (ref.getDestinationPoint().equalsIgnoreCase(journey
								.getDestinationPoint()))) {
					cont = false;
				}
			}
			if (cont) {

				Journey[] tArray = new Journey[jArray.length + 1];

				for (int i = 0; i < jArray.length; i++) {

					tArray[i] = jArray[i];
				}
				tArray[tArray.length - 1] = journey;
				flight.setJourneyInfo(tArray);
				session.setAttribute("newFLight", flight);
				session.setAttribute("error", "");
				session.setAttribute("destination",
						"/TwitterGUI/AddJourney.jsp");
				response.sendRedirect("TwitterGUI/Dashboard.jsp");
			}
			else{
				session.setAttribute("error", "This journey already exists");
				response.sendRedirect("TwitterGUI/Dashboard.jsp");
			}
		} else {
			session.setAttribute("error", result);
			response.sendRedirect("TwitterGUI/Dashboard.jsp");
		}
	}

}
