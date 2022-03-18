<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>first</title>

</head>

<body>


<h1>
		Welcome Student information is::<br>
	</h1>
<%
String id=request.getParameter("username");

out.println("hello "+id);
pageContext.setAttribute("username", id, pageContext.APPLICATION_SCOPE);

%>
<a href="display.jsp">Click here to get the values </a>


</body>
</html>