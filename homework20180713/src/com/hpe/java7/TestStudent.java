package com.hpe.java7;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student(0001, "小白", new double[]{60,70,80}) ;
		Student s2 = new Student(0002, "小黑", new double[]{61,71,81}) ;
		System.out.println(s1);
		System.out.println(s2);
	}

}
