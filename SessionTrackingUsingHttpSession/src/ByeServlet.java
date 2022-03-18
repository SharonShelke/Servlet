

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ByeServlet
 */
@WebServlet("/ByeServlet")
public class ByeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ByeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		//String n= request.getParameter("username");
	//	Cookie c[]=request.getCookies();
//		out.println("Hey"+c[0].getMaxAge());
	
	
		//String n= request.getParameter("username");
		HttpSession session =request.getSession(true);
		String nm =(String)session.getAttribute("username");
		out.println("Bye <br>" +nm);
		//out.println("Bye::"+c[0].getValue()+"<br>");
		//out.println("<a href='ByeServlet'>Bye</a>");
		//response.sendRedirect("https://www.google.co.in/");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
