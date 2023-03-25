package com.simplilearn.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="A_EMPLOYEE_DATA")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID")
	private int empid;
	
	@Column(name="EMPLOYEE_NAME")
	private String empname;
	
	@Column(name="EMPLOYEE_DOB")
	private String empdob;
	
	@Column(name="EMPLOYEE_QUALIFICATION")
	private String empqualification;
	
	@CollectionOfElements
	@JoinTable(name="A_EMPLOYEE_COURSE",joinColumns = @JoinColumn(name="empid"))
	@IndexColumn(name="COURSE_ID")
	@Column(name="COURSE")
	String[] empcourse;
	
	@CollectionOfElements
	@JoinTable(name="A_EMPLOYEE_EMAIL",joinColumns = @JoinColumn(name="empid"))
	@IndexColumn(name="COURSE_ID")
	@Column(name="EMAIL")
	List<String> empemails;
	
	@CollectionOfElements
	@JoinTable(name="A_EMPLOYEE_MARKS",joinColumns = @JoinColumn(name="empid"))
	@IndexColumn(name="COURSE_ID")
	@Column(name="MARKS")
	List<Integer> empmarks;
	
	@CollectionOfElements
	@JoinTable(name="A_EMPLOYEE_PHONE",joinColumns = @JoinColumn(name="empid"))
	@IndexColumn(name="COURSE_ID")
	@Column(name="PHONE")
	Set<Long> empphone;
	
	@CollectionOfElements
	@JoinTable(name="A_EMPLOYEE_REFERANCE",joinColumns = @JoinColumn(name="empid"))
	@IndexColumn(name="COURSE_ID")
	@Column(name="REFERANCE")
 	Map<String,Long>empreferance;
 	
 	public Employee() {
		super();
	
	}

 	
	public Employee(String empname, String empdob, String empqualification, String[] empcourse,
			List<String> empemails, List<Integer> empmarks, Set<Long> empphone, Map<String, Long> empreferance) {
		super();
		this.empname = empname;
		this.empdob = empdob;
		this.empqualification = empqualification;
		this.empcourse = empcourse;
		this.empemails = empemails;
		this.empmarks = empmarks;
		this.empphone = empphone;
		this.empreferance = empreferance;
	}
	
	
	public Employee(int empid, String empname, String empdob, String empqualification, String[] empcourse,
			List<String> empemails, List<Integer> empmarks, Set<Long> empphone, Map<String, Long> empreferance) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdob = empdob;
		this.empqualification = empqualification;
		this.empcourse = empcourse;
		this.empemails = empemails;
		this.empmarks = empmarks;
		this.empphone = empphone;
		this.empreferance = empreferance;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public String getEmpdob() {
		return empdob;
	}


	public void setEmpdob(String empdob) {
		this.empdob = empdob;
	}


	public String getEmpqualification() {
		return empqualification;
	}


	public void setEmpqualification(String empqualification) {
		this.empqualification = empqualification;
	}


	public String[] getEmpcourse() {
		return empcourse;
	}


	public void setEmpcourse(String[] empcourse) {
		this.empcourse = empcourse;
	}


	public List<String> getEmpemails() {
		return empemails;
	}


	public void setEmpemails(List<String> empemails) {
		this.empemails = empemails;
	}


	public List<Integer> getEmpmarks() {
		return empmarks;
	}


	public void setEmpmarks(List<Integer> empmarks) {
		this.empmarks = empmarks;
	}


	public Set<Long> getEmpphone() {
		return empphone;
	}


	public void setEmpphone(Set<Long> empphone) {
		this.empphone = empphone;
	}


	public Map<String, Long> getEmpreferance() {
		return empreferance;
	}


	public void setEmpreferance(Map<String, Long> empreferance) {
		this.empreferance = empreferance;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdob=" + empdob + ", empqualification="
				+ empqualification + ", empcourse=" + Arrays.toString(empcourse) + ", empemails=" + empemails
				+ ", empmarks=" + empmarks + ", empphone=" + empphone + ", empreferance=" + empreferance + "]";
	}
 	
}
