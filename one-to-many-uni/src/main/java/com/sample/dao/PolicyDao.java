package com.sample.dao;

import javax.transaction.Transaction;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.sample.entity.Customer;
import com.sample.dao.CustomerDao;
import com.sample.entity.Policy;
import com.sample.util.HibernateUtil;

public class PolicyDao {
	
	
	static SessionFactory sessionFactory = null; 
	Transaction t=null;
	// fetch and display all 
	public void createpolicy(Policy p)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		//session.save(c.getP_details());
		
		session.save(p);
		session.getTransaction().commit();
		System.out.println("inserted Successfully \n" + p.toString());
		session.close();
	}
	public Policy getPolicy(int id) {
		
		Policy p=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		p=session.get(Policy.class, id);
		System.out.println(p.toString());
		session.close();
		return p;
	}
	
	public void update(Policy p) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session. beginTransaction();
		session.update(p);
		session.close();
	}
	public void delete(int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session. beginTransaction();
		Policy p = session.get(Policy.class,id);
		session.delete(p);
		//session.delete(p);
		System.out.println("Deleted"+id);
		session.close();
	}





}
