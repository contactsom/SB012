package com.simplilearn.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilearn.jdbc.utill.JDBCUtill;

public class DeletePreparedStatementExample {

	public static void main(String[] args) {
		System.out.println("***** START-DeletePreparedStatementExample *******");
		
		try {
			Connection con=JDBCUtill.getMySqlConnection();
			PreparedStatement ps = con.prepareStatement("DELETE FROM EMPLOYEE WHERE ID = ? ");/* Place Holder */ 
			
			ps.setInt(1, 113);
			ps.executeUpdate();
			
			JDBCUtill.cleanup(con, ps);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("***** END-DeletePreparedStatementExample *******");
	}
}
