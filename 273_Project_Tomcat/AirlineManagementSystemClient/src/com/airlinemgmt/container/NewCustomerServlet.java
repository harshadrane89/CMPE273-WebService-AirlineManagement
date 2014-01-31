package com.airlinemgmt.container;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airlinemgmt.beans.Person;
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class NewCustomerServlet
 */
@WebServlet("/NewCustomerServlet")
public class NewCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NewCustomerServlet() {
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

		System.out.println("Reached Here");
		HttpSession session = request.getSession();

		Traveller traveller = new Traveller();
		traveller.setfName(request.getParameter("fName"));
		traveller.setCustId(request.getParameter("ssn"));
		traveller.setlName(request.getParameter("lName"));
		traveller.setDob(request.getParameter("dob"));
		traveller.setAddress(request.getParameter("address"));
		traveller.setCity(request.getParameter("city"));
		traveller.setState(request.getParameter("state"));
		traveller.setZipCode(request.getParameter("zip"));
		traveller.setNationality(request.getParameter("uNationality"));
		traveller.setPassNum(request.getParameter("uPNumber"));
		traveller.setContactNo(request.getParameter("cInfo"));
		traveller.setUserName(request.getParameter("uName"));
		traveller.setPassword(request.getParameter("uPasswd"));
		traveller.setCreditCardNum(request.getParameter("uCC"));
		String result = "true";
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		result = proxy.addUpdateCustomer(traveller, "insert");

		if (result.equalsIgnoreCase("true")) {
			Person ref = proxy.signIn(traveller.getUserName(),
					traveller.getPassword());
			traveller = proxy.getTravellerDetails(ref.getPersonId() + "");
			session.setAttribute("error", "");
			session.setAttribute("userInfo", traveller);
			session.setAttribute("title", "My Reservations");
			session.setAttribute("destination",
					"/TwitterGUI/CustomerReservation.jsp");
			session.setAttribute("leftNavBar",
					"/TwitterGUI/SearchReservation.jsp");
			session.setAttribute("tObj", traveller);
			response.sendRedirect("TwitterGUI/Dashboard.jsp");
		} else {
			System.out.println("Values Couldnt Be Processed");
			session.setAttribute("tObj", traveller);
			session.setAttribute("error", result);
			response.sendRedirect("TwitterGUI/NewCustomer.jsp");

		}

	}

}
