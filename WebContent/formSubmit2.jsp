<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Second Form</title>
</head>
<body>

	<h1>Registration form - 2</h1>
	
	<form action="/ServletExamples/sessionHandling" method="get">
		Tel No : <input type="text" name="tel">
		Mobile No : <input type="text" name="mob">
		emailId : <input type="text" name="email">
	
		<input type="submit" value="next">
		<input type="hidden" name="fno" value="2">
	</form> 
</body>
</html>