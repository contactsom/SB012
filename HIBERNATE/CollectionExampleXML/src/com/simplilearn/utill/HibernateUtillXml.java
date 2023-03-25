package com.simplilearn.utill;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtillXml {

		static SessionFactory factory;
		
		static {
			
			//1. Create the Configuration Object 
			Configuration cfg= new Configuration();
			
			//2. Call the configure method
			cfg=cfg.configure();
			
			//3. Through the Configuration object call the build session factory
			factory = cfg.buildSessionFactory();
			
		}
		
		public static SessionFactory getSessionFactory() {
			
			return factory;
		}

}
