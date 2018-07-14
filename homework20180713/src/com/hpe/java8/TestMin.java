package com.hpe.java8;

import java.util.Scanner;

public class TestMin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请依次输入10个整数");
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i]= sc.nextInt();
		}
		Min min = new Min();
		System.out.println("最小值："+min.getMin(arr));
		
		
	}

}
