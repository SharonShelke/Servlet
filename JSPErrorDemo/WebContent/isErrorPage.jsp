<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>errorPage</title>
</head>
<body>
<h3>Due to following reasons an error has occurred</h3>
<ul>
<li><%=exception.getClass() %></li>
<li><%=exception.getMessage() %></li>
</ul>
</body>
</html>