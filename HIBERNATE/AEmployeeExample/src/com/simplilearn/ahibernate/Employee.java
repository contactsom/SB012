package com.simplilearn.ahibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_INFO")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID")
	private int empid;// PK
	
	@Column(name="EMPLOYEE_NAME")
	private String empname;
	
	@Column(name="EMPLOYEE_EMAIL")
	private String empemail;
	
	@Column(name="EMPLOYEE_ADDRESS")
	private String empaddress;
	
	@Column(name="EMPLOYEE_SALARY")
	private long empsal;
	
	@Column(name="EMPLOYEE_DESIGNATION")
	private String empdesignation;
	
	
	public Employee() {
		super();
	}

	public Employee(String empname, String empemail, String empaddress, long empsal, String empdesignation) {
		super();
		this.empname = empname;
		this.empemail = empemail;
		this.empaddress = empaddress;
		this.empsal = empsal;
		this.empdesignation = empdesignation;
	}
	
	public Employee(int empid, String empname, String empemail, String empaddress, long empsal, String empdesignation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empemail = empemail;
		this.empaddress = empaddress;
		this.empsal = empsal;
		this.empdesignation = empdesignation;
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

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public long getEmpsal() {
		return empsal;
	}

	public void setEmpsal(long empsal) {
		this.empsal = empsal;
	}

	public String getEmpdesignation() {
		return empdesignation;
	}

	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empemail=" + empemail + ", empaddress="
				+ empaddress + ", empsal=" + empsal + ", empdesignation=" + empdesignation + "]";
	}
}
