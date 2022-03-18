package com.child;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckAge
 */
@WebServlet("/CheckAge")
public class CheckAge extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAge() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  // declare variables
	       PrintWriter pw = null;
	       String name = null;
	       String tage = null;
	       int age = 0;

	       // set content type
	       response.setContentType("text/html");

	       // get PrintWriter object
	       pw = response.getWriter();

	       // get form data (from request parameter)
	       name = request.getParameter("pname");
	       tage = request.getParameter("page");

	       // convert String value to int
	       age = Integer.parseInt(tage);
	       // check age
	       pw.println("<h1 style='text-align: center; color:blue'>"
	                 + "Hello "+ name + "</h1>");
	       if(age < 8) {
	          pw.println("<h2 style='text-align: center; color:red'>"
	                    +"You are not eligible for watching this video.</h2>"
	                    +"<h3 style='text-align: center; color:green'>"
	                    +"Please wait for more " + (8-age) + " years.<br>"
	                    +" Thank You.<h3>"
	          );
	       } else  {
	          pw.println("<h2 style='text-align: center; color:green'>"
	                    +"You are eligible for watching this video.</h2>"
	                    +"<h3 style='text-align: center'>"
	                    +"Thank You.<h3>"
	                    +"a href='https://youtu.be/ymigWt5TOV8'>Click here</a>"
	          );
	       }

	       // close stream
	       pw.close();
	   }
	// Method to handle GET method request
	 
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
