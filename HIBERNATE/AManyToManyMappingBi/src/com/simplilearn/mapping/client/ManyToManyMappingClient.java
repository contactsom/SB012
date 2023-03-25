package com.simplilearn.mapping.client;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.ahibernate.utill.AHibernateUtill;
import com.simplilearn.mapping.Account;
import com.simplilearn.mapping.Customer;

public class ManyToManyMappingClient {

	public static void main(String[] args) {
		
		System.out.println("--Start********************ManyToManyMappingClient");
		
		SessionFactory factory = null;
		Session session= null;
		Transaction tx= null;
		
		try {
			 factory = AHibernateUtill.getSessionFactory();
			 session=factory.openSession();
			 tx=session.beginTransaction();
			
			 Customer c1 = new Customer("Kapil Pande", "kapil.pande@simplilearn.com", new Date(), new Long(9876127));
			 session.save(c1);
			 
			 Customer c2 = new Customer("Aryman Yadav", "aryman.yadav@simplilearn.com", new Date(), new Long(9076127));
			 session.save(c2);
			 
			 Customer c3 = new Customer("Sumit Gupta", "Sumit.gupta@simplilearn.com", new Date(), new Long(8076127));
			 session.save(c3);
			 
			 
			Account a1= new Account("Saving",9999.0);
			 session.save(a1);
			Account a2= new Account("Current",8888.0);
			 session.save(a2);
			Account a3= new Account("Saving",6666.0);
			 session.save(a3);
			Account a4= new Account("Credit",1111.0);
			 session.save(a4);
			Account a5= new Account("Saving",2222.0);
			 session.save(a5);
			Account a6= new Account("Credit",9889.0);
			 session.save(a6);
			Account a7= new Account("Current",6565.0);
			 session.save(a7);
			
			 
			 Set<Account> account1= new HashSet<Account>();
			 account1.add(a1);
			 account1.add(a2);
			 account1.add(a3);
			 c1.setAccount(account1);
			 
			 
			 Set<Account> account2= new HashSet<Account>();
			 account2.add(a4);
			 account2.add(a5);
			 c2.setAccount(account2);
			
			 
			 Set<Account> account3= new HashSet<Account>();
			 account3.add(a6);
			 account3.add(a7);
			 c3.setAccount(account3);
			 
			 tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("*** Error occured while inserting the data in to DB");
		}
		
		//9. Close the resource
		session.close();
		factory.close();
		System.out.println("9. Close the resource");
		
		System.out.println("--End********************ManyToManyMappingClient");
	}
}
