<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Age one to three portal</title>
</head>
<style>
h1{
color:Blue;

}

</style>

<body>

<form action="OneToThree.jsp">
		<h1> Stories For 1-3 Year Old<br><select name="stories"> 

		
		
		
			<option>Little Otter Learns to Swim</option>
			<option>	Pigs</option>
			<option>The Ant and Dove</option>
			
		</select> <br> <input type="submit" value="Submit"> </h1>
	</form>

<%

String name = request.getParameter("stories");


%>

<iframe src="C:\Users\Coditas\Pictures\video""></iframe>

  

  
	
</body>
</html>