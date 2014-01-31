package com.airlinemgmt.container;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airlinemgmt.beans.AirlineEmployee;
import com.airlinemgmt.beans.FlightDetails;
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class FlightListServlet
 */
@WebServlet("/FlightListServlet")
public class FlightListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		FlightDetails[] flightObj=(FlightDetails[])session.getAttribute("fList");
		FlightDetails flight=null;
		int index=0;
		for(int i=0;i<flightObj.length;i++)
		{
			if(request.getParameter(i+"")!=null)
			{
				index=i;
				break;
			}
		}
		flight=flightObj[index];
		session.setAttribute("flightObj",flight);
		session.setAttribute("destination", "/TwitterGUI/ViewFlight.jsp");
		session.setAttribute("leftNavBar", null);
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		FlightDetails[] flightList=null;
		HttpSession session=request.getSession();
		FlightDetails flight=new FlightDetails();
		flight.setAirlineName(request.getParameter("fName"));
		flight.setSrc(request.getParameter("fSource"));
		flight.setDest(request.getParameter("fDestn"));
		flight.setFlightDate(request.getParameter("fDate"));
		flight.setFlightNum(request.getParameter("flightNumber"));
		if(!request.getParameter("fSeats").equalsIgnoreCase("")){
		flight.setNumOfSeats(Integer.parseInt(request.getParameter("fSeats")));
		}
		else
		{
			flight.setNumOfSeats(0);
		}
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		flightList=proxy.getFlightDetails(flight);
		session.setAttribute("flightSearchObj", flight);
		session.setAttribute("fList", flightList);
		session.setAttribute("destination","/TwitterGUI/ListFlight.jsp" );
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	}

}
