<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>logins here</title>
</head>
<body>
<%

String fname=request.getParameter("fname");
String City=request.getParameter("city");
String DOB=request.getParameter("DOB");
out.println("Welcome::"+fname);
session = request.getSession(true);
session.setAttribute("city", City);
session.setAttribute("date",DOB);
//out.print("<a href='Welcome.jsp'>Welcome</a>");


//out.print("<a href='Welcome.jsp'>Welcome</a>");
%>
<form action="welcome.jsp">
		Enter UserName : <input type="text" name="uname"><br>
		<br> Enter Password : <input type="password" name="pwd"><br>
		<br> <input type="submit" value="Login">
</form>
</body>