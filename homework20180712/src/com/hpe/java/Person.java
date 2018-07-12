package com.hpe.java;

public class Person {

	public String name;
	public int age;
	public String sex;
	
	
	public void study() {
		System.out.println("studying");
	}
	public void showAge() {
		System.out.println("age="+age);
	}
	public void addAge(int i) {
		age+=i;
		
	}
}
