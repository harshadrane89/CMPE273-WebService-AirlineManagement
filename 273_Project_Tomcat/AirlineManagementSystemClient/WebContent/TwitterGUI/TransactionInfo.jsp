<%@page import="com.airlinemgmt.beans.Reservation"%>
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


	<%
	String fare="";
	if(session.getAttribute("myReservation")!=null)
	{
		Reservation reservation =(Reservation)session.getAttribute("myReservation");
		fare=reservation.getFare()+"";
	}
		%>
	
	<center>
	<h2>Trip Summary</h2>
	<br>
	<br>
	<br>
	<br>
		<h3>Total Fare <%=fare %></h3>
	</center>
	
	
	<form action="../TransactionProcessor" method="post" class="well">
		<center>
			<h3>Transaction Info</h3>

			<table cellpadding="10px" cellspacing="10px" class="table-striped">
				<tr>
					<td>Card Number</td>
					<td><input type="text" placeholder="Credit Card Number"
						name="cardNum" class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>CVV</td>
					<td><input type="text" placeholder="CVV" name="cvv" class="form-control" required="true"></td>
				</tr>

				<tr>
					<td>Expire Date</td>
					<td><div class="input-append date" id="dpMonths"
							data-date="102/2012" data-date-format="mm/yyyy"
							data-date-viewmode="years" data-date-minviewmode="months">
							<input class="span2" size="16" name="expiryDate" type="text"
								value="02/2012" readonly> &nbsp; <span
								class="add-on glyphicon glyphicon-calendar"></span>
						</div></td>
				</tr>
			</table>
			<br /> <br /> <input type="submit" class="btn btn-primary"
				value="Submit">

		</center>

	</form>

	<script src="../js/prettify.js"></script>
	<script src="../js/jquery-1.9.1.js"></script>
	<script src="../js/bootstrap-datepicker.js"></script>
	<script>
		$(function() {
			window.prettyPrint && prettyPrint();
			$('#dp3').datepicker();
			$('#dpMonths').datepicker();

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
	
			<%
		String errorMessage = "";
		if(session.getAttribute("error")!=null){
		errorMessage = (String) session.getAttribute("error");
		}
	%>
	<label id="errorMessage"><b><%=errorMessage%></b></label>
</body>
</html>