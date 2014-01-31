<%@page import="com.airlinemgmt.beans.Journey"%>
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


<form action="../ViewFlight" method="post">
						<input type="submit" value="<< Back" class="btn btn-success">
					</form>
	<%
		FlightDetails flight = new FlightDetails();
		if (session.getAttribute("flightObj") != null) {
			flight = (FlightDetails) session.getAttribute("flightObj");
		}
	%>
	<center>
	
	<%
		String errorMessage = "";
		if(session.getAttribute("error")!=null){
		errorMessage = (String) session.getAttribute("error");
		}
	%>
	<label id="errorMessage"><b><%=errorMessage%></b></label>
	
	
		<h3>Flight Details</h3>
		<form class="well" action="../ModifyFlight" method="post">
			<table cellpadding="10px" cellspacing="10px" class="table-striped">
				<tr>
					<td>Airline</td>
					<td><input type="text" placeholder="Airline Name" name="fName"
						value="<%=flight.getAirlineName() != null
					? flight.getAirlineName()
					: ""%>"
						class="form-control" required="true"></td>

				</tr>
				<tr>
					<td>Source</td>
					<td><input type="text" placeholder="Source" name="fSource"
						value="<%=flight.getSrc() != null ? flight.getSrc() : ""%>"
						class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>Destination</td>
					<td><input type="text" placeholder="Destination" name="fDestn"
						value="<%=flight.getDest() != null ? flight.getDest() : ""%>"
						class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>Flight Number</td>
					<td><input type="text" placeholder="Flight Number"
						name="flightNumber"
						value="<%=flight.getFlightNum() != null
					? flight.getFlightNum()
					: ""%>"
						S required="true" readonly></td>
				</tr>
				<tr>
					<td>Flight Take-Off Date</td>
					<td>
					<div class="input-append date input-group form-control" id="dp1"
							data-date="12-07-2012" data-date-format="mm-dd-yyyy">
							<input class="span2" name="fTDate" size="16" type="text"
								value="<%=flight.getJourneyInfo()[0].getDepartureDate() != null
					? flight.getJourneyInfo()[0].getDepartureDate()
					: ""%>" readonly> &nbsp;<span
								class="add-on glyphicon glyphicon-calendar" required="true"></span>
						</div>
					
					</td>
				</tr>
				<tr>
					<td>Flight Landing Date </td>
					<td>
						<div class="input-append date input-group form-control" id="dp2"
							data-date="12-07-2012" data-date-format="mm-dd-yyyy">
							<input class="span2" name="fLDate" size="16" type="text"
								value="<%=flight.getJourneyInfo()[0].getArrivalDate() != null
					? flight.getJourneyInfo()[0].getArrivalDate()
					: ""%>" readonly> &nbsp;<span
								class="add-on glyphicon glyphicon-calendar" required="true"></span>
						</div>
					</td>
				</tr>
				<tr>
					<td>Fare</td>
					<td><input type="text" placeholder="Fare" name="fare"
						value="<%=flight.getJourneyInfo()[0].getFare()!=0
					? flight.getJourneyInfo()[0].getFare()
					: ""%>"
						class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>Number of Seats</td>
					<td><input type="text" placeholder="Number of Seats"
						name="fSeats"
						value="<%=flight.getNumOfSeats() != 0 ? flight.getNumOfSeats() : ""%>"
						class="form-control" required="true"></td>
				</tr>

			</table>
		
			<br> <br>
	

			<%
				if (flight.getJourneyInfo() != null) {
					Journey[] journey = flight.getJourneyInfo();
			%>
			<center>
				<h4>
					<b>Journeys For The Flight</b>
				</h4>
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
								<form action="../ModifyJourneyProcessor" method="get">
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
			%>

				<input type="submit" value="Update Flight" class="btn btn-success">
</form>
	<table cellpadding="10px">
			<tr>
				<td></td>
				<td>
						
					</td>
			</tr>


		</table>


		
			
		
		
	</center>


	<form action="../ModifyJourneyProcessor" method="post" >
		<center>




			<h3>Add Journeys</h3>
			<br /> <br />


			<table cellpadding="15px" cellspacing="15px" >
				<tr>
					<td>Source & Destination</td>
					<td><input type="text" name="src" placeholder="Source"
						class="form-control" required="true"></td>
					<td><input type="text" name="dest" placeholder="Destination"
						class="form-control" required="true"></td>
				</tr>

				<tr>
					<td>Arrival & Departure Date</td>
					<td>
					
					
						<div class="input-append date input-group form-control" id="dp3"
							data-date="12-07-2012" data-date-format="mm-dd-yyyy">
							<input class="span2" name="deptDate" size="16" type="text"
								value="12-07-2012"  readonly> &nbsp;<span
								class="add-on glyphicon glyphicon-calendar"></span>
						</div>
					</td>
					<td>
						<div class="input-append date input-group form-control" id="dp4"
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
<br> <br>
<br> <br>
<br> <br>

	</form>

	

</body>
</html>