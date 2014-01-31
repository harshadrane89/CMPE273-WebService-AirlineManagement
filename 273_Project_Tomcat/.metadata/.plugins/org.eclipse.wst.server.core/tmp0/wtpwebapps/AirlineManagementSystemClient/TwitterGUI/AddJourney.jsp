<%@page import="com.airlinemgmt.beans.Journey"%>
<%@page import="com.airlinemgmt.beans.FlightDetails"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title></title>
<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../css/datepicker.css" rel="stylesheet">
<link href="../css/prettify.css" rel="stylesheet">
</head>
<body>

	<div class="well">
		<%
			if (session.getAttribute("newFlight") != null) {
				FlightDetails flight = (FlightDetails) session
						.getAttribute("newFlight");
		%>
		<br>

		<center>
			<h1>Flight Info</h1>
		</center>
		<br> <br>
		<h2>
			Airline -
			<%=flight.getAirlineName()%></h2>
		<br>
		<h3>
			Flight Number -<%=flight.getFlightNum()%></h3>
		<br>
		<h4><%=flight.getSrc()%>
			--><%=flight.getDest()%>
		</h4>
		<br>
		<h4>
			Flight Date -
			<%=flight.getFlightDate()%>
		</h4>
		<br> <br> <br>
		<%
			if (flight.getJourneyInfo() != null) {
					Journey[] journey = flight.getJourneyInfo();
		%>
		<center>
			<h4>Journeys For The Flight</h4>
			<table class="table-striped" width="800px" cellpadding="10px">
				<thead>
					<tr>

						<td><b>Source</b></td>
						<td><b>Destination</b></td>
						<td><b>Take - Off Date</b></td>
						<td><b>Landing Date</b></td>
						<td><b>Fare</b></td>
					</tr>
					<tr>
						<td><%=journey[0].getBoardingPoint()%></td>
						<td><%=journey[0].getDestinationPoint()%></td>
						<td><%=journey[0].getDepartureDate()%></td>
						<td><%=journey[0].getArrivalDate()%></td>
						<td><%=journey[0].getFare()%></td>
					</tr>
					<%
						for (int i = 1; i < journey.length; i++) {
					%>
					<tr>
						<td><%=journey[i].getBoardingPoint()%></td>
						<td><%=journey[i].getDestinationPoint()%></td>
						<td><%=journey[i].getDepartureDate()%></td>
						<td><%=journey[i].getArrivalDate()%></td>
						<td><%=journey[i].getFare()%></td>
						<td>
							<form action="../JourneyProcessor" method="get">
								<input type="submit" value="Delete" name="<%=i%>"
									class="btn btn-danger">
							</form>
						</td>
					</tr>

					<%
						}
					%>
				
			</table>
		</center>


		<%
			}
			}
		%>
		<br> <br>
		<form action="../FlightProcessor" method="post">
			<center>
				<input type="submit" value="Create Flight" class="btn btn-success">
			</center>
		</form>

	</div>
	<form action="../JourneyProcessor" method="post" class="well">
		<center>

			<%
				String errorMessage = "";
				if (session.getAttribute("error") != null) {
					errorMessage = (String) session.getAttribute("error");
				}
			%>
			<label id="errorMessage"><b><%=errorMessage%></b></label>


			<h3>Add Journeys</h3>
			<br /> <br />


			<table cellpadding="15px" cellspacing="15px" class="table-striped">
				<tr>
					<td>Source & Destination</td>
					<td><input type="text" name="src" placeholder="Source"
						class="form-control" required="true"></td>
					<td><input type="text" name="dest" placeholder="Destination"
						class="form-control" required="true"></td>
				</tr>

				<tr>
					<td> Departure & Arrival Date</td>
					<td>
						<div class="input-append date input-group" id="dp1"
							data-date="12-07-2012" data-date-format="mm-dd-yyyy">
							<input class="span2" name="deptDate" size="16" type="text"
								value="12-07-2012" readonly> &nbsp;<span
								class="add-on glyphicon glyphicon-calendar"></span>
						</div>
					</td>
					<td>
						<div class="input-append date input-group" id="dp2"
							data-date="12-08-2012" data-date-format="mm-dd-yyyy">
							<input class="span2" name="arrDate" size="16" type="text"
								value="12-08-2012" readonly> &nbsp;<span
								class="add-on glyphicon glyphicon-calendar"></span>
						</div>
					</td>
				</tr>
				<tr>
					<td>Flight Fare</td>
					<td><input type="text" name="fare" placeholder="Fare"
						class="form-control" required="true"></td>

				</tr>


			</table>

			<br> <br> <input type="submit" class="btn btn-success"
				value="Add Journey">

		</center>


	</form>
	<script src="../js/prettify.js"></script>
	<script src="../js/jquery-1.9.1.js"></script>
	<script src="../js/bootstrap-datepicker.js"></script>
	<script>
		$(function() {
			window.prettyPrint && prettyPrint();
			$('#dp1').datepicker();
			$('#dp2').datepicker();

			var checkin = $('#dpd1').datepicker({
				onRender : function(date) {
					return date.valueOf() < now.valueOf() ? 'disabled' : '';
				}
			}).on('changeDate', function(ev) {
				if (ev.date.valueOf() > checkout.date.valueOf()) {
					var newDate = new Date(ev.date)
					newDate.setDate(newDate.getDate() + 1);
					checkout.setValue(newDate);
				}
				checkin.hide();
				$('#dpd2')[0].focus();
			}).data('datepicker');
			var checkout = $('#dpd2')
					.datepicker(
							{
								onRender : function(date) {
									return date.valueOf() <= checkin.date
											.valueOf() ? 'disabled' : '';
								}
							}).on('changeDate', function(ev) {
						checkout.hide();
					}).data('datepicker');
		});
	</script>
	<script src="http://www.google-analytics.com/urchin.js"
		type="text/javascript">
		
	</script>
</body>
</html>