<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage= "true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>

<% if(response.getStatus() == 500){%>
Error: 
<%= exception %>
<%@ include file="login.jsp" %>
<%}else{%>
<%} %>
</body>
</html>