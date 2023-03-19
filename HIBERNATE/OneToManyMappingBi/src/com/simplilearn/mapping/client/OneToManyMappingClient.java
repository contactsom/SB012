package com.simplilearn.mapping.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.mapping.Customer;
import com.simplilearn.mapping.Order;
import com.simplilearn.utill.HibernateUtillXml;

public class OneToManyMappingClient {

	public static void main(String[] args) {
		
		System.out.println("--Start********************OneToOnemappingClient");
		
		SessionFactory factory = null;
		Session session= null;
		Transaction tx= null;
		
		try {
			 factory = HibernateUtillXml.getSessionFactory();
			 session=factory.openSession();
			 tx=session.beginTransaction();
			 
			 Order order1 = new Order(1, new Double(100), new Date(), "NEW");
			 session.save(order1);
			 Order order2 = new Order(5, new Double(500), new Date(), "Replacement");
			 session.save(order2);
			 Order order3 = new Order(6, new Double(600), new Date(), "NEW");
			 session.save(order3);
			
			 Customer customer = new Customer("Nayan Sahare", "nayan.sahare@simplilearn.com", new Long(9876145), new Date());
			 
			 // All orders belongs to One Customer 
			 order1.setCustomer(customer);
			 order2.setCustomer(customer);
			 order3.setCustomer(customer);
			
			 session.save(customer);
			 
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
