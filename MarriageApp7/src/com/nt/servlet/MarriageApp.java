package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageApp extends HttpServlet {

	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException {
	PrintWriter pw=null;
	String name=null,Sage=null;
	int age=0;
	String gender=null;
	List<String> errorlist=new ArrayList<>();	
	//general setting
	pw=res.getWriter();
		res.setContentType("text/html");
		//get request parameter value
	name=req.getParameter("name");
	Sage=req.getParameter("age");
	age=Integer.parseInt(Sage);
	//write form validation logic in server side
//	errorList()
	/*if(name==null||name.length()==0||name.equals("")) {
		pw.println("<h3 style='color:red'>name is required</h3>");
		return;
	}*/
	/*if(Sage==null||Sage.length()==0||Sage.equals("")) {
		pw.println("<h3 style='color:red'>age is required</h3>");
	
		return;
	}*/
	/*if(age<=0||age>125) {
		pw.println("<h3 style='color:red'>age between 1 to 125</h3>");
		return;
	}*/
	/*else {
		try {
		age=Integer.parseInt(Sage);
		if(age<=0||age>125) {
			pw.println("<h3 style='color:red'>age between 1 to 125</h3>");
			return;
		}
		else {
			age=Integer.parseInt(Sage);	
		
		}
		
		}
		catch(NumberFormatException nfe){
			pw.println("<h3 style='color:red'>enter number in age box</h3>");
		return;
		}
		
	}*/
   /* 	else {
		age=Integer.parseInt(Sage);	
	
	}*/
	
	
	gender=req.getParameter("gender");
	//write request processing logic	
	System.out.println("request");
	if(gender.equalsIgnoreCase("M")) { 
		if(age>=21) {
			pw.println(name+"u r eligible to marry");
		}
		else {
			pw.println(name+"u r uneligible to marry");
		}
	}
	else {
		if(age<=18) {
			pw.println(name+"g u r un eligible to marry");
		}
		else {
			pw.println(name+"g u r eligible to marry");
		}
	}
	//add hyperlink
	pw.println("<a href='input.html'> <img src='home.png' width='50' height='50'></a>");
	//close stream
	pw.close();
}//method
/*@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(req, res);
}
*/		
	
}//class