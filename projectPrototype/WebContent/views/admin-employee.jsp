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
		<td>Name</td>
		<td>Email Id</td>
		<td>Mobile No</td>
		<td>Role</td>
		<td>Date Of Birth</td>
		<td>Status</td>
		<td>Action</td>
	</tr>
	
	<c:forEach var="temp" items="${emp}">
		
		<c:url var="tempLink" value="/load">
			<c:param name="empId" value="${temp.empId}"></c:param>
		</c:url>
		
		<c:url var="delLink" value="/delete">
			<c:param name="empId" value="${temp.empId}"></c:param>
		</c:url>
		
		<tr>
			<td>${temp.empName}</td>
			<td>${temp.empMail}</td>
			<td>${temp.empMobile}</td>
			<td>${temp.empRole}</td>
			<td>${temp.empDOB}</td>
			<td>${temp.empStatus}</td>
			<td><a href="${tempLink}">Update</a>
			|
			<a href="${delLink}">Delete</a>
			</td>
			<td>
		</tr>
	</c:forEach>
	
</table>
<br><br><br>

<a href="/projectPrototype1/views/add-employee.jsp">Add Employee</a>
</body>
</html>