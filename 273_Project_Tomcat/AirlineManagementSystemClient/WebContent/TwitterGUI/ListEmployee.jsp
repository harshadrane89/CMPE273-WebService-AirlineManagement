 <%@page import="com.airlinemgmt.beans.AirlineEmployee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
<title>Insert title here</title>
</head>
<body>
	<%
		AirlineEmployee[] eArray = null;
		if (session.getAttribute("eList") != null) {
			
			eArray = (AirlineEmployee[]) session.getAttribute("eList");
		}
	%>

	<%
		if (eArray != null) {
			if (eArray.length > 0) 
			{
	%>
	<table class="table-striped" width="800px" cellpadding="10px">

		<thead>
			<tr>
				<td>SSN Info
				</td>
				<td>Name</td>
				<td>Work Position</td>
				<td>Work Description</td>
				<td>Hiring Date</td>
				<td></td>
				<td></td>
			</tr>
		</thead>

		<%
			int i=0;
			for (AirlineEmployee emp : eArray) {
				
				{
				if(emp.getIsActive()==1)
					
				{
		%>
		<center>
			<tr>
				<td>
					<%=emp.getSSN()%>
				</td>
				<td>
					<%=emp.getfName()%>&nbsp;<%=emp.getlName()%>
				</td>
				<td>
					<%=emp.getPosition()%>
				</td>
				<td>
					<%=emp.getWorkDesc()%>
				</td>
				<td>
					<%=emp.getHireDate()%>
				</td>
				<td>
				<form action="../EmployeeListProcessor" method="get">
					<input type="submit" name="<%=i%>" value="View"
						class="btn btn-danger"></form>
				</td>
			</tr>
</center>
		
		<%
				}i++;}
			
			}
		%>
	</table>
	<%
		}
		}
	%>
</body>
</html>