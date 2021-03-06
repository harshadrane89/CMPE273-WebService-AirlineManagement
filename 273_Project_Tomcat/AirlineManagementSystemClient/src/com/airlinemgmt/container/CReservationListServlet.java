package com.airlinemgmt.container;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airlinemgmt.beans.Journey;
import com.airlinemgmt.beans.Reservation;
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class ReservationServlet
 */
@WebServlet("/ReservationServlet")
public class CReservationListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CReservationListServlet() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		HttpSession session=request.getSession();
		Journey[] journeyObj=(Journey[])session.getAttribute("jList");
		Journey journey=null;
		int index=0;
		for(int i=0;i<journeyObj.length;i++)
		{
			if(request.getParameter(i+"")!=null)
			{
				index=i;
				break;
			}
		}
		
		Reservation myReservation=new  Reservation();
		journey=journeyObj[index];
		
		Traveller traveller=(Traveller)session.getAttribute("userInfo");
		myReservation.setTraveller(traveller);
		myReservation.setCustomerId(traveller.getCustId());
		myReservation.setJourneyId(journey.getJourneyId());
		myReservation.setJourneyInfo(journey);
		session.setAttribute("myReservation",myReservation);
		session.setAttribute("destination", "/TwitterGUI/PassengerInfo.jsp");
		session.setAttribute("leftNavBar", null);
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Journey journeySearch = new Journey();
		journeySearch.setBoardingPoint(request.getParameter("src"));
		journeySearch.setDestinationPoint(request.getParameter("dest"));
		journeySearch.setFlightNum(request.getParameter("fNum"));
		journeySearch.setAirline(request.getParameter("airName"));
		journeySearch.setDepartureDate(request.getParameter("fDate"));
		journeySearch.setMaxFare(request.getParameter("maxFare"));
		journeySearch.setMinFare(request.getParameter("minFare"));
		
		Journey[] journey=null;
		
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		
		journey=proxy.searchJourney(journeySearch);
				
		session.setAttribute("searchJourney",journeySearch);
		session.setAttribute("jList", journey);
		session.setAttribute("leftNavBar", "/TwitterGUI/SearchReservation.jsp");
		session.setAttribute("destination", "/TwitterGUI/ListJourney.jsp");
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
		
	}

}
