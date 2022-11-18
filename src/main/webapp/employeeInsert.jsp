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

<body>





   <H2 align="center">
        <bean:message key="employee.form.insert.heading" />
    </H2>
    <div class='container' style="width: 50%">
        <html:form action="addemp.do">
        <html:errors/>
        <logic:present name="hasError">
        <div class="alert alert-warning" role="alert">
        This validation Error Exits in the Form
        
        </div>           
        </logic:present>



           <table cellsapcing="2" cellpadding="3">
                <tr>
                    <td><bean:message key="employee.form.register.id" /></td>
                    <td><html:text property="eid" /></td>
                </tr>
                <tr>
                
                    <td><bean:message key="employee.form.register.name" /></td>
                    <td><html:text property="ename" /></td>
                    <td><p style="color:red;font-size:12px"> <html:errors property ="ename" /></p></td>
                </tr>
                <tr>
                    <td><bean:message key="employee.form.register.deptid" /></td>
                    <td><html:text property="deptid" /></td>
                </tr>
                <tr>
                    <td><bean:message key="employee.form.register.salary" /></td>
                    <td><html:text property="salary" /></td>
                    <td><p style="color:red;font-size:12px"> <html:errors property ="salary" /></p></td>
                </tr>
                <tr>
                    <td><bean:message key="employee.form.register.designation" /></td>
                    <td><html:text property="designation" /></td>
                    <td><p style="color:red;font-size:12px"> <html:errors property ="designation" /></p></td>
                </tr>
                <tr>
                    <td><bean:message key="employee.form.register.mgrid" /></td>
                    <td><html:text property="mgrid" /></td>
                </tr>
                <tr>
                    <td colspan="2"><html:submit>
                            <bean:message key="employee.form.register.insert" />
                        </html:submit></td>
                                    </tr>
                                    </div>
            </table>
        </html:form>
        <br/><br/><br/><br/><br/><br/>
    
<%-- <button><html:link action="clang?langauge=en">English</html:link></button>
&nbsp;&nbsp;&nbsp;&nbsp;

<button><html:link action="clang?langauge=hi">Hindi</html:link></button> --%>

</body>
</html>





<%-- <form method="post" action="uemp.do">
            <div class="form-group">
                <label for="eid"><bean:message key="employee.form.register.eid" /></label> <input type="text"
                    class="form-control" name="eid" aria-describedby="eid"
                     placeholder="Enter Eid">
            </div>
            <div class="form-group">
                <label for="enme"><bean:message key="employee.form.register.enme" /></label> <input type="text"
                    class="form-control" name="enme" aria-describedby="enme"
                     placeholder="Enter enme">
            </div>
            <div class="form-group">
                <label for="deptid"><bean:message key="employee.form.register.deptid" /></label> <input type="text"
                    class="form-control" name="deptid" aria-describedby="deptid"
                     placeholder="Enter deptid">
            </div>
            <div class="form-group">
                <label for="salary"><bean:message key="employee.form.register.salary" /></label> <input type="text"
                    class="form-control" name="salary" aria-describedby="salary"
                    value="${employee.salary}" placeholder="Enter Salary">
            </div>
            <div class="form-group">
                <label for="designtion"><bean:message key="employee.form.register.designtion" /></label> <input
                    type="text" class="form-control" name="designtion"
                     aria-describedby="designtion"
                    placeholder="Enter aukaat">
            </div>
            <div class="form-group">
                <label for="manager"><bean:message key="employee.form.register.mgrid" /></label> <input type="text"
                    class="form-control" name="mgrid" aria-describedby="mgrid"
                     placeholder="Khadoos">
            </div>
            <button type="submit" class="btn btn-primary"><bean:message key="employee.form.register.insert" /></button>
        </form> --%>