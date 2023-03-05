package com.simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
	
public class DeleteStatementExample {

	public static void main(String[] args) {
		
		try {
			
			//1. Load the Driver 
			//Class.forName("com.mysql.jdbc.Driver");//
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Get the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb012","root","root12345");
			
			//3. create the Statement
			Statement stmt=con.createStatement();
			
			//4. Prepare the Query and Execute 
			int record=stmt.executeUpdate("DELETE FROM EMPLOYEE WHERE ID = 102;");
			
			if(record>0) {
				System.out.println("Recored deleted Successfully in to table EMPLOYEE");
			}else {
				System.err.println("Error occured while deleting the data in to Table EMPLOYEE");
			}
			
			//5. Close the resource.
			con.close();
			stmt.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.err.println("Error While fetching the data from table EMPLOYEE");
		}
	}

}
