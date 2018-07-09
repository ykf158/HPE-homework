package com.hpe.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		test11();
	}

	public static void test4() {

		for (int i = 1900; i <= 2050; i++) {

			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.println(i);
			}

		}

	}

	public static void test5() {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("*************************");
			System.out.println("1.管理员   2.顾客   3.退出");
			System.out.println("*************************");
			System.out.println("请输入数字选择登录:");
			int sec = sc.nextInt();
			if (sec != 1 && sec != 2 || sec == 3) {
				flag = false;
				if (sec == 3) {
					System.out.println("系统退出");
				} else {
					System.out.println("输入错误");
				}
				break;
			}
			switch (sec) {
			case 1:
				System.out.println("管理员登录过程省略");
				break;
			case 2:
				System.out.println("顾客登录过程省略");
				break;
			default:
				break;
			}
		}

	}

	public static void test6() {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("计算面积");
			System.out.println("1.矩形  2.三角形  3.圆  4.退出");
			System.out.println("请选择数字对应的功能：");
			int sec = sc.nextInt();
			if (sec != 1 && sec != 2 && sec != 3 || sec == 4) {
				flag = false;
				if (sec == 4) {
					System.out.println("系统退出");
				} else {
					System.out.println("输入错误");
				}
				break;
			}
			switch (sec) {
			case 1:
				System.out.println("你选择了矩形");
				rectangle();
				break;
			case 2:
				System.out.println("你选择了三角形");
				triangle();
				break;
			case 3:
				System.out.println("你选择了圆形");
				round();
				break;
			default:
				break;
			}
		}

	}

	public static void rectangle() {
		// 矩形方法
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入矩形的高");
		double x = sc.nextDouble();
		System.out.println("请输入矩形的宽");
		double y = sc.nextDouble();
		System.out.println("该矩形的面积为:" + (x * y));
	}

	public static void triangle() {
		// 三角形方法
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三角形的底边长");
		double x = sc.nextDouble();
		System.out.println("请输入三角形的高");
		double y = sc.nextDouble();
		System.out.println("该矩形的面积为:" + (0.5 * x * y));
	}

	public static void round() {
		// 圆形方法
		// 设置PI的值
		DecimalFormat df = new DecimalFormat("#.00");
		double pi = Double.parseDouble(df.format(Math.PI));

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆的半径");
		double r = sc.nextDouble();
		System.out.println("该圆的面积为:" + (r * r * pi));
	}

	public static void test7() {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int temp = 0;
		while (flag) {
			System.out.println("请输入一个正整数");
			String i = sc.nextLine();
			if (i.equals("end")) {
				flag = false;
				System.out.println("输入结束");
				break;
			}
			int num = Integer.parseInt(i);
			if (num > temp) {
				temp = num;
			}

		}
		System.out.println("最大值是:" + temp);

	}

	public static void test8() {

		int sum = 1;
		int i = 2;
		while (i++ <= 10) {
			sum = (sum + 1) * 2;
		}
		System.out.println("第一天摘的桃子数为：" + sum);

	}

	public static void test9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个int型数据");
		int i = sc.nextInt();
		int count = 0;
		while (i != 0) {
			i = i & (i - 1);
			count++;
		}
		System.out.println(count);
	}

	public static void test10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int num = sc.nextInt();
		while (num != 1) {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					num /= i;
					System.out.println(i);
					break;
				}
			}
		}
	}

	public static void test11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个正整数");
		int a = sc.nextInt();
		System.out.println("请输入第二个正整数");
		int b = sc.nextInt();
		int num = a * b;
		int c = 0;
		boolean flag = true;
		while (flag) {
			c = a % b;
			if (c == 0) {
				flag = false;
				break;
			}
			a = b;
			b = c;
		}
		num = num / b;
		System.out.println(num);
	}
}
