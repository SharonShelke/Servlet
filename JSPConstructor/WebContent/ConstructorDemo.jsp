<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Constructor Using JSP </title>
</head>
<body>
  <H1>Using Parameterized Constructors</H1>

        <%!
            javax.servlet.jsp.JspWriter localOut;

 /*class defaultConstructor
  {
  	defaultConstructor() throws java.io.IOException 
      {
          localOut.println(" I am default constructor...<BR>");
      }
  }
 */

            class Add   
            {
            
                Add(int a,int b) throws java.io.IOException 
              
                {
                    localOut.println("I am parameterised constructor...<BR>");
                    localOut.println(a+b);
                }
            }
        %>     
        <%
            localOut = out;     

            Add obj = new Add(2,5);
        %>


</body>
</html>