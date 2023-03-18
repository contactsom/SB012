package com.simplilearn.ahibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_INFO")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private int cid;// PK
	
	@Column(name="CUSTOMER_NAME")
	private String name;
	
	@Column(name="CUSTOMER_EMAIL")
	private String email;
	
	@Column(name="CUSTOMER_PHONE")
	private long phone;
	
	@Column(name="CUSTOMER_CITY")
	private String city;
	
	@Column(name="CUSTOMER_BALANCE")
	private double balance;

	
	public Customer() {
		super();
		
	}
	
	public Customer(String name, String email, long phone, String city, double balance) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.balance = balance;
	}
	
	public Customer(int cid, String name, String email, long phone, String city, double balance) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.balance = balance;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ ", balance=" + balance + "]";
	}
}
