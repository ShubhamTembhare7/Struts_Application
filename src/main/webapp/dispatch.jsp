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



   <%-- <html:form action="dis.do">
    
        <html:submit property="n1" ><bean:message key="dispatch.form.insert" /></html:submit><br/>
        <html:submit property="n1" ><bean:message key="dispatch.form.update" /></html:submit><br/>
        
    </html:form>
   
  <html:link action="lact.do">click here to go to Successs</html:link>
 --%>
 <br/><br/><br/><br/><br/><br/>
    
<button><html:link action="clang?langauge=en">English</html:link></button>
&nbsp;&nbsp;&nbsp;&nbsp;

<button><html:link action="clang?langauge=hi">Hindi</html:link></button>

</body>
</html>