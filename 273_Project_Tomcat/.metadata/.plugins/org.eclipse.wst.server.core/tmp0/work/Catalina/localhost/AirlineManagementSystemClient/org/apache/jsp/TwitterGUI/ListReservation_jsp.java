/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-12-09 23:17:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.TwitterGUI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.beans.Reservation;
import com.airlinemgmt.beans.Journey;
import com.airlinemgmt.beans.FlightDetails;
import com.airlinemgmt.beans.AirlineEmployee;

public final class ListReservation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table cellpadding=\"10px\" cellspacing=\"10px\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t");

					Reservation[] rArray = null;
					if (session.getAttribute("rList") != null) {
						rArray = (Reservation[]) session.getAttribute("rList");
					}
				
      out.write(' ');

 	if (rArray != null) {
 		if (rArray.length > 0) {
 
      out.write(' ');

 	int k = 0;
 			for (Reservation reservation : rArray) {
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"well\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\tAirline -\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(reservation.getJourneyInfo().getAirline());
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\tFlight Number -\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(reservation.getJourneyInfo().getFlightNum());
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<h4>");
      out.print(reservation.getJourneyInfo()
								.getBoardingPoint());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t-->");
      out.print(reservation.getJourneyInfo()
								.getDestinationPoint());
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t<br> Travel Date -\r\n");
      out.write("\t\t\t\t\t");
      out.print(reservation.getJourneyInfo()
								.getDepartureDate());
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<br> Fare -\r\n");
      out.write("\t\t\t\t\t");
      out.print(reservation.getJourneyInfo().getFare());
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\tReservation Id : ABX - 123 -");
      out.print(reservation.getReservationId());
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\tCustomer Name -\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(reservation.getTraveller().getfName());
      out.write("&nbsp;");
      out.print(reservation.getTraveller().getlName());
      out.write("\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\tContact Info -\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(reservation.getTraveller().getContactNo());
      out.write("\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\tNationality -\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(reservation.getTraveller().getNationality());
      out.write("\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\tPassport Number -\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(reservation.getTraveller().getPassNum());
      out.write("\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>Passenger Info</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

							for (Traveller obj : reservation.getPassenger()) {
											if (obj != null) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tName\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(obj.getfName());
      out.write("&nbsp;");
      out.print(obj.getlName());
      out.write("&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tIdentification -\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(obj.getNationality());
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tIdentification Info -\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(obj.getPassNum());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t");

							}
										}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"../ReservationProcessor\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Delete\" class=\"btn btn-danger\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=");
      out.print(k);
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"../ReservationProcessor\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"View Ticket\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-success\" name=");
      out.print(k);
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div> ");

 	k++;
 			}
 		}
 	}
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
