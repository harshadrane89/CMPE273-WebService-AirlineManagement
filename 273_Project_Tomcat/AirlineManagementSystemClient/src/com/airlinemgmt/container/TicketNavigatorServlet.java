package com.airlinemgmt.container;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airlinemgmt.beans.Journey;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class TicketNavigatorServlet
 */
@WebServlet("/TicketNavigatorServlet")
public class TicketNavigatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TicketNavigatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		HttpSession session=request.getSession();
		String title="Reservations";
		String destination="/TwitterGUI/ListReservation.jsp";
		session.setAttribute("destination",destination);
		session.setAttribute("title",title);
		session.setAttribute("rList", proxy.getReservation(""));
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		HttpSession session=request.getSession();
		String title="Search Customer";
		String destination="/TwitterGUI/ListCustomer.jsp";
		String leftNavBar="/TwitterGUI/SearchCustomer.jsp";
		session.setAttribute("destination",destination);
		session.setAttribute("title",title);
		session.setAttribute("leftNavBar",leftNavBar);
		session.setAttribute("tList", proxy.getCustomerDetails(null));
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
		
	}

}
