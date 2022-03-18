<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> FIRST JSP DEMO</title>
</head>
<!-- declaraction tag -->
<%!int id=1;
String name="JSP";


public void display(){
	%>
	<% out.println("<h1>id is:"+id+"</h1>");
	out.println("<h1>Name is:"+name+"</h1>");%>
	<%! }%>
	
	<%!
public static int add(int a,int b){
return a+b;
}
%>
<%=add(5,20)%>
	

   
    
	<!-- scriptlet tag -->

<body bgcolor="cyan">
<!-- business logic -->
<% int a=5, b=10,sum=0;
sum=a+b;
%>
<!-- Expression tag -->
<br><h1>Result is::<%=sum %></h1>
<%="<h2>Bye!!</h2>" %>
</body>
</html>