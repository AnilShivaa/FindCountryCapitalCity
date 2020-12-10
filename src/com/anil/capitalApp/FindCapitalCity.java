package com.anil.capitalApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;


public class FindCapitalCity extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		int countryCode=Integer.parseInt(req.getParameter("countryCapital"));
		
		//b.logic/ request processing logic
		String capital[]=new String[] {"Kathmandu","Delhi","Lahore","Tokyo"};
		
		pw.print("<h1 style='color:red;text-align:center'>Capital city name is: "+capital[countryCode]+"</h1>");
		
		
		
		pw.print("<a href='input.html'>Home</a>");
		
		pw.close();
	}
}//end cl


