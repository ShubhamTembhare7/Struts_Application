<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" ignore="true" /></title>
</head>
<body>
    
  
<h2 style="color: pink" ><tiles:getAsString name="heading" ignore="true" /></h2>


    <table  border="1" cellpadding="3" cellspacing="4" align="center">
        <tr height="20%" >
            <td colspan="2"><tiles:insert attribute="header" /> </td>
        </tr>
        
        <tr height="230px">
            <td width="30%"><tiles:insert attribute="menu" />  </td>
            <td width="70%"><tiles:insert attribute="body" />  </td>
        </tr>
        
        <tr height="20%">
            <td colspan="2"><tiles:insert attribute="footer" /> </td>
        </tr>
    
    
    </table>




</body>
</html>