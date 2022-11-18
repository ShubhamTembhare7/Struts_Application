<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>   

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
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
    
    <H2 align ="center"><bean:message key="employee.form.insert.heading" /></H2>
   <div class='container'  style="width:50%">    
   <html:form action="EmployeeUpdate.do">
  <table cellspacing="2" cellpadding="3">
  
  	<tr>  
  		<td> <bean:message key="employee.form.register.id"/> </td>
  		<td><html:text property="eid"></html:text>  </td> 	
  	</tr>
  	<tr>  
  		<td> <bean:message key="employee.form.register.name"/> </td>
  		<td><html:text property="ename"></html:text>  </td> 	
  	</tr>
  	<tr>  
  		<td> <bean:message key="employee.form.register.deptid"/> </td>
  		<td><html:text property="deptid"></html:text>  </td> 	
  	</tr>
  	<tr>  
  		<td> <bean:message key="employee.form.register.salary"/> </td>
  		<td><html:text property="salary"></html:text>  </td> 	
  	</tr>
  	<tr>  
  		<td> <bean:message key="employee.form.register.designation"/> </td>
  		<td><html:text property="designation"></html:text>  </td> 	
  	</tr>
  	<tr>  
  		<td> <bean:message key="employee.form.register.mgrid"/> </td>
  		<td><html:text property="mgrid"></html:text>  </td> 	
  	</tr>
  <tr>  
 <td colspan="2"><html:submit><bean:message key="employee.form.register.insert"/></html:submit></td>
  
  </tr>  
  
  </table>
  </html:form>  
    </div>
</body>
</html>