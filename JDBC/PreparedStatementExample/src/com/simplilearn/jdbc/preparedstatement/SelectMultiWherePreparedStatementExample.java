package com.simplilearn.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilearn.jdbc.utill.JDBCUtill;

public class SelectMultiWherePreparedStatementExample {

	public static void main(String[] args) {
		System.out.println("***** START-SelectPreparedStatementExample *******");
		
		try {
			Connection con=JDBCUtill.getMySqlConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM EMPLOYEE WHERE ID = ? AND FIRST_NAME = ? AND LAST_NAME = ? ");/* Place Holder */ 
			
			ps.setInt(1, 111);
			ps.setString(2, "Mihir");
			ps.setString(3, "Gupta");
			
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(
								"ID - "+rs.getInt(1)+" "
								+"AGE - "+rs.getInt(2)+" "
								+"FIRST NAME  - "+rs.getString(3)+" "
								+"LAST NAME  - "+rs.getString(4)
								);
			}
	
			
			
			JDBCUtill.cleanup(con, ps);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("***** END-SelectPreparedStatementExample *******");
	}
}
