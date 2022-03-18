package com;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTag extends SimpleTagSupport {

	public void doTag() throws JspException, IOException {

		JspWriter out = getJspContext().getOut();
		out.println("<h1>This is my own Custome Tag</h1>");
	}
}
