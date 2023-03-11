package com.simplilearn.lms.client;

import com.simplilearn.lms.book.Book;
import com.simplilearn.lms.service.BookService;

public class LMSClient {

	public static void main(String[] args) {
		
		/*1. Verify the users */
		
		BookService bookservice = new BookService();
		/*//String status =bookservice.verifyUsers("admin","admin@12345");//Success
		//String status =bookservice.verifyUsers("root","root@12345");//Success
		
		String status =bookservice.verifyUsers("root","root@1");//Failed
		System.out.println(status);*/
		
		
		/*2. Add the books in LMS*/
		// adding book means , Inserting the data ?
		
		//Book book = new Book(901, "Head First Java: A Brain-Friendly Guide, Third Edition", "Kathy Sierra", "O'REILLY", 1625, 9355420900L);
		/*Book book = new Book(902, "Java Made Simple", "P K Mcbride", "Routledge", 7978, 113816724L);
		int records=bookservice.addBooks(book);
		System.out.println(records+" No of Records inserted in to DB successfully");*/
				
		/*3. Update the books in LMS*/
		/*To update the price for the book id 902 Old price : 7978 New price : 1250*/
		/*Book updatebook = new Book(902, 1250);
		int records=bookservice.updateBooks(updatebook);
		System.out.println(records+" No of Records updated in to DB successfully");*/
		
		
		/*4. Delete the book record */
		Book deletebook = new Book();
		deletebook.setBookid(902);
		int records=bookservice.deleteBook(deletebook);
		System.out.println(records+" No of Records deleted in to DB successfully");
		
		// CRUD 
		
	}

}
