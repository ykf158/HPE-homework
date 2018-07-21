package com.hpe.phonebookmap;

public class PhonBookMember {

	private String name;
	private char sex;
	private int age;
	private String number;
	private String qq;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public PhonBookMember() {
		super();
	}

	public PhonBookMember(String name, char sex, int age, String number, String qq, String address) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.number = number;
		this.qq = qq;
		this.address = address;
	}
	@Override
	public String toString() {
		return "姓名：" + name + ", 性别：" + sex + ", 年龄：" + age + ", 电话：" + number + ", QQ：" + qq
				+ ", 地址：" + address;
	}
	
	
}
