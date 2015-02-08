<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="staff.dto.Employee" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<link href="resources/bootstrap.css" rel="stylesheet" />

<% List<Employee> staff = (List<Employee>) request.getAttribute("staff"); %>

<title>Працівники відділу адаптції</title>
</head>

<body class="container">
	<h4>Працівники відділу адаптції</h4>
	<table class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Ім'я та прізвище</th>
				<th>Посада</th>
				<th>e-mail</th>
				<th>День народження</th>
			</tr>
		</thead>

		<tbody>
			<%
				for (Employee e : staff) {
			%>
			<tr>
				<td><%=e.getId()%></td>
				<td><%=e.getFirstName() + " " +e.getLastName()%></td>
				<td><%=e.getTitle() %></td>
				<td><%=e.getEmail() %></td>
				<td><%="NaN" %></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>