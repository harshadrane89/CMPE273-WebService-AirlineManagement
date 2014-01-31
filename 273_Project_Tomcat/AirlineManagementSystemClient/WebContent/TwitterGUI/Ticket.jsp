R<%@page import="com.airlinemgmt.beans.Traveller"%>
<%@page import="com.airlinemgmt.beans.Reservation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="../TransactionProcessor" method="get" ><input type="submit" value="Done" class="btn btn-success"> </form>
<center> <h2><b>Your e-Ticket</b></h2></center>
	<%
		String fare="";
		
		if(session.getAttribute("myReservation")!=null)
		{
			Reservation reservation =(Reservation)session.getAttribute("myReservation");
		
		
	%>

	<div class="well">

		<h3>
			Airline -
			<%=reservation.getJourneyInfo().getAirline()%></h3>
		<br>
		<h3>
			Flight Number -
			<%=reservation.getJourneyInfo()
									.getFlightNum()%></h3>
		<br>
		<h4><%=reservation.getJourneyInfo()
									.getBoardingPoint()%>
			--><%=reservation.getJourneyInfo()
									.getDestinationPoint()%></h4>
		<br> Travel Date -
		<%=reservation.getJourneyInfo()
									.getDepartureDate()%>

		<br> Fare -
		<%=reservation.getJourneyInfo().getFare()%>

		<br>
		<h3>
			Reservation Id : ABX - 123 -<%=reservation.getReservationId()%></h3>
		<br>
		<h4>
			Customer Name -
			<%=reservation.getTraveller().getfName()%>&nbsp;<%=reservation.getTraveller().getlName()%>
		</h4>
		<br>
		<h4>
			Contact Info -
			<%=reservation.getTraveller().getContactNo()%>
		</h4>
		<br>
		<div>

			<p>Passenger Info</p>

			<%
				for (Traveller obj : reservation.getPassenger()) {
															if (obj != null) {
			%>
			<p>
				Name
				<%=obj.getfName()%>&nbsp;<%=obj.getlName()%>&nbsp;
			</p>
			<p>
				Identification -
				<%=obj.getNationality()%></p>
			<p>
				Identification Info -
				<%=obj.getPassNum()%>
			</p>
			<%
				}}
			%>

		</div>
<%} %>
</body>
</html>