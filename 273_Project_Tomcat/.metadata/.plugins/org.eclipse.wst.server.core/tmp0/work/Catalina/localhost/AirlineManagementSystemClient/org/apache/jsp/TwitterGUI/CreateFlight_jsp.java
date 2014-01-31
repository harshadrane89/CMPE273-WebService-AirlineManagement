/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-12-09 06:29:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.TwitterGUI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.airlinemgmt.beans.FlightDetails;
import com.airlinemgmt.beans.AirlineEmployee;

public final class CreateFlight_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		String errorMessage = "";
		if(session.getAttribute("error")!=null){
		errorMessage = (String) session.getAttribute("error");
		}
	
      out.write("\r\n");
      out.write("\t<label id=\"errorMessage\"><b>");
      out.print(errorMessage);
      out.write("</b></label>\r\n");
      out.write("\t\r\n");
      out.write("\t");

	FlightDetails flight=new FlightDetails();
	if (session.getAttribute("newFlight")!=null)
	{
		flight=(FlightDetails)session.getAttribute("newFlight");
	}
		
      out.write("\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<h3>Flight Details</h3>\r\n");
      out.write("<form class=\"well\" action=\"../FlightProcessor\" method=\"get\">\r\n");
      out.write("\t\t\t<table cellpadding=\"10px\" cellspacing=\"10px\" class=\"table-striped\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Airline</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"Airline Name\" name=\"fName\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(flight.getAirlineName()!=null?flight.getAirlineName():"");
      out.write("\" class=\"form-control\" required=\"true\"></td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Source</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"Source\"\r\n");
      out.write("\t\t\t\t\t\tname=\"fSource\" value=\"");
      out.print(flight.getSrc()!=null?flight.getSrc():"");
      out.write("\" class=\"form-control\" required=\"true\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Destination</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"Destination\" name=\"fDestn\" value=\"");
      out.print(flight.getDest()!=null?flight.getDest():"");
      out.write("\" class=\"form-control\" required=\"true\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Flight Number</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"Flight Number\"\r\n");
      out.write("\t\t\t\t\t\tname=\"flightNumber\" value=\"");
      out.print(flight.getFlightNum()!=null?flight.getFlightNum():"");
      out.write("\" class=\"form-control\" required=\"true\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Flight Take-Off Date</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-append date input-group form-control\" id=\"dp1\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-date=\"12-07-2012\" data-date-format=\"mm-dd-yyyy\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"span2\" name=\"fTDate\" size=\"16\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(flight.getFlightDate()!=null?flight.getFlightDate():"");
      out.write("\" readonly> &nbsp;<span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"add-on glyphicon glyphicon-calendar\" required=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Flight Landing Date </td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-append date input-group form-control\" id=\"dp2\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-date=\"12-07-2012\" data-date-format=\"mm-dd-yyyy\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"span2\" name=\"fLDate\" size=\"16\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(flight.getFlightDate()!=null?flight.getFlightDate():"");
      out.write("\" readonly> &nbsp;<span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"add-on glyphicon glyphicon-calendar\" required=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Fare </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"number\" placeholder=\"Fare\" name=\"fare\"  class=\"form-control\" required >\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Number of Seats</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"number\" placeholder=\"Number of Seats\" name=\"fSeats\" value=\"");
      out.print(flight.getNumOfSeats()!=0?flight.getNumOfSeats():"");
      out.write("\" class=\"form-control\" required>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t<input type=\"submit\" value=\"Continue >>\" class=\"btn btn-success\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t</center>  \r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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
