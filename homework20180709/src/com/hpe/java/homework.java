package com.hpe.java;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {

		test9();

	}

	public static void test1() {
		int sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void test2() {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "   ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "   ");
			}
			System.out.println();
		}
	}

	public static void test3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int num = sc.nextInt();
		int i;
		for (i = 2; i <= num; i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (i == num) {
			System.out.println(num + "是素数");
		} else {
			System.out.println(num + "不是素数");
		}

	}

	public static void test4() {
		int i;
		int j;
		int count = 0;
		for (i = 2; i <= 100; i++) {

			for (j = 2; j <= i; j++) {

				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.print(i + "   ");
				count++;
				if (count == 5) {
					System.out.println();
					count = 0;
				}
			}
		}

	}

	public static void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int num = sc.nextInt();
		for (int i = num - 1; i > 0; i--) {
			num *= i;
		}
		System.out.println(num);

	}

	// 圣诞树
	public static void test7() {
		int h = 6;
		for (int i = 1; i <= h; i++) {
			for (int j = 0; j < h - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 百钱白鸡
	public static void test8() {

		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 33; j++) {
				for (int k = 3; k < 300; k+=3) {
					if (5 * i + 3 * j + k / 3 == 100 && i + j + k == 100) {
						System.out.println("公鸡" + i + "只，母鸡" + j + "只，小鸡" + k + "只");
					}
				}
			}
		}
	}
	
	public static void test9() {
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					for (int m = 0; m <= 9; m++) {
						
						if (i == m && j == k) {
							System.out.println(i*1000+j*100+k*10+m);
						}
						
					}
				}
			}
		}
		
	}

}
