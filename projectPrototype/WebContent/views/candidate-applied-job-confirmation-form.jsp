<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="applyJobConfirmed" method="get">
	<table>
		<tr>
			<td> Job Name:</td>
			<td><input type="text" name="jobName" value="${CANDIDATEJOBS.jobProfile}"></td>
		</tr>
		<tr>
			<td> Job Type:</td>
			<td><input type="text" name="jobType" value="${CANDIDATEJOBS.jobType}"></td>
		</tr>
		<tr>
			<td> </td>
			<td><input type="hidden" name="jobStatus" value="Applied"></td>
		</tr>
		<tr>
			<td> Candidate EmailId:</td>
			<td><input type="email" name="cemail" value="${CEMAIL}"></td>
		</tr>
		<tr>
			<td> Job Expiry Date:</td>
			<td><input type="date" name="jobExpDate" value="${CANDIDATEJOBS.jobExpDate}"></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="APPLY"></td>
		</tr>
	</table>
</form><br><br>
<a href="viewAppliedJobs">View Applied Jobs</a>
</body>
</html>