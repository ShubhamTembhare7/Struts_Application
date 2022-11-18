<%@page import="com.yash.dao.EmployeeDao,com.yash.dao.EmployeeDaoImpl,com.yash.form.Employee,java.util.* "%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>


<body>
	<h2 align="center">Employee Display Information</h2>
	<div class="container">
		<table  class="table table-striped">
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

			<c:forEach items="${employees}" var="employee">

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
						<form>
							<input type="EmployeeUpdate.do" name="id" value="${employee.eid}" />
							<button onclick="form.submit()" class="btn btn-warning">Update</button>
						</form>
					</td>
					<td>
						<form  action="del.do">
							<input type="hidden" name="id" value="${employee.eid}" />
							<button onclick="form.submit()" class="btn btn-danger">Delete</button>
						</form>
					</td>


				</tr>
			</c:forEach>
		</table>
	</div>
</body> 