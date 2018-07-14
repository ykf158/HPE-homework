package com.hpe.java4;

public class Student {

	private String name;
	private int age;
	private String sex;
	private int no;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public Student(String name, int age, String sex, int no) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.no = no;
	}
	
	public void showInfo() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", no=" + no + "]";
	}
	
}
