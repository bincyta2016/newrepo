package com.sample.util;

import org. hibernate. SessionFactory;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sample.entity.Customer;
import com.sample.entity.Policy; 


public class HibernateUtil { 

	static SessionFactory sessionFactory = null; 
// get session factory 
	
	public static SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		if (sessionFactory == null) 
		{
			Configuration configuration = new Configuration().addAnnotatedClass(Policy.class).addAnnotatedClass(Customer.class).configure("hibernate.cfg.xml"); 
			
			sessionFactory = configuration.buildSessionFactory(); 
	     }
		return sessionFactory;
		
	} 
	
	 
} 
