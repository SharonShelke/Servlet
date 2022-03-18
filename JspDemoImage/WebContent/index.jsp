<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-image: url('C:/Users/Coditas/Downloads/n.png');
  background-repeat: vertical;
   background-size: 100% 100%;
   text-align:center;
  
}

body {
	color: blue;
}

select{
 font-size:70%;
 color:blue;
 
}

iframe{
height:200px;
width:200px

}

</style>
</head>


<body>
<form action="index.jsp">
		<h1> Select Animals Name<br> <select name="Animals"> 
		
		
		
			<option>puppy </option>
			<option>cat</option>
			<option>pig</option>
			
		</select> <br> <input type="submit" value="Submit"> </h1>
	</form>
	<%
		String name = request.getParameter("Animals");
	%>
	
	
             
    
	<iframe src="C:\Users\Coditas\Downloads\Image\<%=name%>.jpg"  ></iframe>
</body>
</html>



