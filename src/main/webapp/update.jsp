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

<h2 align="center">Employee Update Form</h2>
    <div class='container'>
    
    <form method="post" action="EmployeeUpdateorInsert.do" >
        <div class="form-group">
            <label for="eid">Employee Id</label> <input type="text" 
                class="form-control" name="eid" aria-describedby="eid" value="${employees.eid}"
                placeholder="Enter Eid">
        </div>
        <div class="form-group">
            <label for="ename">Employee Name</label> <input type="text"
                class="form-control" name="ename" aria-describedby="ename" value="${employees.ename}"
                placeholder="Enter ename">
        </div>
        <div class="form-group">
            <label for="depid">Employee Department</label> <input type="text"
                class="form-control" name="deptid" aria-describedby="deptid" value="${employees.deptid}"
                placeholder="Enter deptid">
        </div>
        <div class="form-group">
            <label for="salary">Employee Salary</label> <input type="text"
                class="form-control" name="salary" aria-describedby="salary" value="${employees.salary}"
                placeholder="Enter Salary">
        </div>
        <div class="form-group">
            <label for="designation">Employee Designation</label> <input
                type="text" class="form-control" name="designation"  value="${employees.designation}"
                aria-describedby="designation" placeholder="Enter aukaat">
        </div>
        <div class="form-group">
        
            <label for="manager">Employee Manager</label> <input type="text"
                class="form-control" name="mgrid" aria-describedby="mgrid"  value="${employees.mgrid}"
                placeholder="Khadoos">
                <div class="container">    
   </div>
        </div>
        <button type="submit" class="btn btn-primary">Update</button> 
        <%-- <form action="UpdateEmployeebyid"><input type=hidden name="emp" value="${employee}"/><button type="submit" class="btn btn-primary">Update</button></form> --%>
    </form>
    </div>


    
</body>
</html>