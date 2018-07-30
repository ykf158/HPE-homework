package com.hpe.po;

public class Telephone {

	private String name;
	private char sex;
	private int age;
	private String tel;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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

	public Telephone() {
		super();
	}

	public Telephone(String name, char sex, int age, String tel, String qq, String address) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.qq = qq;
		this.address = address;
	}
	@Override
	public String toString() {
		return "姓名：" + name + ", 性别：" + sex + ", 年龄：" + age + ", 电话：" + tel + ", QQ：" + qq
				+ ", 地址：" + address;
	}
	public String message() {
		return name + "," + sex + "," + age + "," 
				+ tel + "," + qq + "," + address;
	}
	
	
}
