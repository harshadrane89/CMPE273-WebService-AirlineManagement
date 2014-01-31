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
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.service.AirlineMgmtServiceProxy;

/**
 * Servlet implementation class EmployeeListServlet
 */
@WebServlet("/EmployeeListServlet")
public class EmployeeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		AirlineEmployee[] employeeObj=(AirlineEmployee[])session.getAttribute("eList");
		AirlineEmployee emp=null;
		int index=0;
		for(int i=0;i<employeeObj.length;i++)
		{
			if(request.getParameter(i+"")!=null)
			{
				index = i;
				break;
			}
		}
		System.out.println(index);
		emp=employeeObj[index];
		session.setAttribute("empObj",emp);
		session.setAttribute("destination", "/TwitterGUI/ViewEmployee.jsp");
		session.setAttribute("leftNavBar", null);
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		AirlineEmployee airlineEmployee = new AirlineEmployee();

		airlineEmployee.setfName(request.getParameter("fName"));
		System.out.println(airlineEmployee.getfName());
		airlineEmployee.setlName(request.getParameter("lName"));
		airlineEmployee.setSSN(request.getParameter("ssn"));
		airlineEmployee.setDob(request.getParameter("dob"));
		airlineEmployee.setContactNo(request.getParameter("cInfo"));

		airlineEmployee.setAddress(request.getParameter("address"));
		airlineEmployee.setCity(request.getParameter("city"));
		airlineEmployee.setState(request.getParameter("state"));
		airlineEmployee.setZipCode(request.getParameter("zip"));

		airlineEmployee.setWorkDesc(request.getParameter("wDesc"));
		airlineEmployee.setHireDate(null);
		airlineEmployee.setPosition(request.getParameter("wTitle"));

		airlineEmployee.setUserName(request.getParameter("uName"));
		airlineEmployee.setPassword(request.getParameter("uPasswd"));
		
		AirlineMgmtServiceProxy proxy;
		proxy = new AirlineMgmtServiceProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineManagementSystem/services/AirlineMgmtService");
		AirlineEmployee[] airlineEmpList=proxy.getEmployeeDetails(airlineEmployee);
//		System.out.println(airlineEmpList.length);
		HttpSession session=request.getSession();
		session.setAttribute("empSearchObj", airlineEmployee);
		session.setAttribute("eList", airlineEmpList);
		session.setAttribute("destination","/TwitterGUI/ListEmployee.jsp" );
		session.setAttribute("leftNavBar", "/TwitterGUI/SearchEmployee.jsp");
		response.sendRedirect("TwitterGUI/Dashboard.jsp");
	}

}
