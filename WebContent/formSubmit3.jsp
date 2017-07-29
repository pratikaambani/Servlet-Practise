<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Third Form</title>
</head>
<body>

	<h1>Registration form - 3</h1>
	
	<form action="/ServletExamples/sessionHandling" method="get">
	Education : <input type="text" name="edu">
	Address : <input type="text" name="add">
	country : <input type="text" name="c">
	
	<input type="submit" value="next">
	
	<input type="hidden" name="fno" value="3">
	 </form>
</body>
</html>