<%@page import="com.airlinemgmt.beans.Traveller"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Customer</title>
<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>


	<form action="../CustomerProcessor" method="post" class="well">
		
		<center>
			<h2>Register New User</h2>
			<br> <br> <br>
			<%
				Traveller traveller = new Traveller();
				if (session.getAttribute("tObj") != null) {
					traveller = (Traveller) session.getAttribute("tObj");
				}
			%>
			
			<%
		String errorMessage = "";
		if(session.getAttribute("error")!=null){
		errorMessage = (String) session.getAttribute("error");
		}
	%>
	<label id="errorMessage"><b><%=errorMessage%></b></label>

			<h3>Personal Details</h3>

			<table cellpadding="10px" cellspacing="10px" class="">
				
				<tr>
					<td>Name</td>
					<td><input type="text" placeholder="First Name" name="fName"
						value="<%=traveller.getfName() != null ? traveller.getfName() : ""%>"
						class="form-control" required="true" ></td>
					<td><input type="text" placeholder="Last Name" name="lName"
						value="<%=traveller.getlName() != null ? traveller.getlName() : ""%>"
						class="form-control" required="true"></td>
				</tr>

				<tr>
					<td>Date of Birth</td>
					<td>
						
						
						<div class="input-append date input-group form-control" id="dp1"
							data-date="12-07-2012" data-date-format="mm-dd-yyyy">
							<input class="span2" name="dob" size="16" type="text"
								value="<%=traveller.getDob() != null ? traveller.getDob() : ""%>" readonly> &nbsp;<span
								class="add-on glyphicon glyphicon-calendar" required="true"></span>
						</div>
						
						
						</td>
				</tr>
				<tr>
					<td>Contact Information</td>
					<td><input type="text" placeholder="Contact Information"
						name="cInfo"
						value="<%=traveller.getContactNo() != null ? traveller
					.getContactNo() : ""%>"
						class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" placeholder="Address" name="address"
						value="<%=traveller.getAddress() != null ? traveller.getAddress()
					: ""%>"
						class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" placeholder="City" name="city"
						value="<%=traveller.getCity() != null ? traveller.getCity() : ""%>"
						class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" placeholder="State" name="state"
						value="<%=traveller.getState() != null ? traveller.getState() : ""%>"
						class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>Zip Code</td>
					<td><input type="text" placeholder="Zip Code" name="zip"
						value="<%=traveller.getZipCode() != null ? traveller.getZipCode()
					: ""%>"
						class="form-control" required="true"></td>
				</tr>
			</table>

		</center>
		<br> <br>

		<center>
			<h3>Travel Information</h3>
			<table cellpadding="10px" cellspacing="10px" class="table-striped">
				<tr>
					<td>Nationality</td>
					<td>
					<td><input type="text" placeholder="Nationality"
						name="uNationality"
						value="<%=traveller.getNationality() != null ? traveller
					.getNationality() : ""%>"
						class="form-control" required="true"></td>
				</tr>
				<tr>
					<td>Passport Number</td>
					<td>
					<td><input type="text" placeholder="Passport Number"
						value="<%=traveller.getPassNum() != null ? traveller.getPassNum()
					: ""%>"
						name="uPNumber" class="form-control" required="true"></td>
				</tr>

			</table>
		</center>
		<br> <br>

		<center>
			<h3>Account Information</h3>
			<table cellpadding="10px" cellspacing="10px" class="table-striped"
				class="form-control">
				<tr>
					<td>Username</td>
					<td><input type="text" placeholder="Username" name="uName"
						value="<%=traveller.getUserName() != null ? traveller.getUserName()
					: ""%>"
						class="form-control" required="true" ></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" placeholder="Username"
						name="uPasswd"
						value="<%=traveller.getPassword() != null ? traveller.getPassword()
					: ""%>"
						class="form-control" required="true" ></td>
				</tr>
				<tr>
					<td>Credit Card Number</td>
					<td><input type="password" placeholder="CCNumber" name="uCC"
						value="<%=traveller.getCreditCardNum() != null ? traveller
					.getCreditCardNum() : ""%>"
						class="form-control" required="true" ></td>
				</tr>
			</table>



			<input type="submit" class="btn btn-success" value="Create User">

			<br> <br> <br> <br> <br>
		</center>
	</form>

</body>
</html>