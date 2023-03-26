package com.simplilearn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SimplilearnRegistrationForm  extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		System.out.println("************ START-doGet() ************");
		
		String firstname =(String)request.getParameter("firstname");
		String lastname =(String)request.getParameter("lastname");
		String emailid =(String)request.getParameter("emailid");
		String password =(String)request.getParameter("password");
		String gender =(String)request.getParameter("gender");
		String timing =(String)request.getParameter("timing");
		String remarks =(String)request.getParameter("remarks");
		
		String courses[] =request.getParameterValues("course");
		
		
		
		System.out.println("First Name : "+firstname);
		System.out.println("Last Name : "+lastname);
		System.out.println("Email ID : "+emailid);
		System.out.println("Password : "+password);
		System.out.println("Gender : "+gender);
		System.out.println("Timing : "+timing);
		System.out.println("Remarks : "+remarks);
		
		
		
		for (String course : courses) {
			System.out.println("Course : "+course);
			
		}
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		
		out.print("<h1>Best Talent. Zero Cost. Easy Hiring.</h1>");
		out.print("<h2>Why Hire from SimpliRecruit?</h2>");
		out.print("<h3>We connect the right talent & the right companies to make hiring happen! </h3>");
		
		out.print("<p>First Name ::"+ firstname+ "</p>");
		out.print("<p>Last Name  ::"+ lastname+ "</p>");
		out.print("<p>Email ID   ::"+ emailid+ "</p>");
		
		/* 
		 * Home Work:
		 * You need to send all the below required information back to the user 
		 * gender , timing ,remarks,courses[]
		 * */
		
		
		out.print("</body>");
		out.print("</html>");
		
		
		System.out.println("************ END-doGet() ************");
	}
}
