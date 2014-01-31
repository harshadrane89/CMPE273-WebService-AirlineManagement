package com.airlinemgmt.container;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airlinemgmt.beans.Reservation;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class TransactionServlet
 */
public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TransactionServlet() {
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
		session.setAttribute("destination",
				"/TwitterGUI/CustomerReservation.jsp");
		session.setAttribute("leftNavBar", "/TwitterGUI/SearchReservation.jsp");
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		Reservation reservation = (Reservation) session
				.getAttribute("myReservation");
		reservation.setCardCode(request.getParameter("cvv"));
		reservation.setCreditCardNumber(request.getParameter("cardNum"));
		reservation.setExpDate(request.getParameter("expiryDate"));

		boolean flag = true;
		String error = null;
		try {
			Double.parseDouble(reservation.getCreditCardNumber());
		} catch (Exception e) {
			flag = false;
			error = "Please provide valid Card Number >>	";
			// TODO: handle exception
		}
System.out.println(reservation.getCreditCardNumber().length());
		if (reservation.getCreditCardNumber().length() != 16) {
			flag = false;
			error = "Please provide valid Card Number";
		}

		if (flag) {
			AirlineMgmtServiceProxy proxy;
			proxy = new AirlineMgmtServiceProxy();
			proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
			proxy.createReservation(reservation);
			session.setAttribute("error", "");
			session.setAttribute("destination", "/TwitterGUI/Ticket.jsp");
			response.sendRedirect("TwitterGUI/Dashboard.jsp");
		} else {
			session.setAttribute("error", error);
			response.sendRedirect("TwitterGUI/Dashboard.jsp");
		}
	}
}
