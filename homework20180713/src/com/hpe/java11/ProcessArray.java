package com.hpe.java11;

import java.util.Scanner;

import org.junit.Test;

import com.hpe.java2.MyTools;

public class ProcessArray {

	MyTools mt = new MyTools();

	@Test
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查看的月数");
		int count = sc.nextInt();
		int[] arr = mt.fibonacci(count);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("第" + (i + 1) + "个月的兔子总数：" + arr[i] * 2);
		}
	}

	@Test
	public void test2() {
		double meters = 100;
		double sumMeters = 200;
		double fMeters = 100;
		for (int i = 2; i < 10; i++) {
			sumMeters += (meters / 2);
		}
		for (int i = 0; i < 10; i++) {
			fMeters /= 2;
		}
		System.out.println("第10次落地时，共经过" + sumMeters + "米，第10次反弹高度" + fMeters + "米");
	}

	/*
	 * @Test public void test3() { int n = 0; boolean flag = true; while (flag) {
	 * int m = n; while (m * m <= (n * n + 168 + 100)) { if (m * m == (n * n + 100)
	 * && m * m == (n * n + 168 + 100)) { flag = false; break; }
	 * System.out.println("m" + m); m++; } System.out.println("n" + n); n++; }
	 * System.out.println("这个数是" + (n - 1) * (n - 1)); }
	 */

	@Test
	public void test3() {
		int i = 0;
		double a = 0;
		double b = 0;
		boolean flag = true;
		while (flag) {
			int count = 0;
			a = Math.sqrt(i + 100);
			b = Math.sqrt(i + 100 + 168);
			if (a == (int) a && b == (int) b) {
				System.out.println(i);
				count++;
			}
			i++;

			if (count > 0) {
				flag = false;
			}
		}
	}

	@Test
	public void test4() {
		int[] arr = new int[21];
		arr[0] = 1;
		arr[1] = 2;
		double d = 0.0;
		for (int i = 2; i < 21; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		for (int i = 0; i < 20; i++) {
			d += (arr[i + 1] / arr[i]);
		}
		System.out.println(d);
	}

	@Test
	public void test5() {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			int a = 1;
			for (int j = 1; j <= i; j++) {
				a *= j;
			}
			sum += a;
		}
		System.out.println(sum);
	}

	@Test
	public void test6() {
		int age = 10;
		for (int i = 1; i < 5; i++) {
			age += 2;
		}
		System.out.println(age);
	}

	@Test
	public void test7() {
		int sumCount = 4;
		for (int i = 2; i <= 7; i++) {
			sumCount += 7 * 4 * Math.pow(8, (i - 2));
		}
		System.out.println(sumCount);
	}

	@Test
	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n = sc.nextInt();
		int count = 0;
		boolean flag = true;
		while (n >= 9) {
			n /= 9;
			count++;
			if (n == 9) {
				flag = false;
				count += 1;
				break;
			}
		}
		if (!flag) {
			System.out.println(count);
		} else {
			System.out.println("不能被9完全整除");
		}
	}

	@Test
	public void test9() {

		char a=' ';
		char b=' ';
		char c=' ';
		char[] n = { 'x', 'y', 'z' };
		for (int i = 0; i < n.length; i++) {
			if (n[i] != 'x' && n[i] != 'z') {
				c = n[i];
				n[i] = 0;
			}
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] != 'x' && n[i] != 0) {
				a = n[i];
				n[i] = 0;
			}
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] != 0) {
				b = n[i];
			}
			
		}
		
		System.out.println("a和"+a+"比，b和"+b+"比，c和"+c+"比");

	}

	@Test
	public void test10() {
		int[] arr = new int[10];
		System.out.println("请输入10个整数");
		mt.input(arr);
		mt.sort(arr);
		mt.showArray(arr);
	}

	@Test
	public void test11() {
		int[][] arr = new int[3][3];
		System.out.println("请输入第一行的三个数");
		mt.input(arr[0]);
		System.out.println("请输入第二行的三个数");
		mt.input(arr[1]);
		System.out.println("请输入第三行的三个数");
		mt.input(arr[2]);

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j || (i + j == 2)) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println(sum);

	}

	@Test
	public void test12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一行字符串");
		String string = sc.nextLine();
		char[] c = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			c[i] = string.charAt(i);
		}
		for (int i = 0; i < c.length; i++) {
			int count = 0;
			for (int j = i; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
				}
			}
			System.out.println(c[i] + ":" + count);
		}
	}

	@Test
	public void test13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个不多于5位的整数");
		String string = sc.nextLine();
		char[] c = new char[string.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = string.charAt(i);
		}
		System.out.println(string.length());
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i] + " ");
		}

	}

	@Test
	public void test14() {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 4, 6, 8, 9 };
		System.out.println("原数组为");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("请插入一个整数");
		int num = sc.nextInt();
		int al = 0;
		int bl = 0;
		int[] newArray;
		if (num < arr[0]) {
			newArray = new int[arr.length + 1];
			newArray[0] = num;
			for (int i = 0; i < arr.length; i++) {
				newArray[i + 1] = arr[i];
			}
		} else if (num > arr[arr.length - 1]) {
			newArray = new int[arr.length + 1];
			newArray[arr.length] = num;
			for (int i = 0; i < arr.length; i++) {
				newArray[i] = arr[i];
			}
		} else {
			for (int i = 1; i < arr.length; i++) {
				if (num > arr[i - 1] && num < arr[i]) {
					al = i;
					bl = arr.length - i;
				}
			}
			int[] a = new int[al];
			int[] b = new int[bl];
			newArray = new int[al + bl + 1];
			for (int i = 0; i < al; i++) {
				a[i] = arr[i];
			}
			for (int i = 0; i < bl; i++) {
				b[i] = arr[al + i];
			}
			for (int i = 0; i < al; i++) {
				newArray[i] = a[i];
			}
			newArray[al] = num;
			for (int i = 0; i < bl; i++) {
				newArray[al + i + 1] = b[i];
			}

		}
		System.out.println("新数组");
		for (int i : newArray) {
			System.out.println(i);
		}

	}
}
