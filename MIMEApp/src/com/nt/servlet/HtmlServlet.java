//HtmlServlet.java
package com.nt.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class HtmlServlet extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		//get printwriter
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//write logic to generate o/p(webpage)
		 pw.println("<table border='1'>");
		 pw.println("<tr><th>Player</th><th>Role</th></tr>");
         pw.println("<tr><th>Dhoni</th><th>Captain</th></tr>");
         pw.println("<tr><th>Sachin</th><th>All Rounder</th></tr>");
         pw.println("</table>");
		 //close stream
		 pw.close();
	}//service(-,-)
}//class
