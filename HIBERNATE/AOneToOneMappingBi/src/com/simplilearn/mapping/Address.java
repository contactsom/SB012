package com.simplilearn.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AADDRESS_INFO")
public class Address {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name="ADDRESS_ID")
	int aid; // PK
	
	@Column(name="STREET")
	String street;
	
	@Column(name="CITY")
	String city;
	
	@Column(name="STATE")
	String state;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="STUDENT_ID")
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
