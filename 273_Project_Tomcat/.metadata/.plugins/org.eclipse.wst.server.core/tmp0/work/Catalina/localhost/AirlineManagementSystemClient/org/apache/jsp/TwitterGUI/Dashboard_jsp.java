/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2013-12-09 11:50:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.TwitterGUI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/TwitterGUI/Navbar.jsp", Long.valueOf(1386550941998L));
  }

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"../css/datepicker.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../css/prettify.css\" rel=\"stylesheet\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* bootstrap overrides */\r\n");
      out.write("html,body {\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main,.row-fluid {\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main:before,.main:after,.column:before,.column:after {\r\n");
      out.write("\tcontent: \"\";\r\n");
      out.write("\tdisplay: table;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main:after,.column:after {\r\n");
      out.write("\tclear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".column {\r\n");
      out.write("\theight: 80%;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("\t*zoom: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".column .padding {\r\n");
      out.write("\tpadding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".box {\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tright: 0;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".span9.full {\r\n");
      out.write("\twidth: 95%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>Airline Management ");

	if (session.getAttribute("title") != null) {

      out.write(' ');
      out.print("-" + session.getAttribute("title"));
      out.write(' ');

 	}
 
      out.write("</title>\r\n");

	String val = null;
	String lval = null;

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"../css/bootstrap.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\tdata-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand\" href=\"#\">Airline Management</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t\t<form action=\"../Navigator\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\">Customer <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"Create New Customer\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"1\" class=\"btn btn-link\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"Search Customer\" name=\"2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-link\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\">Employee <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"Create New Employee\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"3\" class=\"btn btn-link\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"Search Employee\" name=\"4\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-link\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\">Flight <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"Create Flight\" name=\"5\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-link\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"Search Flight\" name=\"6\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-link\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\">Reservation <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"New Reservation\" name=\"8\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-link\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"All Reservations\" name=\"7\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-link\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("    \t\t\t\t\t<li><form action=\"../LogOutServlet\" method=\"post\"><input type=\"submit\" value=\"Signout\"  class=\"btn btn-primary\"></form></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--/.nav-collapse -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t");

			if (session.getAttribute("title") != null) {
		
      out.write("\r\n");
      out.write("\t\t<h2>");
      out.print(session.getAttribute("title"));
      out.write("</h2>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

		if (session.getAttribute("leftNavBar") == null) {
			val = (String) session.getAttribute("destination");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, val + ((val).indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("xx", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("xx", request.getCharacterEncoding()), out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');

		} else {

			String leftNavBar = (String) session.getAttribute("leftNavBar");
			String destination = (String) session
					.getAttribute("destination");
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"row-fluid row\">\r\n");
      out.write("\t\t\t\t<div class=\"column span4 col-md-4\" style=\"width=30%\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, leftNavBar + ((leftNavBar).indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("xx", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("xx", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"column span9\" style=\"width=10000px\">\r\n");
      out.write("\t\t\t\t\t<div class=\"padding\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"full span9\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, destination + ((destination).indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("xx", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("xx", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"../js/prettify.js\"></script>\r\n");
      out.write("\t<script src=\"../js/jquery-1.9.1.js\"></script>\r\n");
      out.write("\t<script src=\"../js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\twindow.prettyPrint && prettyPrint();\r\n");
      out.write("\t\t\t$('#dp1').datepicker();\r\n");
      out.write("\t\t\t$('#dp2').datepicker();\r\n");
      out.write("\t\t\t$('#dp3').datepicker();\r\n");
      out.write("\t\t\t$('#dp4').datepicker();\r\n");
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
      out.write("\t\r\n");
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
