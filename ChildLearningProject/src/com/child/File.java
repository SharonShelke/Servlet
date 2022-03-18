package com.child;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class File
 */
@WebServlet("/File")
public class File extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public File() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  // Get PrintWriter object
		response.setContentType("application/msword");
		PrintWriter out = response.getWriter();
        // File name
        String pdfName ="B.docx";
        // File path
        String pdfPath ="C:/Users/Coditas/Pictures/";
 
        // Set the content type and header of the response.
       // response.setContentType("application/msword");
        response.setHeader("Content-Disposition",
                           "attachment; filename=\""
                               + pdfName + "\"");
 
        // Get FileInputStream object to identify the path
        FileInputStream inputStream
            = new FileInputStream(pdfPath + pdfName);
 
        // Loop through the document and write into the
        // output.
        int in;
        while ((in = inputStream.read()) != -1) {
            out.write(in);
        }
 
        // Close FileInputStream and PrintWriter object
        inputStream.close();
        out.close();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
