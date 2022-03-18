<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JavaBean </title>
</head>
<body>
	<jsp:useBean id="student" class="com.Student">
		<jsp:setProperty name="student" property="id" value="123" />
		<jsp:setProperty name="student" property="fname" value="=Sharon" />
		<jsp:setProperty name="student" property="lname" value="Shelke" />
	</jsp:useBean>

	<h1>
		Student information is::<br>
	</h1>
	<jsp:getProperty property="id" name="student" />
	<jsp:getProperty property="fname" name="student" />
	<jsp:getProperty property="lname" name="student" />
</body>
</html>