package com.airlinemgmt.cache;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class StartupServlet
 */
@WebServlet("/StartupServlet")
public class StartupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public StartupServlet() {
		System.out.println("****Servlet Started*****");
		CacheObject cache = new CacheObject();
		cache.getCachedCustomers();
		cache.getCachedEmployees();
		cache.getCachedFlights();

	}

}
