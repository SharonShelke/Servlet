<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<% 

String name=request.getParameter("uname");
String pwd=request.getParameter("pwd");

if(name.equals(pwd))
	 out.println("Welcome::   "+name);
else
	throw new ServletException ("Error");
	
%>
</body>
</html>