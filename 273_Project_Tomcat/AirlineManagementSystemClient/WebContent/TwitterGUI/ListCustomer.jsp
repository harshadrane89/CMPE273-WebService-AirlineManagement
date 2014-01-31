<%@page import="com.airlinemgmt.beans.Traveller"%>
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
		Traveller[] tArray = null;
		if (session.getAttribute("tList") != null) {
			tArray = (Traveller[]) session.getAttribute("tList");
		}
	%>

	<%
		if (tArray != null) {
			if (tArray.length > 0) {
	%>
	<table class="table-striped" width="800px" cellpadding="10px">

		<thead>
			<tr>
				<td>Customer Id</td>
				<td>Name</td>
				<td>Nationality</td>
				<td>Passport Number</td>
			</tr>
		</thead>

		<%
			int i=0;
			for (Traveller traveller : tArray) {
				if(traveller.getIsActive()==1){
		%>
			<tr>
				<td>
					<%=traveller.getCustId()%>
				</td>
				<td>
					<%=traveller.getfName()%>&nbsp;<%=traveller.getlName()%>
				</td>
				<td>
					<%=traveller.getNationality()%>
				</td>
				<td>
					<%=traveller.getPassNum()%>
				</td>
				<td>
				<form action="../CustomerListProcessor" method="get">
					<input type="submit" name="<%=i%>" value="View"
						class="btn btn-danger">
						</form>
				</td>
			</tr>

		
		<%
				}
			i++;
			}
		%>
	</table>
	<%
		}
		}
	%>
</body>
</html>