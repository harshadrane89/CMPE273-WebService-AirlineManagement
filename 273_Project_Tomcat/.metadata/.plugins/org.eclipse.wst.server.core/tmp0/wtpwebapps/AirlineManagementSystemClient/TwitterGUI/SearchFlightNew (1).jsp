<%@page import="com.airlinemgmt.beans.Journey"%>
<%@page import="com.airlinemgmt.beans.FlightDetails"%>
<%@page import="com.airlinemgmt.beans.Traveller"%>
<%@page import="com.airlinemgmt.beans.AirlineEmployee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
	<form action="../FlightListProcessor" method="post" class="well">
		<%
			Journey journey = new Journey();
			if (session.getAttribute("searchJourney") != null) {
				journey = (Journey) session
						.getAttribute("searchJourney");
			}
		%>
		<center>
			<h3>Search Flight</h3>

			<table cellpadding="10px" cellspacing="10px" class="table-striped">
				<tr>
					<td>Source & Destination</td>
					<td><input type="text" placeholder="Source" name="src"
						value="<%=journey.getBoardingPoint() != null ? journey.getBoardingPoint()
					: ""%>"
						class="form-control"></td>
					<td><input type="text" placeholder="Destination" name="dest"
						value="<%=journey.getDestinationPoint() != null ? journey.getDestinationPoint()
					: ""%>"
						class="form-control"></td>
				</tr>
				<tr>
					<td>Airline Name</td>
					<td><input type="text" placeholder="Airline Name"
						name="airName"
						value="<%=journey.getAirline() != null ? journey
					.getAirline() : ""%>"
						class="form-control"></td>
				</tr>
				<tr>
					<td>Flight Number</td>
					<td><input type="text" placeholder="Flight Number" name="fNum"
						value="<%=journey.getFlightNum() != null ? journey
					.getFlightNum() : ""%>"
						class="form-control"></td>
				</tr>
				<tr>
					<td>Fare</td>
					<td><input type="text" placeholder="Minimum Fair"
						name="minFair" class="form-control" value="<%=journey.getMinFare() != null ? journey
					.getMinFare() : ""%>"></td>
					<td><input type="text" placeholder="Maximum Fair"
						name="maxFair" class="form-control" value="<%=journey.getMaxFare() != null ? journey
					.getMaxFare() : ""%>"></td>
				</tr>
				<tr>
					<td>Flight Date</td>
					<td>
						<div class="input-append date input-group" id="dp3"
							data-date="12-02-2012" data-date-format="dd-mm-yyyy">
							<input class="span2" size="16" type="text" value="12-02-2012"
								readonly> &nbsp;<span
								class="add-on glyphicon glyphicon-calendar"></span>
						</div>
					</td>
				</tr>
			</table>
			<br> <br> <input type="submit" class="btn btn-success"
				value="Search >>">
		</center>
		<br> <br>
	</form>

	<script src="js/prettify.js"></script>
	<script src="js/jquery-1.9.1.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script>
		$(function() {
			window.prettyPrint && prettyPrint();
			$('#dp3').datepicker();

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