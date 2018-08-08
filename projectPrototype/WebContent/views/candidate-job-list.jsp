<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
this is job list for candidates...
<table border="1">
	<tr>
		<td>Job Type</td>
		<td>Skills</td>
		<td>Job Location</td>
		<td>Job Post Date</td>
		<td>Job Expiry Date</td>
		<td>Salary</td>
		<td>Experience</td>
		<td>Job Name</td>
		<td>Job Status</td>
		<td>Action</td>
	</tr>
	
	<c:forEach var="temp" items="${JOBLIST}">
		
		<c:url var="tempLink" value="applyJob">
			<c:param name="jobId" value="${temp.jobId}"></c:param>
		</c:url>
		
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
			<td><a href="${tempLink}">Apply</a></td>
		</tr>
	</c:forEach>
	
</table>
<form action=""></form>
</body>
</html>