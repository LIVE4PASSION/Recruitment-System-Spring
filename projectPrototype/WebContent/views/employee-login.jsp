<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${errMsg}

<form action="submitEmpCredentials" method="post">
	<table>
		<tr>
			<td>Employee EmailId:</td>
			<td><input type="email" name="empMail"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="empDOB"></td>
		</tr>
		<tr>
			<td>Employee Role</td>
			<td>
			<select name="empRole">
			<option>IT Services</option>
			<option>Banking</option>
			</select>
			</td>	
		</tr>
		<tr>
			<td><input type="submit" value="LOGIN"></td>
		</tr>
		
	</table>
</form>
</body>
</html>