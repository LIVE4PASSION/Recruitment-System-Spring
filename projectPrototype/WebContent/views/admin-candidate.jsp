<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<td>First Name</td>
		<td>Last Name</td>
		<td>Gender</td>
		<td>Date Of Birth</td>
		<td>Mobile No</td>
		<td>Email Id</td>
		<td>Password</td>
		<td>City</td>
		<td>Experience</td>
		<td>Referred By</td>
	</tr>
	
	<c:forEach var="temp" items="${candidate}">
		<tr>
			<td>${temp.cFName}</td>
			<td>${temp.cLName}</td>
			<td>${temp.cGENDER}</td>
			<td>${temp.cDOB}</td>
			<td>${temp.cMobileNum}</td>
			<td>${temp.cMail}</td>
			<td>${temp.cPassword}</td>
			<td>${temp.cCity}</td>
			<td>${temp.cExperienc}</td>
			<td>${temp.cRefer}</td>
		</tr>
	</c:forEach>
	
</table>
<br><br>
<a href="/projectPrototype1/views/submit.jsp">Back To Home</a>
</body>
</html>