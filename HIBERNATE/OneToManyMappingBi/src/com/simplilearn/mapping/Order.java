package com.simplilearn.mapping;

import java.util.Date;

public class Order {

	private int orderid;
	private int orderqty;
	private Double ordercost;
	private Date orderdate;
	private String orderstatus;
	
	Customer customer;// All orders belongs to One Customer

	
	public Order() {
		super();
	}
	
	public Order(int orderqty, Double ordercost, Date orderdate, String orderstatus) {
		super();
		this.orderqty = orderqty;
		this.ordercost = ordercost;
		this.orderdate = orderdate;
		this.orderstatus = orderstatus;
	}
	
	public Order(int orderid, int orderqty, Double ordercost, Date orderdate, String orderstatus, Customer customer) {
		super();
		this.orderid = orderid;
		this.orderqty = orderqty;
		this.ordercost = ordercost;
		this.orderdate = orderdate;
		this.orderstatus = orderstatus;
		this.customer = customer;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getOrderqty() {
		return orderqty;
	}

	public void setOrderqty(int orderqty) {
		this.orderqty = orderqty;
	}

	public Double getOrdercost() {
		return ordercost;
	}

	public void setOrdercost(Double ordercost) {
		this.ordercost = ordercost;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", orderqty=" + orderqty + ", ordercost=" + ordercost + ", orderdate="
				+ orderdate + ", orderstatus=" + orderstatus + ", customer=" + customer + "]";
	}
	
}
