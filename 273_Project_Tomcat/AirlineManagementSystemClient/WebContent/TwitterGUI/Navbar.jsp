<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/bootstrap.css" rel="stylesheet" media="screen">



</head>
<body>

	
		<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Airline Management</a>
				</div>
				<div class="navbar-collapse collapse">
				<form action="../Navigator" method="post">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">Home</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Customer <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><input type="submit" value="Create New Customer"
									name="1" class="btn btn-link"></li>
								<li><input type="submit" value="Search Customer" name="2"
									class="btn btn-link"></li>

							</ul></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Employee <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><input type="submit" value="Create New Employee"
									name="3" class="btn btn-link"></li>
								<li><input type="submit" value="Search Employee" name="4"
									class="btn btn-link"></li>
							</ul></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Flight <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><input type="submit" value="Create Flight" name="5"
									class="btn btn-link"></li>
								<li><input type="submit" value="Search Flight" name="6"
									class="btn btn-link"></li>

							</ul></li>

						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Reservation <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><input type="submit" value="New Reservation" name="8"
									class="btn btn-link"></li>
								<li><input type="submit" value="All Reservations" name="7"
									class="btn btn-link"></li>

							</ul></li>


					</ul>
					</form>
					<ul class="nav navbar-nav navbar-right">
    					<li><form action="../LogOutServlet" method="post"><input type="submit" value="Signout"  class="btn btn-primary"></form></li>
          </ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	
</body>
</html>