package com.simplilearn.ahibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.simplilearn.ahibernate.Employee;

public class EmployeeInsertClient {

	public static void main(String[] args) {
		
		System.out.println("START-***************-CustomerClient");
		
		SessionFactory factory=null;
		Transaction tx= null;
		Session session= null;
		
		try {
			
			//1. Create the Configuration Object 
			AnnotationConfiguration acfg= new AnnotationConfiguration();
			System.out.println("1. Create the Configuration Object ");
			
			//2. Call the configure method
			acfg=(AnnotationConfiguration)acfg.configure();
			System.out.println("2. Call the configure method");
			
			//3. Through the Configuration object call the build session factory
			factory= acfg.buildSessionFactory();
			System.out.println("3. Through the Configuration object call the build session factory");
			
			//4. With the help of factory object open the session
			session=factory.openSession();
			System.out.println("4. With the help if factory object open the session");
			
			//5. With the help of session object begin the transaction
			tx=session.beginTransaction();
			System.out.println("5. With the help of session object begin the transaction");
			
			
			//6. Prepare the business object
			//Employee employee = new Employee("Kalpana Paikrao", "kalpana.paikrao@simplilearn.com", "2nd Cross,Main Road", 9000, "VP");
			//Employee employee = new Employee("Vaibhav Singh", "vaibhav.singh@simplilearn.com", "3nd Cross,2nd Main Road", 5000, "AVP");
			Employee employee = new Employee("Aniket  Undefined", "Aniket.undefined@simplilearn.com", "5th Cross,3rd Main Road", 15000, "CEO");
			
			System.out.println("6. Prepare the business object");
			
			//7. Save the Data
			session.save(employee);
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
