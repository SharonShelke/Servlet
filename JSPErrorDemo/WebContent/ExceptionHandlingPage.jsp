<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page errorPage="isErrorPage.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exception Handling</title>
</head>
<body>
<form>
<table>
<tr>
<td>Enter a number :</td>
</tr>
<tr>
<td><input type="text" name="num"/></td>
</tr>
<tr>
<td align="center"><input type="submit" value="submit"/>
</tr>
</table>
</form>
<%
String num = request.getParameter("num");
if(num != null)
{
String number = num.trim();
int no = Integer.parseInt(number);
out.println(no);
int value= no/0;
}
%>
</body>
</html>
