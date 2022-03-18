package com.first;

import java.io.IOException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class FirstDemoLogin
 */

@WebServlet(value= "/FirstDemoLogin",
initParams = {
		   @WebInitParam(name = "driver", value = "com.mysql.jdbc.Driver"),
		   @WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/coditas") ,
		   @WebInitParam(name = "username", value = "root"),
		   @WebInitParam(name = "password", value = "root")
		})
public class FirstDemoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstDemoLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ServletConfig context=getServletConfig();
		//change content to config and putting init param 
	//	String driver=context.getInitParameter("driver");
	//	out.println("driver name::"+driver);
	//	out.close();
		
		String n= request.getParameter("username");
		String p= request.getParameter("password");
		
		if(n.equals(p))
		{
			 Connection con=null;
		        Statement st;
		        ResultSet rs;

		        try {
		            //step1

Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/coditas","root","roots");
		          
		           out.println("Connected");

		            //step3
		            st = con.createStatement();
		            String sql = "select * from student;";

		            //ste4
		            rs = st.executeQuery(sql);//100
		         //   RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
		         //   rd.forward(request, response);  
		           out.println("*******DATA IS**********");
		          
		        //  out.println("<table><tr><th>id</th><th>Name</th><th>year</th><th>percentage</th><th>city</th><th>Gender</th><br>");
		           out.println("<table border='1'>");
		           out.println("<tr>");
		           out.println("<th>ID</th>");
		           out.println("<th>Name</th>");
		           out.println("<th>Year</th>");
		           out.println("<th>Percentage</th>");
		           out.println("<th>City</th>");
		           out.println("<th>Gender</th>");
		           
		            while (rs.next()) {
		            	 out.println("<tr>");
		            	 out.println("<td>"+rs.getInt(1)+ "</td>"+"<td>" +  rs.getString(2) + " </td><td>" + rs.getInt(3) + "</td><td> "   + rs.getInt(4) + "</td><td>"+rs.getString(5)+ 
		            	"</td><td>:"+rs.getString(6) +"</td></tr>");  }
			out.println("Welcome::"+n);
			out.println("</table>");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		}
		else 
		{
			out.println("Sorry  credential not matched");
			//  RequestDispatcher rd=request.getRequestDispatcher("First.html");  
		   //    rd.include(request, response);  
		
		}
		
		       
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
