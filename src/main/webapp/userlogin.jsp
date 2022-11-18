<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="reg.do">
		<table>
			<tr>
				<td colspan="2">
					<h2 style="color: green">Employee Login Form:</h2>
				</td>
			</tr>
			<tr style="background-color: yellow">
				<td>Enter Name</td>
				<td><input type="test" name="username"></td>
			</tr>
			<tr style="background-color: yellow">
				<td>Enter password:</td>
				<td>
				<td><input type="text" name="password"></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>