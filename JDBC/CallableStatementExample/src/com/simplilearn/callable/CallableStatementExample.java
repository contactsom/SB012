package com.simplilearn.callable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.simplilearn.jdbc.utill.JDBCUtill;

public class CallableStatementExample {

	public static void main(String[] args) {
		
		System.out.println("**** START- CallableStatementExample *****");
		try {
			
			Connection con= JDBCUtill.getMySqlConnection();
			
			PreparedStatement pstmt = con.prepareCall("{call GetAllEmployee}");// procedure name
			pstmt.execute();
			
			ResultSet rs = pstmt.getResultSet();
			
			 while(rs.next()) {
					
					System.out.println(
									"ID - "+rs.getInt(1)+" "
									+"AGE - "+rs.getInt(2)+" "
									+"FIRST NAME  - "+rs.getString(3)+" "
									+"LAST NAME  - "+rs.getString(4)
									);
				}
			
			 JDBCUtill.cleanup(con, pstmt, rs);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("**** END- CallableStatementExample *****");
	}
	
	

}
