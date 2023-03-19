package com.simplilearn.mapping.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.simplilearn.mapping.Address;

public class GetClient {

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
			Address address = (Address)session.get(Address.class, 1);
			System.out.println("ADDRESS_ID : "+address.getAid()+" "+
					"STREET : "+address.getStreet()+" "+
					"CITY   : "+address.getCity()+" "+
					"STATE  : "+address.getState()+" "+
					"STUDENT ID  : "+address.getStudent().getSid()
			
					);
		
			System.out.println("6. Prepare the business object");
			
			//7. Save the Data
			

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
