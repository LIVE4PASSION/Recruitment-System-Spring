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
		<td>JOB TYPE</td>
		<td>DESIRED SKILL</td>
		<td>JOB LOCATION</td>
		<td>POST DATE</td>
		<td>EXPIRY DATE</td>
		<td>SALARY</td>
		<td>EXPERIENCE REQUIRED</td>
		<td>JOB PROFILE</td>
		<td>JOB STATUS</td>
	</tr>
	
	<c:forEach var="temp" items="${JOBS}">
		<tr>
			<td>${temp.jobType}</td>
			<td>${temp.skills}</td>
			<td>${temp.jobLocation}</td>
			<td>${temp.jobPostDate}</td>
			<td>${temp.jobExpDate}</td>
			<td>${temp.salary}</td>
			<td>${temp.experienceRequired}</td>
			<td>${temp.jobProfile}</td>
			<td>${temp.jobStatus}</td>
		</tr>
	</c:forEach>
	
</table>
<br><br><br>
<a href="/projectPrototype1/employee">Back To Home</a>
</body>
</html>