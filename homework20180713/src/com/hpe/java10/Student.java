package com.hpe.java10;

public class Student extends Person{

	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Student(String name,int no,int age,String sex) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
		this.no = no;
	}
	
}
