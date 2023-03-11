package com.simplilearn.concurrency;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilearn.jdbc.utill.JDBCUtill;

public class JDBCConcurrencyExample {

	public static void main(String[] args) {

		try {
			
			Connection con=JDBCUtill.getMySqlConnection();
			//Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			//Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE;");
			
			System.out.println("***********Before Update *********");
			
			while(rs.next()) {
				
				System.out.println("Student ID : "+rs.getInt(1)+" "+
								   "Student Age : "+rs.getInt(2)+" "+
								   "Student First Name : "+rs.getString(3)+" "+
								   "Student Last Name  : "+rs.getString(4)
								);
			}
			// I want to increase the age of all the employee by 10 Years
			
			rs.beforeFirst();// origin (0,0)
			
			while(rs.next()) {
				
				int updateAge=rs.getInt(2)+10;
				rs.updateInt("AGE", updateAge);//
				rs.updateRow();
				//System.out.println("New Age : - "+updateAge);//31,33.......
				
			}
			
			rs.beforeFirst();// origin (0,0)
			
			System.out.println("******* After update *********");
			while(rs.next()) {
				
				System.out.println("Student ID : "+rs.getInt(1)+" "+
								   "Student Age : "+rs.getInt(2)+" "+
								   "Student First Name : "+rs.getString(3)+" "+
								   "Student Last Name  : "+rs.getString(4)
								);
			}

			JDBCUtill.cleanup(con, stmt, rs);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occured while updating the value");
		}
		
	}

}
