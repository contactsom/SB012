package com.simplilearn.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilearn.jdbc.utill.JDBCUtill;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class StudentServlet extends HttpServlet {

	
		public static final String INSERT="INSERT INTO STUDENT_PROJECT VALUES (?,?,?,?)";
		public static final String SEARCH_BY_EMAIL_ID="SELECT * FROM STUDENT_PROJECT WHERE EMAIL = ?";
		public static final String UPDATE_BY_EMAIL_ID="UPDATE STUDENT_PROJECT SET PASSWORD = ? WHERE EMAIL = ?";
		public static final String DELETE_BY_EMAIL_ID="DELETE FROM STUDENT_PROJECT WHERE EMAIL = ?";
		
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path= request.getServletPath();
		System.out.println("Path"+path); // /insert
		
		switch (path) {
		
		case "/insert":
			insertdata(request,response);
			break;
			
		case "/search":
			getByEmailID(request,response);
			break;
		
		case "/update":
			updateByEmailID(request,response);
			break;
			
		case "/delete":
			deleteByEmailID(request,response);
			break;
		default :
			break;
			
		}
		
		
		
	}

	private void deleteByEmailID(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("******** START-deleteByEmailID ******** ");
		
		System.out.println("******** END-deleteByEmailID ******** ");
		
	}

	private void updateByEmailID(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("******** START-updateByEmailID ******** ");
		
		System.out.println("******** END-updateByEmailID ******** ");
		
	}

	private void getByEmailID(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("******** START-getByEmailID ******** ");
		
		String emailid = (String) request.getParameter("emailid");
		
		try {
			
			Connection con=JDBCUtill.getMySqlConnection();
			PreparedStatement ps = con.prepareStatement(SEARCH_BY_EMAIL_ID);/* Place Holder */ 
			
			ps.setString(1, emailid);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				String firstName=rs.getString("FIRST_NAME");
				String lastName=rs.getString("LAST_NAME");
				String email=rs.getString("EMAIL");
				String password=rs.getString("PASSWORD");
				
				System.out.println("FIRST NAME : "+firstName);
				System.out.println("LAST NAME : "+lastName);
				System.out.println("EMAIL : "+email);
				System.out.println("PASSWORD : "+password);
				
				displaySearchResult(firstName,lastName,email,password,request,response);
			}
			
		} catch (Exception e) {
			System.err.println("---- Student Not Found in Simplilearn DB");
		}
		
		System.out.println("******** END-getByEmailID ******** ");
		
	}

	private void displaySearchResult(String firstName, String lastName, String email, String password, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("******** START-displaySearchResult ******** ");
		
		request.setAttribute("FIRST_NAME", firstName);
		request.setAttribute("LAST_NAME", lastName);
		request.setAttribute("EMAIL", email);
		request.setAttribute("PASSWORD", password);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("searchresult.jsp");
		rd.forward(request, response);
		
		System.out.println("******** END-displaySearchResult ******** ");
		
	}

	private void insertdata(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("******** START-insertdata ******** ");
		String firstname = (String) request.getParameter("firstname");
		String lastname = (String) request.getParameter("lastname");
		String emailid = (String) request.getParameter("emailid");
		String password = (String) request.getParameter("password");
		
		System.out.println("FIRST NAME :"+firstname);
		System.out.println("LAST NAME :"+lastname);
		System.out.println("EMAIL :"+emailid);
		System.out.println("PASSWORD :"+password);
		
		// logic to save the data 
		
		try {
			
			Connection con=JDBCUtill.getMySqlConnection();
			PreparedStatement ps = con.prepareStatement(INSERT);/* Place Holder */ 
			
			/*One Record*/
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, emailid);
			ps.setString(4, password);
			ps.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("---Error Occured while Inserting the data---");
		}
		
		display(request,response);
		
		
		System.out.println("******** END-insertdata ******** ");
	}

	private void display(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("******** START-display ******** ");
		
		String firstname = (String) request.getParameter("firstname");
		String lastname = (String) request.getParameter("lastname");
		String emailid = (String) request.getParameter("emailid");
		String password = (String) request.getParameter("password");
		
		System.out.println("FIRST NAME :"+firstname);
		System.out.println("LAST NAME :"+lastname);
		System.out.println("EMAIL :"+emailid);
		System.out.println("PASSWORD :"+password);
		
		request.setAttribute("FNAME", firstname);
		request.setAttribute("LNAME", lastname);
		request.setAttribute("EMAIL", emailid);
		request.setAttribute("PASSWORD", password);
		
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
		
		System.out.println("******** END-display ******** ");
	}
}
