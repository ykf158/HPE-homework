package com.hpe.java;

import java.util.Scanner;

import org.junit.Test;

public class Homework2 {
	MyTools mt = new MyTools();

	@Test
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组的长度");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("请输入该数组");
		mt.input(arr);
		mt.resort(arr);
		System.out.println("逆序输出");
		mt.show(arr);
	}

	@Test
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个7~9位的整数");
		String num = sc.nextInt() + "";
		char[] str = new char[num.length()];
		for (int i = 0; i < num.length(); i++) {
			str[i] = num.charAt(i);
		}
		for (int i = str.length - 4; i > str.length - 8; i--) {
			System.out.print(str[i] + " ");
		}

	}

	@Test
	public void test3() {
		mt.printYang(10);
	}

	@Test
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组的长度");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("请输入该数组");
		mt.input(arr);
		int maxIndex = mt.getMax(arr);
		int minIndex = mt.getMin(arr);
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[0];
		arr[0] = temp;
		temp = arr[minIndex];
		arr[minIndex] = arr[0];
		arr[0] = temp;
		mt.show(arr);

	}

	@Test
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数的个数");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("请依次输入整数");
		mt.input(arr);
		System.out.println("请输入移动的位数");
		int m = sc.nextInt();
		mt.move(arr, m);
		mt.show(arr);
	}

	@Test
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入总人数");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		int num = 1;

		for (int i = 0;; i++) {
			if (arr[i] != 1) {
				if (num % 3 == 0) {
					count++;
					arr[i]=1;
				}
				num++;
			}
			if (i == arr.length - 1) {
				i = -1;
			}
			if (count == n - 1) {
				break;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println(i + 1);
			}
		}

	}

	@Test
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个4位的整数");
		String num = sc.nextInt() + "";
		int[] arr = new int[num.length()];
		for (int i = 0; i < num.length(); i++) {
			arr[i] = num.charAt(i) - '0';
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] + 5) % 10;
		}
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		temp = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		mt.show(arr);
	}

}
