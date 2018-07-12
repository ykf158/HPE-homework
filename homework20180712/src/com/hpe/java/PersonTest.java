package com.hpe.java;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "小六";
		p1.sex = "男";
		p1.study();
		p1.showAge();
		p1.addAge(2);
		p1.showAge();
		
		Person p2 = new Person();
		p2.age = 9;
		p2.name = "小七";
		p2.sex = "女";
		p2.study();
		p2.showAge();
		p2.addAge(2);
		p2.showAge();
	}

}
