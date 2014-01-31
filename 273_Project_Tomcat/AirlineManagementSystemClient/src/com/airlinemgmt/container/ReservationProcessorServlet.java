package com.airlinemgmt.container;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airlinemgmt.beans.Reservation;
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class ReservationProcessorServlet
 */
@WebServlet("/ReservationProcessorServlet")
public class ReservationProcessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationProcessorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		
		Reservation[] reservationObj=(Reservation[])session.getAttribute("rList");
		Reservation reservation=null;
		int index=0;
		int newIndex=0;
		
		
		
		for(int i=0;i<reservationObj.length;i++)
		{
			if(request.getParameter(i+"")!=null)
			{
				index=i;
				break;
			}
		}
		reservation=reservationObj[index];
		session.setAttribute("myReservation",reservation);
		session.setAttribute("destination", "/TwitterGUI/ViewTicket.jsp");
		session.setAttribute("leftNavBar", null);
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		Reservation[] reservationObj=(Reservation[])session.getAttribute("rList");
		Reservation[] newReservation=new Reservation[reservationObj.length-1];
		Reservation reservation=null;
		int index=0;
		int newIndex=0;
		for(int i=0;i<reservationObj.length;i++)
		{
			if(request.getParameter(i+"")==null)
			{
					newReservation[newIndex++]=reservationObj[i];
			}
			else{
				reservation=reservationObj[i];
			}
		}
		reservation=reservationObj[index];
		
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		proxy.deleteReservation(reservation.getReservationId()+"");
		
		session.setAttribute("rList",newReservation);
		session.setAttribute("destination", "/TwitterGUI/ListReservation.jsp");
		session.setAttribute("leftNavBar", null);
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	}

}