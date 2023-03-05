package com.simplilearn.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilearn.jdbc.utill.JDBCUtill;

public class SelectPreparedStatementExample {

	public static void main(String[] args) {
		System.out.println("***** START-SelectPreparedStatementExample *******");
		
		try {
			Connection con=JDBCUtill.getMySqlConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM EMPLOYEE WHERE ID = ? ");/* Place Holder */ 
			
			/*One Record*/
			ps.setInt(1, 111);
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
