package com.airlinemgmt.container;

import java.rmi.RemoteException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.airlinemgmt.beans.AirlineEmployee;
import com.airlinemgmt.beans.Reservation;
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.server.MyClass;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class StartUpServlet
 */
@WebServlet("/StartUpServlet")
public class StartUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @throws RemoteException
	 * @see HttpServlet#HttpServlet()
	 */
	public StartUpServlet() throws RemoteException {
		System.out.println("*******Start Up Servlet Loaded*****");
		
		
		new MyClass();

	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

	}

}
