<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Login Details</title>
</head>
<body>
<%
String username=request.getParameter("username");
String Pwd= request.getParameter("Pwd");

session.setAttribute("session-uid",username);
if(username.equals(Pwd)){
	
	response.sendRedirect("success.jsp");
}
else
{
	response.sendRedirect("Failure.jsp");
}


%>
</body>
</html>