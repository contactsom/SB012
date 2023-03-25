package com.simplilearn.mapping;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="A_ACCOUNT_DATA_BI")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ACCOUNT_ID")
	private int accountno; // PK
	
	@Column(name="ACCOUNT_TYPE")
	private String accounttype;
	
	@Column(name="ACCOUNT_BALANCE")
	private Double balance;
	
	@ManyToMany(mappedBy = "account")
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
