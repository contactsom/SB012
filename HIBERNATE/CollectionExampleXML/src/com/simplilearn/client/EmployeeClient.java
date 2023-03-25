package com.simplilearn.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.collection.Employee;
import com.simplilearn.utill.HibernateUtillXml;

public class EmployeeClient {

	public static void main(String[] args) {
		
		System.out.println("--START-********************EmployeeClient********************");
		
		SessionFactory factory = null;
		Session session=null;
		Transaction tx = null;
		
		try {
			
			 factory = HibernateUtillXml.getSessionFactory();
			 session=factory.openSession();
			 tx=session.beginTransaction();
			 
			 
			 String[] employeeCourse={"JAVA","PYTHON","HIBERNATE","JDBC","JPA","SERVLET","JSP"};
			 
			 List<String>  empemailsList = new ArrayList<String>();
			 empemailsList.add("sasidhar@simplilearn.com");
			 empemailsList.add("surya@simplilearn.com");
			 empemailsList.add("ayaz@simplilearn.com");
			 empemailsList.add("sindhu@simplilearn.com");
			 empemailsList.add("kalpana@simplilearn.com");
			 empemailsList.add("vaibhav@simplilearn.com");
			 empemailsList.add("souvik@simplilearn.com");


			 List<Integer> employeeMarks = new ArrayList<Integer>();
			 employeeMarks.add(90);
			 employeeMarks.add(80);
			 employeeMarks.add(70);
			 employeeMarks.add(60);
			 employeeMarks.add(50);
			 employeeMarks.add(40);
			 employeeMarks.add(30);
			 
			 Set<Long> employeePhone= new HashSet<Long>();
			 employeePhone.add(new Long(123456789));
			 employeePhone.add(new Long(223456789));
			 employeePhone.add(new Long(323456789));
			 employeePhone.add(new Long(423456789));
			 employeePhone.add(new Long(523456789));
			 employeePhone.add(new Long(623456789));
			 employeePhone.add(new Long(723456789));
			 
			 
			 Map<String,Long>employeeReferance = new HashMap<String, Long>();
			 employeeReferance.put("Attish", new Long(1234));
			 employeeReferance.put("Adwik", new Long(2234));
			 employeeReferance.put("Prakash", new Long(3234));
			 employeeReferance.put("Anisha", new Long(4234));
			 employeeReferance.put("Attish", new Long(5234));
			 employeeReferance.put("Redghost", new Long(6234));
			 employeeReferance.put("Joy", new Long(7234));
			 
			 
			 Employee employee = new Employee("Jon Joy", "03-JULY-1992", "CEO", employeeCourse, empemailsList, employeeMarks, employeePhone, employeeReferance);
			
			 session.save(employee);
			 tx.commit();
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("*********Error occured while inserting the data*********");
		}

		
		System.out.println("--END-********************EmployeeClient********************");
	}

}
