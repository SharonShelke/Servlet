package com;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class DisplayMessage extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		
		JspWriter out = getJspContext().getOut();
		out.println("Hello display!!");
		
	}
}
