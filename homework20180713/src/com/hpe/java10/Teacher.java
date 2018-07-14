package com.hpe.java10;

public class Teacher extends Person{

	private String position;

	

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	public Teacher(String name,String position,int age,String sex) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
		this.position = position;
	}
	
}
