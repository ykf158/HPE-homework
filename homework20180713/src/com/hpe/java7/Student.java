package com.hpe.java7;

import java.util.Arrays;

public class Student {

	private int no;
	private String name;
	private double[] grade = new double[3];
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double[] getGrade() {
		return grade;
	}
	public void setGrade(double[] grade) {
		this.grade = grade;
	}
	public Student(int no, String name, double[] grade) {
		super();
		this.no = no;
		this.name = name;
		this.grade = grade;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", grade=" + Arrays.toString(grade) + "]";
	}
	
	
	
}
