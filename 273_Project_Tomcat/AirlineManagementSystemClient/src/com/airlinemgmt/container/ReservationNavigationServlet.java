package com.airlinemgmt.container;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airlinemgmt.beans.Traveller;

/**
 * Servlet implementation class ReservationNavigationServlet
 */
@WebServlet("/ReservationNavigationServlet")
public class ReservationNavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReservationNavigationServlet() {
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
		if (session.getAttribute("passengerList") != null) {
			ArrayList<Traveller> traveller = (ArrayList<Traveller>) session
					.getAttribute("passengerList");
			if (traveller.size() > 0) {

				session.setAttribute("error", "");
				session.setAttribute("destination",
						"/TwitterGUI/TransactionInfo.jsp");
				response.sendRedirect("TwitterGUI/Dashboard.jsp");
			} else {
				session.setAttribute("error", "Please add passenger info");
				response.sendRedirect("TwitterGUI/Dashboard.jsp");
			}
		} else {
			session.setAttribute("error", "Please add passenger info");
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
	}

}
