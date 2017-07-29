<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Form</title>
</head>
<body>

	<h1>User Details - 1</h1>
	
	<form action="./interslcommn" method="get">
	Name : <input type="text" name="name">
	Father Name : <input type="text" name="fname">
	Mother Name : <input type="text" name="mname">
	<input type="submit" value="next"> 
	
	<input type="hidden" name="fno" value="1">
	</form>
</body>
</html>