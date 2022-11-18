
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h2 align="center">Employee Display Information</h2>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<th>ID</th>
				<th>NAME</th>
				<th>DEPTID</th>
				<th>SALARY</th>
				<th>DESIGNATION</th>
				<th>MANAGER</th>
				<th>UPDATE</th>
				<th>DELETE</th>
			</thead>

			<c:forEach items="${employee}" var="employee">

				<c:choose>
					<c:when test="${employee.designation.equals('manager')}">
						<c:set var="color" value="background-color:red" />
					</c:when>
					<c:when test="${employee.designation.equals('developer')}">
						<c:set var="color" value="background-color:orange" />
					</c:when>
					<c:otherwise>
						<c:set var="color" value="background-color:yellow" />
					</c:otherwise>
				</c:choose>
				<tr>
					<td>${employee.eid}</td>
					<td>${employee.ename}</td>
					<td>${employee.deptid}</td>
					<td>${employee.salary}</td>
					<td>${employee.designation}</td>
					<td>${employee.mgrid}</td>
					<td>
						<form action="EmployeeUpdateServlet">
							<input type="hidden" name="id" value="${employee.eid}" />
							<button type="submit" class="btn btn-warning">Update</button>
						</form>
					</td>
					<td>
						<form action="EmployeeDeleteServlet">
							<input type="hidden" name="id" value="${employee.eid}" />
							<button onclick="form.submit()" class="btn btn-danger">Delete</button>
						</form>
					</td>


				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
