package com.sample.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer12")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int Id;
	
	
	@Column(name="Name")
	private String name;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	
	private  List<Policy> plist;
	
	
	
//	public Customer( String name, Policy p_details, int age, String email, int number) {
//		super();
//		
//		this.name = name;
//		this.p_details = p_details;
//		this.age = age;
//		this.email = email;
//		this.number = number;
//	}
	
	/*public static List<Policy> getPlist() {
		return plist;
	}
	public static void setPlist(List<Policy> plist) {
		Customer.plist = plist;
	}*/
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Policy> getPlist() {
		return plist;
	}
	public void setPlist(List<Policy> plist) {
		this.plist = plist;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", plist=" + plist + "]";
	}

	
	
	
	/*@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", policy_details=" + plist +  "]";
	}*/
	
	

}
