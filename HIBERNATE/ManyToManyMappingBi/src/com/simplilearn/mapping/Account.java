package com.simplilearn.mapping;

import java.util.Set;

public class Account {

	private int accountno;
	private String accounttype;
	private Double balance;
	
	Set<Customer> customer; //Many Account have Many Customer 

	
	public Account() {
		super();
		
	}
	
	
	public Account(String accounttype, Double balance, Set<Customer> customer) {
		super();
		this.accounttype = accounttype;
		this.balance = balance;
		this.customer = customer;
	}
	
	
	public Account(String accounttype, Double balance) {
		super();
		this.accounttype = accounttype;
		this.balance = balance;
	}
	
	public Account(int accountno, String accounttype, Double balance, Set<Customer> customer) {
		super();
		this.accountno = accountno;
		this.accounttype = accounttype;
		this.balance = balance;
		this.customer = customer;
	}


	public int getAccountno() {
		return accountno;
	}


	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}


	public String getAccounttype() {
		return accounttype;
	}


	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}


	public Set<Customer> getCustomer() {
		return customer;
	}


	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", accounttype=" + accounttype + ", balance=" + balance
				+ ", customer=" + customer + "]";
	}
	
}
