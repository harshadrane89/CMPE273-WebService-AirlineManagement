package com.airlinemgmt.container;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airlinemgmt.beans.AirlineEmployee;
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class EmployeeViewServlet
 */
@WebServlet("/EmployeeViewServlet")
public class EmployeeViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		session.setAttribute("destination", "/TwitterGUI/ModifyEmployee.jsp");
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		
		AirlineEmployee employee=(AirlineEmployee)session.getAttribute("empObj");
		String cId=employee.getSSN();
		
		AirlineEmployee[] employeeObj=(AirlineEmployee[])session.getAttribute("eList");
		
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		proxy.addUpdateEmployee(employee, "delete");
		
		
		for(AirlineEmployee emp:employeeObj)
		{
			if(emp.getSSN().equalsIgnoreCase(cId))
			{
				emp.setIsActive(0);
			}
		}
		
		session.setAttribute("tList", employeeObj);
		session.setAttribute("destination", "/TwitterGUI/ListEmployee.jsp");
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	
	}

}
