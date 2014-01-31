<%@page import="com.airlinemgmt.beans.AirlineEmployee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<br>
<br>
<div style="height:100px,width:100px,overflow:scroll;">

<form action="../EmployeeListProcessor" method="post" class="well">
<%
	AirlineEmployee emp=new AirlineEmployee();
	if (session.getAttribute("empSearchObj")!=null)
	{
		emp=(AirlineEmployee)session.getAttribute("empSearchObj");
	}
		%>
		<center>
			<h3>Personal Details</h3>

			<table cellpadding="10px" cellspacing="10px" class="table-striped">
				<tr>
					<td>Name</td>
					<td><input type="text" placeholder="First Name" name="fName"
						value="<%=emp.getfName()!=null?emp.getfName():""%>" class="form-control"></td>
					<td><input type="text" placeholder="Last Name" name="lName"
						value="<%=emp.getlName()!=null?emp.getlName():""%>" class="form-control"></td>
				</tr>
				<tr>
					<td>SSN</td>
					<td><input type="text" placeholder="Social Security Info"
						name="ssn" value="<%=emp.getSSN()!=null?emp.getSSN():""%>" class="form-control"></td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td><input type="text" placeholder="Date of Birth" name="dob" value="<%=emp.getDob()!=null?emp.getDob():""%>" class="form-control">
					</td>
				</tr>
				<tr>
					<td>Contact Information</td>
					<td><input type="text" placeholder="Contact Information"
						name="cInfo" value="<%=emp.getContactNo()!=null?emp.getContactNo():""%>" class="form-control"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" placeholder="Address" name="address" value="<%=emp.getAddress()!=null?emp.getAddress():""%>" class="form-control">
					</td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" placeholder="City" name="city" value="<%=emp.getCity()!=null?emp.getCity():""%>" class="form-control">
					</td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" placeholder="State" name="state" value="<%=emp.getState()!=null?emp.getState():""%>" class="form-control">
					</td>
				</tr>
				<tr>
					<td>Zip Code</td>
					<td><input type="text" placeholder="Zip Code" name="zip" value="<%=emp.getZipCode()!=null?emp.getZipCode():""%>" class="form-control">
					</td>
				</tr>
			</table>
	
	</center>
	<br>
	<br>

	<center>
		<h3>Work Information</h3>
		<table cellpadding="10px" cellspacing="10px" class="table-striped">
			<tr>
				<td>Work Position</td>
				<td>
				<td>
				<input type="text" placeholder="Work Position" name="wTitle" value="<%=emp.getPosition()!=null?emp.getPosition():""%>" class="form-control">
				</td>
			</tr>
			<tr>
				<td>Work Description</td>
				<td>
				<td>
				<input type="text" placeholder="Work Description" name="wDesc" value="<%=emp.getWorkDesc()!=null?emp.getWorkDesc():""%>" class="form-control">
					</td>
			</tr>

		</table>
	
	<br>
	<br>
	<input type="submit" value="Search Employee" class="btn btn-success">
	</center>
</form>
		</div>
</body>
</html>