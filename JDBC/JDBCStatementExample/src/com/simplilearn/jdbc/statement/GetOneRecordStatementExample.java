package com.simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
	
public class GetOneRecordStatementExample {

	public static void main(String[] args) {
		
		try {
			
			//1. Load the Driver 
			Class.forName("com.mysql.jdbc.Driver");//
			
			//2. Get the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb012","root","root12345");
			
			//3. create the Statement
			Statement stmt=con.createStatement();
			
			//4. Prepare the Query and Execute 
			
			ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEE where ID = 107;");
			
			while(rs.next()) {
				
				System.out.println(	
							 "ID - "+rs.getInt(1)+" "
							+"AGE - "+rs.getInt(2)+" "
							+"First name - "+rs.getString(3)+" "
							+"Last name - "+rs.getString(4));
			}
			
			//5. Close the resource.
			con.close();
			stmt.close();
			rs.close();
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.err.println("Error While fetching the data from table EMPLOYEE");
		}
	}

}
