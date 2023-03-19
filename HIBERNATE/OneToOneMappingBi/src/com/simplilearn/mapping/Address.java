package com.simplilearn.mapping;

public class Address {

	int aid; // PK
	String street;
	String city;
	String state;
	
	Student student; /*This Address belongs to this Student*/

	
	public Address() {
		super();
	}


	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	public Address(String street, String city, String state, Student student) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.student = student;
	}
	
	
	public Address(int aid, String street, String city, String state, Student student) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.student = student;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", state=" + state + ", student="
				+ student + "]";
	}
}
