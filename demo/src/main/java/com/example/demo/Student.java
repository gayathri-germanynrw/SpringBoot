package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  
public class Student {
	private int sId;
	private String sName;
	
	@Autowired
	private Marks marks;
	
	
	
	public Marks getMarks() {
		
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}
	
	public void compute() {
		
		System.out.println("inside Compute Method---");
		marks.totalMarks();

	}

}
