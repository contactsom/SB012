package com.simplilearn.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilearn.jdbc.utill.JDBCUtill;

public class UpdatePreparedStatementExample {

	public static void main(String[] args) {
		System.out.println("***** START-UpdatePreparedStatementExample *******");
		
		try {
			Connection con=JDBCUtill.getMySqlConnection();
			PreparedStatement ps = con.prepareStatement("UPDATE EMPLOYEE SET AGE = ? WHERE ID = ?");/* Place Holder */ 
			
			ps.setInt(1, 26);//31
			ps.setInt(2, 103);
			ps.executeUpdate();
			
			ps.setInt(1, 23);//25
			ps.setInt(2, 101);
			ps.executeUpdate();
			
			JDBCUtill.cleanup(con, ps);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("***** END-UpdatePreparedStatementExample *******");
	}
}
