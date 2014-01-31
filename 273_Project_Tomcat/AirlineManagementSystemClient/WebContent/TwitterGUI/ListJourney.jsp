<%@page import="com.airlinemgmt.beans.Journey"%>
<%@page import="com.airlinemgmt.beans.FlightDetails"%>
<%@page import="com.airlinemgmt.beans.AirlineEmployee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
<title>Insert title here</title>
</head>
<body>
	<%
		Journey[] jArray = null;
		if (session.getAttribute("jList") != null) {
			jArray = (Journey[]) session.getAttribute("jList");
		}
	%>

	<%
		if (jArray != null) {
			if (jArray.length > 0) {
	%>
	<table class="table-striped" width="800px" cellpadding="10px">



		<%
			int i = 0;
					for (Journey journey : jArray) {
						{
		%>
		<tr>
			<td>
				<table>
					<tr>
						<td>
							<h2><%=journey.getAirline()%></h2>
						</td>
						<td>
							<h3><%=journey.getFlightNum()%></h3>
						</td>
					</tr>
					<tr>
						<td><%=journey.getBoardingPoint()%></td>
						<td>--></td>
						<td><%=journey.getDestinationPoint()%></td>
					</tr>
					<tr>
						<td><%=journey.getDepartureDate()%></td>
					</tr>
					<tr>
						<td><%=journey.getFare()%></td>
					</tr>
				</table>
				</td>
					
					<td><form action="../CustomerReservationProcessor" method="get"><input type="submit" name="<%=i%>" value="Book"
						class="btn btn-danger"></form></td>
				
		</tr>


		<%
			}
						i++;
					}
		%>
	</table>
	<%
		}
		}
	%>
</body>
</html>