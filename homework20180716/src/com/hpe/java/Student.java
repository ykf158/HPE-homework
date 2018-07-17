package com.hpe.java;

public class Student extends Person{

	private String no;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Student(String name, int age, char sex, String no) {
		super(name, age, sex);
		this.no = no;
	}
	
	@Override
	public void showInfo() {
		System.out.println("name=" + getName() + ", age=" + getAge() + ", sex=" + getSex()+"，学号="+no);
	}
}
