package com.simplilearn.mapping;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="A_CUSTOMER_DETAILS_BI")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private int cid;
	
	@Column(name="CUSTOMER_NAME")
	private String cname;
	
	@Column(name="CUSTOMER_EMAIL")
	private String cemail;
	
	@Column(name="CUSTOMER_DOB")
	private Date dob;
	
	@Column(name="CUSTOMER_PHONE")
	private Long phone;
	
	@ManyToMany()
	@JoinTable(
				name="A_CUSTOMER_ACCOUNT_PK",
				joinColumns =  @JoinColumn (name="cid",referencedColumnName = "CUSTOMER_ID"),
				inverseJoinColumns = @JoinColumn(name="accountno",referencedColumnName = "ACCOUNT_ID")
			
			)
	Set<Account> account;//Many Customer have Many Account

	
	public Customer() {
		super();
		
	}
	
	public Customer(String cname, String cemail, Date dob, Long phone, Set<Account> account) {
		super();
		this.cname = cname;
		this.cemail = cemail;
		this.dob = dob;
		this.phone = phone;
		this.account = account;
	}
	
	
	public Customer(String cname, String cemail, Date dob, Long phone) {
		super();
		this.cname = cname;
		this.cemail = cemail;
		this.dob = dob;
		this.phone = phone;
	}
	
	public Customer(int cid, String cname, String cemail, Date dob, Long phone, Set<Account> account) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemail = cemail;
		this.dob = dob;
		this.phone = phone;
		this.account = account;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Set<Account> getAccount() {
		return account;
	}

	public void setAccount(Set<Account> account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", dob=" + dob + ", phone=" + phone
				+ ", account=" + account + "]";
	}
	
}
