package com.airlinemgmt.container;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airlinemgmt.beans.AirlineEmployee;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class EmployeeProcessorServlet
 */
@WebServlet("/EmployeeProcessorServlet")
public class EmployeeProcessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeProcessorServlet() {
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
		AirlineEmployee emp = (AirlineEmployee) session.getAttribute("empObj");
		AirlineEmployee[] airlineEmpList = (AirlineEmployee[]) session
				.getAttribute("eList");

		AirlineEmployee airlineEmployee = new AirlineEmployee();

		airlineEmployee.setPersonId(emp.getPersonId());
		airlineEmployee.setIsActive(emp.getIsActive());
		airlineEmployee.setRoleId(emp.getRoleId());

		airlineEmployee.setfName(request.getParameter("fName"));
		airlineEmployee.setlName(request.getParameter("lName"));
		airlineEmployee.setSSN(request.getParameter("ssn"));
		airlineEmployee.setDob(request.getParameter("dob"));
		airlineEmployee.setContactNo(request.getParameter("cInfo"));

		airlineEmployee.setAddress(request.getParameter("address"));
		airlineEmployee.setCity(request.getParameter("city"));
		airlineEmployee.setState(request.getParameter("state"));
		airlineEmployee.setZipCode(request.getParameter("zip"));

		airlineEmployee.setWorkDesc(request.getParameter("wDesc"));
		airlineEmployee.setHireDate(request.getParameter("hireDate"));
		airlineEmployee.setPosition(request.getParameter("wTitle"));

		airlineEmployee.setUserName(request.getParameter("uName"));
		airlineEmployee.setPassword(request.getParameter("uPasswd"));

		String result = "true";
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		result = proxy.addUpdateEmployee(airlineEmployee, "update");

		if (result.equalsIgnoreCase("true")) {
			session.setAttribute("error", "");
			int index = 0;
			for (int i = 0; i < airlineEmpList.length; i++) {
				if (airlineEmpList[i].getSSN().equalsIgnoreCase(
						airlineEmployee.getSSN())) {
					index = i;
				}
			}
			airlineEmpList[index] = airlineEmployee;
			session.setAttribute("eList", airlineEmpList);
			session.setAttribute("empObj", airlineEmployee);
			session.setAttribute("destination", "/TwitterGUI/ViewEmployee.jsp");
			response.sendRedirect("TwitterGUI/Dashboard.jsp");
		} else {
			session.setAttribute("error", result);
			session.setAttribute("empObj", airlineEmployee);
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

		HttpSession session = request.getSession();

		AirlineEmployee airlineEmployee = new AirlineEmployee();

		airlineEmployee.setfName(request.getParameter("fName"));
		airlineEmployee.setlName(request.getParameter("lName"));
		airlineEmployee.setSSN(request.getParameter("ssn"));
		airlineEmployee.setDob(request.getParameter("dob"));
		airlineEmployee.setContactNo(request.getParameter("cInfo"));

		airlineEmployee.setAddress(request.getParameter("address"));
		airlineEmployee.setCity(request.getParameter("city"));
		airlineEmployee.setState(request.getParameter("state"));
		airlineEmployee.setZipCode(request.getParameter("zip"));

		airlineEmployee.setWorkDesc(request.getParameter("wDesc"));
		airlineEmployee.setHireDate(new SimpleDateFormat("MM-dd-yyyy")
				.format(new Date()));
		airlineEmployee.setPosition(request.getParameter("wTitle"));

		airlineEmployee.setUserName(request.getParameter("uName"));
		airlineEmployee.setPassword(request.getParameter("uPasswd"));

		String result = "true";
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		result = proxy.addUpdateEmployee(airlineEmployee, "insert");

		if (result.equalsIgnoreCase("true")) {

			session.setAttribute("error", "");
			session.setAttribute("title", "Search Customer");
			session.setAttribute("userInfo", airlineEmployee);
			session.setAttribute("destination", "/TwitterGUI/ListCustomer.jsp");
			session.setAttribute("leftNavBar", "/TwitterGUI/SearchCustomer.jsp");
			response.sendRedirect("TwitterGUI/Dashboard.jsp");
		} else {
			session.setAttribute("empObj", airlineEmployee);
			System.out.println("Values Couldnt Be Processed");
			session.setAttribute("error", result);
			response.sendRedirect("TwitterGUI/Dashboard.jsp");

		}

	}

}
