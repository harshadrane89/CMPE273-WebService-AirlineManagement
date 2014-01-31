<%@page import="com.airlinemgmt.beans.FlightDetails"%>
<%@page import="com.airlinemgmt.beans.AirlineEmployee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
	<form class="well" action="../FlightListProcessor" method="post">
		<%
			FlightDetails flight = new FlightDetails();
			if (session.getAttribute("flightSearchObj") != null) {
				flight = (FlightDetails) session
						.getAttribute("flightSearchObj");
			}
		%>
		<center>
			<h3>Flight Details</h3>

			<table cellpadding="10px" cellspacing="10px" class="table-striped">
				<tr>
					<td>Airline</td>
					<td><input type="text" placeholder="Airline Name" name="fName"
						value="<%=flight.getAirlineName() != null ? flight.getAirlineName()
					: ""%>"
						class="form-control"></td>

				</tr>
				<tr>
					<td>Source</td>
					<td><input type="text" placeholder="Source" name="fSource"
						value="<%=flight.getSrc() != null ? flight.getSrc() : ""%>"
						class="form-control"></td>
				</tr>
				<tr>
					<td>Destination</td>
					<td><input type="text" placeholder="Destination" name="fDestn"
						value="<%=flight.getDest() != null ? flight.getDest() : ""%>"
						class="form-control"></td>
				</tr>
				<tr>
					<td>Flight Number</td>
					<td><input type="text" placeholder="Flight Number" name="fNum"
						value="<%=flight.getFlightNum() != null ? flight.getFlightNum()
					: ""%>"
						class="form-control"></td>
				</tr>
				<tr>
					<td>Flight Date</td>
					<td><input type="text" placeholder="Flight Date" name="fDate"
						value="<%=flight.getFlightDate() != null ? flight.getFlightDate()
					: ""%>"
						class="form-control"></td>
				</tr>
				<tr>
					<td>Number of Seats</td>
					<td><input type="text" placeholder="Number of Seats"
						name="fSeats"
						value="<%=flight.getNumOfSeats() != 0 ? flight.getNumOfSeats() : ""%>"
						class="form-control"></td>
				</tr>

			</table>

		
		<br> <br>
		<input type="submit"  value="Search" class="btn btn-success">
		</center>
	</form>
</body>
</html>