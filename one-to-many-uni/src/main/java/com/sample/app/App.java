package com.sample.app;
import com.sample.entity.Customer;

import com.sample.entity.Policy;
import com.sample.util.HibernateUtil;
import com.sample.dao.PolicyDao;

import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.mysql.cj.xdevapi.SessionFactory;
import com.sample.dao.CustomerDao;
import com.sample.dao.PolicyDao;
public class App {

	public static void main(String[] args) {
		
		
		System.out.println("====create policy====");
		Customer c=new Customer();
		c.setName("bincy");
		
		CustomerDao dao=new CustomerDao();
		
		 List<Policy> p= new ArrayList<>();
	      
		Policy p1=new Policy("jeevn","life",54554);
		Policy p2=new Policy("ic","vehicle",54545);
		
		p.add(p1);
		p.add(p2);
		c.setPlist(p);
		
		
	/*	PolicyDao d=new PolicyDao();
		d.createpolicy(p1);
		d.createpolicy(p2);*/
		
		dao.saveCustomer(c);
		
		dao.displayCustomers();
		
//		List<Policy> policy=Customer.getPlist();
//		for(Policy i:policy)
//			System.out.println(i.toString());
	}
	
	
	
	
}
