<%@page import="com.airlinemgmt.beans.AirlineEmployee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
<form action="../CustomerNavigator" method="post"><input type="submit" value="<<Back" class="btn btn-success"> </form>
	<form class="well">
		<%
			AirlineEmployee emp = new AirlineEmployee();

			if (session.getAttribute("empObj") != null) {
				emp = (AirlineEmployee) session.getAttribute("empObj");
			}
		%>
		<center>
			<h2>View Employee</h2>
		</center>

		<center>
			<h3>Personal Details</h3>

			<table cellpadding="10px" cellspacing="10px" class="well">
				<tr>
					<td>Name</td>
					<td><%=emp.getfName()%>&nbsp;<%=emp.getlName()%></td>

				</tr>
				<tr>
					<td>SSN</td>
					<td><%=emp.getSSN()%></td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td><%=emp.getDob()%></td>
				</tr>
				<tr>
					<td>Contact Information</td>
					<td><%=emp.getContactNo()%></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><%=emp.getAddress()%></td>
				</tr>
				<tr>
					<td>City</td>
					<td><%=emp.getCity()%></td>
				</tr>
				<tr>
					<td>State</td>
					<td><%=emp.getState()%></td>
				</tr>
				<tr>
					<td>Zip Code</td>
					<td><%=emp.getZipCode()%></td>
				</tr>
			</table>

		</center>
		<br> <br>

		<center>
			<h3>Work Information</h3>
			<table cellpadding="10px" cellspacing="10px" class="">
				<tr>
					<td>Work Position</td>
					<td>
					<td><%=emp.getPosition()%></td>
				</tr>
				<tr>
					<td>Work Description</td>
					<td>
					<td><%=emp.getWorkDesc()%></td>
				</tr>
				<tr>
					<td>Hire Date</td>
					<td>
					<td><%=emp.getHireDate()%></td>
				</tr>

			</table>
		</center>
		<br> <br>

		<center>
			<h3>Account Information</h3>
			<table cellpadding="10px" cellspacing="10px" class="">
				<tr>
					<td>Username</td>
					<td><%=emp.getUserName()%></td>
				</tr>

			</table>
		</center>
	</form>
	<center>
		<table>
			<tr>
				<form action="../EmployeeViewProcessor" method="get">
					<input type="submit" class="btn btn-success" value="Edit/Update">
				</form>
				&nbsp; &nbsp; &nbsp; &nbsp;
				<form action="../EmployeeViewProcessor" method="post">
					<input type="submit" class="btn btn-success" value="Delete">
				</form>
			</tr>
		</table>
	</center>
</body>
</html>