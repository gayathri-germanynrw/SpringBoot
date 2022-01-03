package com.webproject.demo;

public class Person {
	private int pid;
	private String pname;
	private String designation;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", designation=" + designation + "]";
	}
	
	

}
