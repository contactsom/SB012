package com.simplilearn.mapping.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.mapping.Address;
import com.simplilearn.mapping.Student;
import com.simplilearn.utill.HibernateUtillXml;

public class OneToOnemappingClient {

	public static void main(String[] args) {
		
		System.out.println("--Start********************OneToOnemappingClient");
		
		SessionFactory factory = null;
		Session session= null;
		Transaction tx= null;
		
		try {
			 factory = HibernateUtillXml.getSessionFactory();
			 session=factory.openSession();
			 tx=session.beginTransaction();
			 
			 Address address = new Address("2nd Main", "Bangalore", "Karnataka");

			 Student student = new Student("Nayan Sahare", "nayan.sahare@simplilearn.com", "98761723", address);
			 
			 
			 session.save(address);
			 session.save(student);
			 tx.commit();
			 
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("*** Error occured while inserting the data in to DB");
		}
		
		//9. Close the resource
		session.close();
		factory.close();
		System.out.println("9. Close the resource");
		
		System.out.println("--End********************OneToOnemappingClient");
	}
}
