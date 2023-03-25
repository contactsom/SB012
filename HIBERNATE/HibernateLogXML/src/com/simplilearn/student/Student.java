package com.simplilearn.student;

/*POJO*/
public class Student {

	int stuid; // PK
	String stuname;
	String stuemail;
	int stuphone;
	
	public Student() {
		super();
	}
	
	public Student(String stuname, String stuemail, int stuphone) {
		super();
		this.stuname = stuname;
		this.stuemail = stuemail;
		this.stuphone = stuphone;
	}
	
	public Student(int stuid, String stuname, String stuemail, int stuphone) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuemail = stuemail;
		this.stuphone = stuphone;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStuemail() {
		return stuemail;
	}

	public void setStuemail(String stuemail) {
		this.stuemail = stuemail;
	}

	public int getStuphone() {
		return stuphone;
	}

	public void setStuphone(int stuphone) {
		this.stuphone = stuphone;
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", stuemail=" + stuemail + ", stuphone=" + stuphone
				+ "]";
	}
	
}
