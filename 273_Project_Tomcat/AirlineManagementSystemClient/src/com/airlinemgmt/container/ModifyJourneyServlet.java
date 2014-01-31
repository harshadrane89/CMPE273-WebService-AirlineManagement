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
 * Servlet implementation class ModifyJourneyServlet
 */
@WebServlet("/ModifyJourneyServlet")
public class ModifyJourneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifyJourneyServlet() {
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
		System.out.println("Reached here");
		HttpSession session = request.getSession();
		FlightDetails flight = (FlightDetails) session
				.getAttribute("flightObj");
		Journey[] journey = flight.getJourneyInfo();
		Journey[] temp = new Journey[journey.length - 1];

		int index = 0;
		String journeyId = "";
		for (int i = 0; i < journey.length; i++) {
			if (request.getParameter(i + "") == null) {
				temp[index++] = journey[i];
			} else {
				journeyId = journey[i].getJourneyId() + "";
			}
		}

		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		proxy.deleteJourney(journeyId);
		flight.setJourneyInfo(temp);
		session.setAttribute("flightObj", flight);
		session.setAttribute("destination", "/TwitterGUI/ModifyFlight.jsp");
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
				.getAttribute("flightObj");
		journey.setAirline(flight.getAirlineName());
		journey.setFlightNum(flight.getFlightNum());

		boolean cont = true;

		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		String result = "true";
		result = proxy.validateJourney(journey);
		if (result.equalsIgnoreCase("true")) {

			Journey[] jArray = flight.getJourneyInfo();
			Journey[] newJArray = null;
			Journey[] tempNewJArray = null;

			if (flight.getNewJourney() != null) {

				newJArray = flight.getNewJourney();

				for (Journey j : newJArray) {
					if ((j.getBoardingPoint().equalsIgnoreCase(journey
							.getBoardingPoint()))
							&& (j.getDestinationPoint()
									.equalsIgnoreCase(journey
											.getDestinationPoint()))) {
						cont = false;
					}
				}

			}

			if (cont) {

				if (flight.getNewJourney() != null) {
					newJArray = flight.getNewJourney();
					tempNewJArray = new Journey[newJArray.length + 1];
					for (int i = 0; i < newJArray.length; i++) {

						tempNewJArray[i] = jArray[i];
					}
					tempNewJArray[newJArray.length] = journey;
					flight.setNewJourney(tempNewJArray);

				} else {
					newJArray = new Journey[1];
					newJArray[0] = journey;
					flight.setNewJourney(newJArray);
				}
				Journey[] tArray = new Journey[jArray.length + 1];

				for (int i = 0; i < jArray.length; i++) {

					tArray[i] = jArray[i];
				}

				tArray[tArray.length - 1] = journey;
				flight.setJourneyInfo(tArray);
				session.setAttribute("error", "");
				session.setAttribute("flightObj", flight);
				session.setAttribute("destination",
						"/TwitterGUI/ModifyFlight.jsp");
				response.sendRedirect("TwitterGUI/Dashboard.jsp");
			} else {
				session.setAttribute("error",
						"Duplicate Journey Please Provide Another Source or Destination");
				response.sendRedirect("TwitterGUI/Dashboard.jsp");
			}
		} else {
			session.setAttribute("error", result);
			response.sendRedirect("TwitterGUI/Dashboard.jsp");
		}

	}
}
