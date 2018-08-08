<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/projectPrototype1/saveDetails" method="post">
	<table>
		<tr>
			<td>First Name:</td>
			<td><input type="text" name="cFName"></td>
		</tr>
		
		<tr>
			<td>Last Name:</td>
			<td><input type="text" name="cLName"></td>
		</tr>
		
		<tr>
			<td>Gender:</td>
			<td><input type="radio" name="cGENDER" value="Male"/>Male&nbsp;&nbsp;
			<input type="radio" name="cGENDER" value="Female"/>Female
			</td>
		</tr>
		
		<tr>
			<td>DOB:</td>
			<td><input type="date" name="cDOB"/></td>
		</tr>
		
		<tr>
			<td>MobileNo:</td>
			<td><input type="tel" name="cMobileNum"/></td>
		</tr>
		
		<tr>
			<td>EmailId:</td>
			<td><input type="email" name="cMail"/></td>
		</tr>
		
		<tr>
			<td>Password:</td>
			<td><input type="password" name="cPassword"/></td>
		</tr>
		
		<tr>
			<td>City:</td>
			<td><input type="text" name="cCity"/></td>
		</tr>
		
		<tr>
			<td>Experience:</td>
			<td><input type="number" name="cExperienc"/></td>
		</tr>
		
		<tr>
			<td>Referred By:</td>
			<td><input type="text" name="cRefer"/></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="SUBMIT"></td>
		</tr>
		
	</table>
</form>
</body>
</html>