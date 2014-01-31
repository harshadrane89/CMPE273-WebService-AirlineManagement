package com.airlinemgmt.container;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class CustomerViewServlet
 */
@WebServlet("/CustomerViewServlet")
public class CustomerViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		session.setAttribute("destination", "/TwitterGUI/ModifyCustomer.jsp");
		session.setAttribute("leftNavBar", null);
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		
		Traveller traveller=(Traveller)session.getAttribute("tObj");
		String cId=traveller.getCustId();
		
		Traveller[] travellerObj=(Traveller[])session.getAttribute("tList");
		
		for(Traveller travel:travellerObj)
		{
			if(travel.getCustId().equalsIgnoreCase(cId))
			{
				travel.setIsActive(0);
			}
		}
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		proxy.deleteAccount(traveller.getPersonId()+"");
		session.setAttribute("tList", travellerObj);
		session.setAttribute("destination", "/TwitterGUI/ListCustomer.jsp");
		session.setAttribute("leftNavBar", "/TwitterGUI/SearchCustomer.jsp");
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	}

}
