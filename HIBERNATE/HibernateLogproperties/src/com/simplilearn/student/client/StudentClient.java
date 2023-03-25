package com.simplilearn.student.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.simplilearn.student.Student;

public class StudentClient {

	public static void main(String[] args) {
		
		System.out.println("START-***************-StudentClient");
		
		SessionFactory factory=null;
		Transaction tx= null;
		Session session= null;
		
		try {
			
			//1. Create the Configuration Object 
			Configuration cfg= new Configuration();
			System.out.println("1. Create the Configuration Object ");
			
			//2. Call the configure method
			cfg=cfg.configure();
			System.out.println("2. Call the configure method");
			
			//3. Through the Configuration object call the build session factory
			factory= cfg.buildSessionFactory();
			System.out.println("3. Through the Configuration object call the build session factory");
			
			//4. With the help of factory object open the session
			session=factory.openSession();
			System.out.println("4. With the help if factory object open the session");
			
			//5. With the help of session object begin the transaction
			tx=session.beginTransaction();
			System.out.println("5. With the help of session object begin the transaction");
			
			
			//6. Prepare the business object
			//Student stu= new Student("Souvik Ghosh", "souvik.ghosh@gmail.com", 989812);
			//Student stu= new Student("Sasidhar Yadav", "sasidhar.yadav@gmail.com", 979812);
			Student stu= new Student("Nayan Sahare", "nayan.sahare@gmail.com", 984812);
			System.out.println("6. Prepare the business object");
			
			//7. Save the Data
			session.save(stu);
			System.out.println("7. Save the Data");

			//8. Commit in to DB
			tx.commit();
			System.out.println("8. Commit in to DB");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("*** Error occured while inserting the data in to DB");
		}
				
		
		//9. Close the resource
		session.close();
		factory.close();
		System.out.println("9. Close the resource");
		
		System.out.println("END-***************-StudentClient");
		

	}

}
