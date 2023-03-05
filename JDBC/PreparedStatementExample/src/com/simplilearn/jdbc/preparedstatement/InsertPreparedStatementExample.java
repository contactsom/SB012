package com.simplilearn.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.simplilearn.jdbc.utill.JDBCUtill;

public class InsertPreparedStatementExample {

	public static void main(String[] args) {
		
		try {
			Connection con=JDBCUtill.getMySqlConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO EMPLOYEE VALUES (?,?,?,?);");/* Place Holder */ 
			
			/*One Record*/
			ps.setInt(1, 111);
			ps.setInt(2, 19);
			ps.setString(3, "Mihir");
			ps.setString(4, "Gupta");
			ps.execute();
			
			
			/*Two Record*/
			ps.setInt(1, 112);
			ps.setInt(2, 17);
			ps.setString(3, "Phani");
			ps.setString(4, "kumar");
			ps.execute();
			
			
			/*Third Record*/
			ps.setInt(1, 113);
			ps.setInt(2, 13);
			ps.setString(3, "Munna");
			ps.setString(4, "Tripathi");
			ps.execute();
			
			
			JDBCUtill.cleanup(con, ps);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
