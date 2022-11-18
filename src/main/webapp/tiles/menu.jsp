<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
           
        </style>
        
    </head>
   <%--  <body bgcolor="grey">
        <button><html:link action="clayout.do?method=body">display body</html:link></button><br>
        <button><html:link action="clayout.do?method=mody">display mody</html:link></button><br>
       
    </body> --%>
    <body bgcolor="grey">
        <button><html:link action="clayout.do?method=Profile">Profile</html:link></button><br>
        <button><html:link action="clayout.do?method=mody">Display All Employee</html:link></button><br>
         <button><html:link action="clayout.do?method=Add">Add Employee</html:link></button><br>
           <button><html:link action="clayout.do?method=Delete">Delete Employee</html:link></button><br>
    </body>
</html>