package com.hpe.java3;

public class TestAddition {

	public static void main(String[] args) {

		Addition a = new Addition();
		System.out.println(a.add(2, 2));
		System.out.println(a.add(22, 22));
		System.out.println(a.add(2.0, 2.0));
		System.out.println(a.add(2.00, 2.00));
		System.out.println(a.add("a", "a"));
	}

}
