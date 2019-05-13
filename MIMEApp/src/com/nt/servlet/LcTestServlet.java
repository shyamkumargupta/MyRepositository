package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LcTestServlet extends HtmlServlet {
	static {
		System.out.println("LcTestServlet :static block");
	}

	public LcTestServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("LcTestServlet : 0-param constructor");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("LcTestServlet :init(ServletConfig config)");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("LcTestServlet :service(-,-)");
		PrintWriter pw = null;
		// get printwriter
		pw = res.getWriter();
		// set res content type
		res.setContentType("text/html");
		Date d = null;
		d = new Date();

		pw.println("<b><i><center>today date & time is::" + d + "</b></i></center>");
		// close stream
		pw.close();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("LcTestServlet : destroy()");
	}
}
