package com.simplilearn.jdbc.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtill {

	
	static {
	
		//1. Load the Driver 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	 }
	
	public static Connection getMySqlConnection() throws Exception{
		//2. Get the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb012","root","root12345");
		
		return con;
	}
	
	
	public static void cleanup(Connection con, PreparedStatement ps) {
		
		try {
			
			if(con!=null) {
				con.close();
			}
			
			if(ps!=null) {
				ps.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void cleanup(Connection con, Statement stmt) {
		
		try {
			
			if(con!=null) {
				con.close();
			}
			
			if(stmt!=null) {
				stmt.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public static void cleanup(Connection con, Statement stmt, ResultSet rs) {
		
		try {
			
			if(con!=null) {
				con.close();
			}
			
			if(stmt!=null) {
				stmt.close();
			}
			
			if(rs!=null) {
				rs.close();
			}
			
			
		} catch (Exception e) {
			
		}
	}
}
