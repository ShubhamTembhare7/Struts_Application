<%@page import="com.yash.dao.EmployeeDaoImpl"%>
<%@ page import="com.yash.form.*,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <table>
        <logic:iterate name="employees" id="employee">
            <tr>
                <td><bean:write name="employee" property="ename" /></td>
                <td><bean:write name="employee" property="designation" /></td>
                <td><bean:write name="employee" property="salary" /></td>
                <td><bean:write name="employee" property="deptid" /></td>
            </tr>
       </logic:iterate>
   </table>
</body>
</html>