<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
add employee form

<form action="/projectPrototype1/addEmployee" method="get">
	<table>
		<tr>
			<td>Employee Name:</td>
			<td><input type="text" name="empName"></td>
		</tr>
		<tr>
			<td>Employee EmailId:</td>
			<td><input type="email" name="empMail"></td>
		</tr>
		<tr>
			<td>Employee MobileNo:</td>
			<td><input type="tel" name="empMobile"></td>
		</tr>
		<tr>
			<td>Employee Type:</td>
			<td><input type="text" name="empRole"></td>
		</tr>
		<tr>
			<td>Employee DOB:</td>
			<td><input type="date" name="empDOB"></td>
		</tr>
		<tr>
			<td>Employee Status:</td>
			<td><input type="text" name="empStatus"></td>
		</tr>
		<tr>
			<td><input type="submit" value="ADD"></td>
		</tr>
		
	</table>
</form>
</body>
</html>