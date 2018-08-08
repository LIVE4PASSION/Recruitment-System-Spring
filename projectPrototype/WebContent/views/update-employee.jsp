<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/projectPrototype1/update" method="get">
	<table>
		<tr>
			<td><input type="hidden" name="empId" value="${ID}"></td>
		</tr>
		<tr>
			<td>Employee Name:</td>
			<td><input type="text" name="empName"></td>
		</tr>
		<tr>
			<td>Employee EmailId:</td>
			<td><input type="email" name="empMail"></td>
		</tr>
		<tr>
			<td>Employee MobileNo</td>
			<td><input type="text" name="empMobile" value="${EMPLOYEE.empMobile}"></td>
		</tr>
		<tr>
			<td>Employee Role</td>
			<td><input type="text" name="empRole" value="${EMPLOYEE.empRole}"></td>
		</tr>
		<tr>
			<td>Employee Current Status</td>
			<td><input type="text" name="empStatus" value="${EMPLOYEE.empStatus}"></td>
		</tr>
		<tr>
			<td><input type="submit" value="UPDATE"/></td>
		</tr>
	</table>
</form>
<br><br>
<a href="/projectPrototype1/employee">Show Employee Details</a>
</body>
</html>