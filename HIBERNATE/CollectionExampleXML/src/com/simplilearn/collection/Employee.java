package com.simplilearn.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int empid;
	private String empname;
	private String empdob;
	private String empqualification;
	
	
	String[] empcourse;
	List<String> empemails;
	List<Integer> empmarks;
	Set<Long> empphone;
	
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
