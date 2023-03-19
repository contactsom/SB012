package com.simplilearn.mapping;

public class Student {

	int sid;  // PK
	String sname;
	String semail;
	long phone;
	
	Address address; /*Student has the Address*/

	
	public Student() {
	
	}
	
	
	public Student(String sname, String semail, long phone) {
		super();
		this.sname = sname;
		this.semail = semail;
		this.phone = phone;
	}
	
	public Student(String sname, String semail, long phone, Address address) {
		super();
		this.sname = sname;
		this.semail = semail;
		this.phone = phone;
		this.address = address;
	}
	
	
	public Student(int sid, String sname, String semail, long phone, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.phone = phone;
		this.address = address;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getSemail() {
		return semail;
	}


	public void setSemail(String semail) {
		this.semail = semail;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", phone=" + phone + ", address="
				+ address + "]";
	}
	
}
