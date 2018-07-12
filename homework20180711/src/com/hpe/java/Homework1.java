package com.hpe.java;

import java.util.Scanner;

import org.junit.Test;

public class Homework1 {
	MyTools mt = new MyTools();

	@Test
	// 质数因子
	public void test1() {
		mt.primeNumber(90, 0);
	}

	@Test
	// 多个数相加
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个1-9的整数");
		int a = sc.nextInt();
		System.out.println("请输入多少个这样的数相加");
		int b = sc.nextInt();
		System.out.println("是否输出算式，是输入true,否输入false");
		boolean sec = sc.nextBoolean();
		mt.numPlus(a, b, sec);
	}

	@Test
	// 打印多个*
	public void test3() {
		for (int i = 0; i < 7; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个1-50的整数");
			int count = sc.nextInt();
			if (count > 50 || count < 1) {
				System.out.println("输入数据有误");
				break;
			}
			mt.printStr("*", count);
			System.out.println();
		}
	}

	@Test
	// 是否完数
	public void test4() {
		for (int i = 2; i <= 1000; i++) {
			if (mt.primeNumber(i, 1) == 1) {
				System.out.println(i + "是完数");
			}
		}
	}

	@Test
	// 排列组合
	public void test5() {
		int count = 0;
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				for (int j2 = 1; j2 <= 4; j2++) {

					if (i != j && j != j2 && i != j2) {
						count++;
						System.out.println(i * 100 + j * 10 + j2);
					}
				}
			}
		}
		System.out.println("一共有" + count + "个不重复的数");
	}

	@Test
	// 打印菱形
	public void test6() {
		int h = 7;
		// 打印上半部分
		int n = h / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 打印下半部分
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	@Test
	//猴子分桃
	public void test7() {
		int sum = 1;
		for (int i = 0; i < 5; i++) {
			sum = sum * 5 + 1;
		}
		System.out.println("最少有"+sum+"个桃子");
	}
}
