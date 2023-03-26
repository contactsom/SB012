package com.simplilearn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("-Start-*******************doGet()*******************");

		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		
		out.print("<html><body>");
		out.print("<h1> Welcome to Simplilearn </h1>");
		out.print("<h2> This is Servlet JSP Session </h2>");
		out.print("<h3> Hello Servlet from StudentServlet servlet  </h3>");
		out.print("</body></html>");
		
			
		System.out.println("-End-*******************doGet()*******************");
	}
}
