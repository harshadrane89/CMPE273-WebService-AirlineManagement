<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/datepicker.css" rel="stylesheet">
<link href="../css/prettify.css" rel="stylesheet">
<style type="text/css">
/* bootstrap overrides */
html,body {
	height: 100%;
}

.main,.row-fluid {
	height: 100%;
}

.main:before,.main:after,.column:before,.column:after {
	content: "";
	display: table;
}

.main:after,.column:after {
	clear: both;
}

.column {
	height: 80%;
	overflow: auto;
	*zoom: 1;
}

.column .padding {
	padding: 20px;
}

.box {
	bottom: 0;
	left: 0;
	position: absolute;
	right: 0;
	top: 0;
}

.span9.full {
	width: 95%;
}
</style>
<title>Airline Management <%
	if (session.getAttribute("title") != null) {
%> <%="-" + session.getAttribute("title")%> <%
 	}
 %></title>
<%
	String val = null;
	String lval = null;
%>
</head>
<body>


	<%@include file="Navbar.jsp"%>
	<br>
	<br>
	<br>
	
	<br>
	<center>
		<%
			if (session.getAttribute("title") != null) {
		%>
		<h2><%=session.getAttribute("title")%></h2>
		<%
			}
		%>
	</center>


	<%
		if (session.getAttribute("leftNavBar") == null) {
			val = (String) session.getAttribute("destination");
	%>

	<jsp:include page="<%=val%>">
		<jsp:param name="xx" value="xx" />
	</jsp:include>
	<%
		} else {

			String leftNavBar = (String) session.getAttribute("leftNavBar");
			String destination = (String) session
					.getAttribute("destination");
	%>
	
		
			<div class="row-fluid row">
				<div class="column span4 col-md-4" style="width=30%">
					
						<jsp:include page="<%=leftNavBar%>">
							<jsp:param name="xx" value="xx" />
						</jsp:include>
					
				</div>

				<div class="column span9" style="width=10000px">
					<div class="padding">
						<div class="full span9">
							<jsp:include page="<%=destination%>">
								<jsp:param name="xx" value="xx" />
							</jsp:include>
						</div>
					</div>
				</div>
			</div>
		

	
	<%
		}
	%>
	
	
	<script src="../js/prettify.js"></script>
	<script src="../js/jquery-1.9.1.js"></script>
	<script src="../js/bootstrap-datepicker.js"></script>
	<script>
		$(function() {
			window.prettyPrint && prettyPrint();
			$('#dp1').datepicker();
			$('#dp2').datepicker();
			$('#dp3').datepicker();
			$('#dp4').datepicker();

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