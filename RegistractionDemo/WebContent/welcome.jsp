<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body>
<h1>Welcome</h1>
</body>


<%
session = request.getSession(false);
String City = (String)session.getAttribute("city");
String DOB = (String)session.getAttribute("date");
out.println("You are from " + City);
out.println("Your DOB is: " + DOB);%>
</html>