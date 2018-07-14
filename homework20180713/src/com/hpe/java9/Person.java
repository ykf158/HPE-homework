package com.hpe.java9;

public class Person {

	private String name;
	private int age;
	private String school;
	private String major;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}
	public Person(String name, int age, String school, String major) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
		this.major = major;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", school=" + school + ", major=" + major + "]";
	}
	
	
}
