package com.simplilearn.lms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.simplilearn.jdbc.utill.JDBCUtill;
import com.simplilearn.lms.book.Book;

public class BookService {

	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs = null;
	
	public String verifyUsers(String user, String password) {
		
		System.out.println("***** START: verifyUsers *****");
		String verifyuser="";
		
		try {
			
			con=JDBCUtill.getMySqlConnection();
			ps=con.prepareStatement("SELECT * FROM USERS where USERS_NAME = ? AND USERS_PASSWORD = ? ");// ? - CALLED AS Place Holder 
			ps.setString(1, user);
			ps.setString(2, password);
			rs=ps.executeQuery();// If supplied user Name and Password are correct then result set have some value else no value
		
			if(rs.next()) {
				//System.out.println("***** Result set has value *****");
				verifyuser="login Successfully";
			}else {
				//System.out.println("***** Result set does not have  value *****");
				verifyuser="login Failed";
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.err.println("Error occured while validating the user");
		}
		
		System.out.println("***** END: verifyUsers *****");
		return verifyuser;	
		
	}

	public int addBooks(Book book) {
		System.out.println("***** START: addBooks *****");
		int records = 0;
		
		try {
			
			con=JDBCUtill.getMySqlConnection();
			ps=con.prepareStatement("INSERT INTO BOOKS VALUES (?,?,?,?,?,?);");
			ps.setInt(1, book.getBookid());
			ps.setString(2, book.getBookname());
			ps.setString(3, book.getBookauthor());
			ps.setString(4, book.getBookpublication());
			ps.setInt(5, book.getBookprice());
			ps.setLong(6, book.getBookisbn());
			records=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error occured while inserting the data in to BOOKS table");
		}
		System.out.println("***** END: addBooks *****");
		return records;
		
	}

	public int updateBooks(Book updatebook) {
		System.out.println("***** START: updateBooks *****");
		int records = 0;
		
		try {
			
			con=JDBCUtill.getMySqlConnection();
			ps=con.prepareStatement("UPDATE BOOKS SET BOOK_PRICE = ? WHERE BOOK_ID = ?;");
			ps.setInt(1, updatebook.getBookprice());
			ps.setInt(2, updatebook.getBookid());
			records=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error occured while updating the data in to BOOKS table");
		}
		System.out.println("***** END: updateBooks *****");
		return records;
		
		
	}

	public int deleteBook(Book deletebook) {
		System.out.println("***** START: deleteBook *****");
		int records = 0;
		
		try {
			con=JDBCUtill.getMySqlConnection();
			ps=con.prepareStatement("DELETE FROM BOOKS WHERE BOOK_ID = ?;");
			ps.setInt(1, deletebook.getBookid());
			records=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error occured while deleting the data in to BOOKS table");
		}
		System.out.println("***** END: deleteBook *****");
		return records;
		
		
	}

}
