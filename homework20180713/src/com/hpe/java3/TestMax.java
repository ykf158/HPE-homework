package com.hpe.java3;

public class TestMax {

	public static void main(String[] args) {

		Max max = new Max();
		System.out.println(max.max(2, 3));
		System.out.println(max.max(4, 2, 3));
		System.out.println(max.max(2, 4, 5, 3));

	}

}
