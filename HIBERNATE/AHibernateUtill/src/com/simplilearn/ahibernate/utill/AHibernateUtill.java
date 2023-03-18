package com.simplilearn.ahibernate.utill;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class AHibernateUtill {

	static SessionFactory factory;
	
	static {
		
		//1. Create the Configuration Object 
		AnnotationConfiguration acfg= new AnnotationConfiguration();
		
		//2. Call the configure method
		acfg=(AnnotationConfiguration)acfg.configure();
		
		//3. Through the Configuration object call the build session factory
		factory = acfg.buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFactory() {
		
		return factory;
	}


}
