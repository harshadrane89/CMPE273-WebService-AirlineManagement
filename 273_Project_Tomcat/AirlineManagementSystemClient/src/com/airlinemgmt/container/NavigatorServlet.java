package com.airlinemgmt.container;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.axis.session.Session;

import com.airlinemgmt.beans.AirlineEmployee;
import com.airlinemgmt.beans.FlightDetails;
import com.airlinemgmt.beans.Journey;
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Servlet implementation class NavigatorServlet
 */
@WebServlet("/NavigatorServlet")
public class NavigatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NavigatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int navValue=0;
		for(int i=1;i<=8;i++)
		{
			if(request.getParameter(i+"")!=null)
			{
				navValue=i;
				break;
			}
		}
		
		HttpSession session=request.getSession();
		String destination=null;
		String leftNavBar=null;
		String title=null;
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		
		if(navValue==1)
		{
			destination="/TwitterGUI/CreateCustomer.jsp";
			session.setAttribute("tObj", new Traveller());
		}
		else if(navValue==2)
		{
			title="Search Customer";
			session.setAttribute("tList", proxy.getCustomerDetails(null));
			session.setAttribute("tSearchObj", new Traveller());
			destination="/TwitterGUI/ListCustomer.jsp";
			leftNavBar="/TwitterGUI/SearchCustomer.jsp";
		}
		else if(navValue==3)
		{
			destination="/TwitterGUI/CreateEmployee.jsp";
			session.setAttribute("empObj", new AirlineEmployee());
		}
		else if(navValue==4)
		{	
			title="Search Employee";
			session.setAttribute("eList", proxy.getEmployeeDetails(null));
			session.setAttribute("empSearchObj", new AirlineEmployee());
			destination="/TwitterGUI/ListEmployee.jsp";
			leftNavBar="/TwitterGUI/SearchEmployee.jsp";
			
		}
		else if(navValue==5)
		{
			destination="/TwitterGUI/CreateFlight.jsp";
			session.setAttribute("newFlight", new FlightDetails());
		}
		else if(navValue==6)
		{
			title="Search Flight";
			session.setAttribute("fList", proxy.getFlightDetails(null));
			session.setAttribute("flightSearchObj", new FlightDetails());
			destination="/TwitterGUI/ListFlight.jsp";
			leftNavBar="/TwitterGUI/SearchFlight.jsp";
			
		}	
		else if(navValue==7)
		{
			title="Reservations";
			destination="/TwitterGUI/ListReservation.jsp";
			session.setAttribute("rList", proxy.getReservation(""));
//			leftNavBar="/TwitterGUI/SearchFlight.jsp";
		}	
		else if(navValue==8)
		{
			title="Bookings";
			destination="/TwitterGUI/CustomerReservation.jsp";
			leftNavBar="/TwitterGUI/SearchReservation.jsp";
			session.setAttribute("searchJourney", new Journey());
//			leftNavBar="/TwitterGUI/SearchFlight.jsp";
		}	
		session.setAttribute("title", title);
		session.setAttribute("destination", destination);
		session.setAttribute("leftNavBar", leftNavBar);
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	}

}
