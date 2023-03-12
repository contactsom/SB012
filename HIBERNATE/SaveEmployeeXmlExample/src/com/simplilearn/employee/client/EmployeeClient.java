package com.simplilearn.employee.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.simplilearn.employee.Employee;


public class EmployeeClient {

	public static void main(String[] args) {
		
		System.out.println("START-***************-EmployeeClient");
		
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
			//Employee emp = new Employee("Ayaz Ahmad", "ayaz.ahmad@yahoo.com", "Bangalore,India", 2000, "ME Engineer");
			//Employee emp = new Employee("Kalpana Paikrao", "kalpana.paikrao@google.com", "Bangalore,India", 9000, "Vice Persident");
			//Employee emp = new Employee("Vaibhav Singh", "vaibhav.singh@facebook.com", "Delhi,India", 10000, "Persident");
			Employee emp = new Employee("Shruti Singh", "shruti.singh@google.com", "Pune,India", 900000, "CEO");
		
			System.out.println("6. Prepare the business object");
			
			//7. Save the Data
			session.save(emp);
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
		
		System.out.println("END-***************-EmployeeClient");
		

	}

}
