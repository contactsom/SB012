package com.simplilearn.employee;

public class Employee {

	private int empid;// PK
	private String empname;
	private String emapemail;
	private String empaddress;
	private long empsalary;
	private String empdesignation;
	//Home Work
	// Add some fields and then save the data in to DB
	
	
	public Employee() {
		super();
	
	}
	
	
	public Employee(String empname, String emapemail, String empaddress, long empsalary,String empdesignation) {
		super();
		this.empname = empname;
		this.emapemail = emapemail;
		this.empaddress = empaddress;
		this.empsalary = empsalary;
		this.empdesignation = empdesignation;
	}
	
	public Employee(int empid, String empname, String emapemail, String empaddress, long empsalary,
			String empdesignation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emapemail = emapemail;
		this.empaddress = empaddress;
		this.empsalary = empsalary;
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


	public String getEmapemail() {
		return emapemail;
	}


	public void setEmapemail(String emapemail) {
		this.emapemail = emapemail;
	}


	public String getEmpaddress() {
		return empaddress;
	}


	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}


	public long getEmpsalary() {
		return empsalary;
	}


	public void setEmpsalary(long empsalary) {
		this.empsalary = empsalary;
	}


	public String getEmpdesignation() {
		return empdesignation;
	}


	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", emapemail=" + emapemail + ", empaddress="
				+ empaddress + ", empsalary=" + empsalary + ", empdesignation=" + empdesignation + "]";
	}
	
}
