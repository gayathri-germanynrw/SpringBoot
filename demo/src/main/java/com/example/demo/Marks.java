package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Marks {
	private int tamil;
	private int english;
	private int maths;
	public int getTamil() {
		return tamil;
	}
	public void setTamil(int tamil) {
		this.tamil = tamil;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	@Override
	public String toString() {
		return "Marks [tamil=" + tamil + ", english=" + english + ", maths=" + maths + "]";
	}
	
	
	public void totalMarks() {
		System.out.println("Total Marks--");

	}
	

}
