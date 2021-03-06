/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-12-09 09:18:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.TwitterGUI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.airlinemgmt.beans.Journey;
import com.airlinemgmt.beans.FlightDetails;
import com.airlinemgmt.beans.Traveller;
import com.airlinemgmt.beans.AirlineEmployee;

public final class SearchReservation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"../CustomerReservationProcessor\" method=\"post\" class=\"well\">\r\n");
      out.write("\t\t");

			Journey journey = new Journey();
			if (session.getAttribute("searchJourney") != null) {
				journey = (Journey) session
						.getAttribute("searchJourney");
			}
		
      out.write("\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<h3>Search Flight</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table cellpadding=\"10px\" cellspacing=\"10px\" class=\"table-striped\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"Source\" name=\"src\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(journey.getBoardingPoint() != null ? journey.getBoardingPoint()
					: "");
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" required=\"true\"></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"Destination\" name=\"dest\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(journey.getDestinationPoint() != null ? journey.getDestinationPoint()
					: "");
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" required=\"true\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Airline Name</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"Airline Name\"\r\n");
      out.write("\t\t\t\t\t\tname=\"airName\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(journey.getAirline() != null ? journey
					.getAirline() : "");
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Flight Number</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"Flight Number\" name=\"fNum\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(journey.getFlightNum() != null ? journey
					.getFlightNum() : "");
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Fare</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"Minimum Fair\"\r\n");
      out.write("\t\t\t\t\t\tname=\"minFare\" class=\"form-control\" value=\"");
      out.print(journey.getMinFare() != null ? journey
					.getMinFare() : "");
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"Maximum Fair\"\r\n");
      out.write("\t\t\t\t\t\tname=\"maxFare\" class=\"form-control\" value=\"");
      out.print(journey.getMaxFare() != null ? journey
					.getMaxFare() : "");
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Flight Date</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-append date input-group\" id=\"dp3\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-date=\"12-02-2012 \" data-date-format=\"mm-dd-yyyy\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"span2 form-control\" size=\"16\" type=\"text\" value=\"");
      out.print(journey.getDepartureDate() != null ? journey
					.getDepartureDate() : "");
      out.write("\" \r\n");
      out.write("\t\t\t\t\t\t\t\treadonly placeholder=\"Travel Date\" name=\"tDate\"> &nbsp;<span class=\"add-on glyphicon glyphicon-calendar\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br> <br> <input type=\"submit\" class=\"btn btn-success\"\r\n");
      out.write("\t\t\t\tvalue=\"Search >>\">\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t\t<br> <br>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"../js/prettify.js\"></script>\r\n");
      out.write("\t<script src=\"../js/jquery-1.9.1.js\"></script>\r\n");
      out.write("\t<script src=\"../js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\twindow.prettyPrint && prettyPrint();\r\n");
      out.write("\t\t\t$('#dp3').datepicker();\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar checkin = $('#dpd1').datepicker({\r\n");
      out.write("\t\t\t\tonRender : function(date) {\r\n");
      out.write("\t\t\t\t\treturn date.valueOf() < now.valueOf() ? 'disabled' : '';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}).on('changeDate', function(ev) {\r\n");
      out.write("\t\t\t\tif (ev.date.valueOf() > checkout.date.valueOf()) {\r\n");
      out.write("\t\t\t\t\tvar newDate = new Date(ev.date)\r\n");
      out.write("\t\t\t\t\tnewDate.setDate(newDate.getDate() + 1);\r\n");
      out.write("\t\t\t\t\tcheckout.setValue(newDate);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tcheckin.hide();\r\n");
      out.write("\t\t\t\t$('#dpd2')[0].focus();\r\n");
      out.write("\t\t\t}).data('datepicker');\r\n");
      out.write("\t\t\tvar checkout = $('#dpd2')\r\n");
      out.write("\t\t\t\t\t.datepicker(\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tonRender : function(date) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn date.valueOf() <= checkin.date\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.valueOf() ? 'disabled' : '';\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}).on('changeDate', function(ev) {\r\n");
      out.write("\t\t\t\t\t\tcheckout.hide();\r\n");
      out.write("\t\t\t\t\t}).data('datepicker');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"http://www.google-analytics.com/urchin.js\"\r\n");
      out.write("\t\ttype=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
