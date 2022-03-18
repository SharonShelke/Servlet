package com.google;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GoogleTTS
 */
@WebServlet("/GoogleTTS")
public class GoogleTTS extends HttpServlet {
	 
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoogleTTS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	private void speak(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		 final String text = request.getParameter("text");
		 
	        URL url = new URL(GURL
	                + text.replace(" ", "%20") + "&tl=en");
	 
	        URLConnection urlConn = url.openConnection();
	        urlConn.addRequestProperty("User-Agent", "Mozilla");
	 
	        InputStream audioSrc = urlConn.getInputStream();
	        DataInputStream read = new DataInputStream(audioSrc);
	 
	        ServletOutputStream out = response.getOutputStream();
	 
	        int b = 0;
	        int c;
	 
	        while ((c = read.read()) != -1) {
	            out.write(c);
	            b++;
	        }
	 
	        read.close(); audioSrc.close();
	 
	        response.setContentType("audio/mpeg");
	        response.setContentLength(b);
	 
	        out.flush();
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
