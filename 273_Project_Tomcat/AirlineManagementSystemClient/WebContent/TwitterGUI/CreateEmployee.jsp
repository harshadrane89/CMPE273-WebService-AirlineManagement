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

<form action="../EmployeeProcessor" method="post" class="well">
<center>
	<h2> Create New Employee</h2>
	<br>
	<br>
	<br>
	<%
		String errorMessage = "";
		if(session.getAttribute("error")!=null){
		errorMessage = (String) session.getAttribute("error");
		}
	%>
	<label id="errorMessage"><b><%=errorMessage%></b></label>
	
	
	<%
	AirlineEmployee emp=new AirlineEmployee();
	if (session.getAttribute("empObj")!=null)
	{
		emp=(AirlineEmployee)session.getAttribute("empObj");
	}
		%>
		
			<h3>Personal Details</h3>

			<table cellpadding="10px" cellspacing="10px" class="table-striped">
				<tr>
					<td>Name</td>
					<td><input type="text" placeholder="First Name" name="fName"
						value="<%=emp.getfName()!=null?emp.getfName():""%>" class="form-control" required="true"></td>
					<td><input type="text" placeholder="Last Name" name="lName"
						value="<%=emp.getlName()!=null?emp.getlName():""%>" class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>SSN</td>
					<td><input type="text" placeholder="Social Security Info"
						name="ssn" value="<%=emp.getSSN()!=null?emp.getSSN():""%>" class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td>
					<div class="input-append date input-group form-control" id="dp3"
							data-date="12-07-2012" data-date-format="mm-dd-yyyy">
							<input class="span2" name="dob" size="16" type="text"
								value="<%=emp.getHireDate() != null ? emp.getHireDate() : ""%>" readonly> &nbsp;<span
								class="add-on glyphicon glyphicon-calendar" required="true"></span>
						</div>
					</td>
				</tr>
				<tr>
					<td>Contact Information</td>
					<td><input type="text" placeholder="Contact Information"
						name="cInfo" value="<%=emp.getContactNo()!=null?emp.getContactNo():""%>" class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" placeholder="Address" name="address" value="<%=emp.getAddress()!=null?emp.getAddress():""%>" class="form-control" required="true">
					</td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" placeholder="City" name="city" value="<%=emp.getCity()!=null?emp.getCity():""%>" class="form-control" required="true">
					</td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" placeholder="State" name="state" value="<%=emp.getState()!=null?emp.getState():""%>" class="form-control" required="true">
					</td>
				</tr>
				<tr>
					<td>Zip Code</td>
					<td><input type="text" placeholder="Zip Code" name="zip" value="<%=emp.getZipCode()!=null?emp.getZipCode():""%>" class="form-control" required="true">
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
				<input type="text" placeholder="Work Position" name="wTitle" value="<%=emp.getPosition()!=null?emp.getPosition():""%>" class="form-control" required="true">
				</td>
			</tr>
			<tr>
				<td>Work Description</td>
				<td>
				<td><textarea placeholder="Work Description" name="wDesc" value="<%=emp.getWorkDesc()!=null?emp.getWorkDesc():""%>" class="form-control" required="true">
					</textarea></td>
			</tr>
			<tr>
				<td>Hire Date</td>
				<td>
				<td>
					<div class="input-append date input-group form-control" id="dp1"
							data-date="12-07-2012" data-date-format="mm-dd-yyyy">
							<input class="span2" name="hireDate" size="16" type="text"
								value="<%=emp.getHireDate() != null ? emp.getHireDate() : ""%>" readonly> &nbsp;<span
								class="add-on glyphicon glyphicon-calendar" required="true"></span>
						</div>
				</td>
			</tr>

		</table>
	</center>
	<br>
	<br>

	<center>
		<h3>Account Information</h3>
		<table cellpadding="10px" cellspacing="10px" class="table-striped" class=" form-control">
			<tr>
				<td>
					Username
				</td>
				<td>
					<input type="text" placeholder="Username" name="uName" value="<%=emp.getUserName()!=null?emp.getUserName():""%>" class="form-control" required="true">
				</td>
			</tr>
			<tr>
				<td>
					Password
				</td>
				<td>
					<input type="password" placeholder="Username" name="uPasswd" value="<%=emp.getPassword()!=null?emp.getPassword():""%>" class="form-control" required="true">
				</td>
			</tr>
		</table>
		<input type="submit" class="btn btn-success" value="Create Account">

			<br> <br> <br> <br> <br>
	</center>
	</form>
</body>
</html>