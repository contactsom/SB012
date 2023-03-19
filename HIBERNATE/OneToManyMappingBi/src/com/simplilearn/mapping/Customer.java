package com.simplilearn.mapping;

import java.util.Date;
import java.util.Set;

public class Customer {

	private int customerid;
	private String customername;
	private String customeremail;
	private long phone;
	private Date customerdob;
	
	Set<Order> order; 	//One Customer have multiple Order 

	
	public Customer() {
		super();
		
	}
	
	public Customer(int customerid, String customername, String customeremail, long phone, Date customerdob) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customeremail = customeremail;
		this.phone = phone;
		this.customerdob = customerdob;
	}
	
	public Customer(String customername, String customeremail, long phone, Date customerdob) {
		super();
		this.customername = customername;
		this.customeremail = customeremail;
		this.phone = phone;
		this.customerdob = customerdob;
	}
	
	public Customer(int customerid, String customername, String customeremail, long phone, Date customerdob,
			Set<Order> order) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customeremail = customeremail;
		this.phone = phone;
		this.customerdob = customerdob;
		this.order = order;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Date getCustomerdob() {
		return customerdob;
	}

	public void setCustomerdob(Date customerdob) {
		this.customerdob = customerdob;
	}

	public Set<Order> getOrder() {
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customeremail="
				+ customeremail + ", phone=" + phone + ", customerdob=" + customerdob + ", order=" + order + "]";
	}
}
