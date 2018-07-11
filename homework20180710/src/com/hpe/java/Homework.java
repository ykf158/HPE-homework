package com.hpe.java;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.junit.Test;

public class Homework {
	

	// 第一题
	public void test1() {
		int[] a = { 4, 2, 0, -1, -8, 23, 9 };
		int[] b = new int[6];
		int max = getMax(a);
		System.out.println("最大值是:"+max);
		int min = getMin(a);
		System.out.println("最小值是:"+min);
		double ave = getAve(a);
		System.out.println("平均值是:"+ave);
		int sum = getSum(a);
		System.out.println("总和是:"+sum);
		copy(a, b);
		resort(a);
		show(a);
	}
	public void show(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public double getAve(int[] arr) {
		DecimalFormat df = new DecimalFormat("#.00");
		double ave = 0;
		ave = Double.parseDouble(df.format(getSum(arr) / (double)arr.length));
		return ave;
	}

	public int getSum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	public void copy(int[] a, int[] b) {
			System.out.println("复制前数组");
			show(b);
			for (int i = 0; i < b.length; i++) {
				b[i] = a[i];
			}
			System.out.println("复制后数组");
			show(b);		
		if(a.length > b.length){
			System.out.println("数组长度不一致，超出的部分未复制");
		}			
		
	}

	public void resort(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

	
	
	//第二题
	public void test2() {
		
		System.out.println("请输入五个人的年龄");
		int[] age = new int[5];
		input(age);
		sort(age);
		show(age);
	}
	//键盘循环输入
	public void input(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	//冒泡排序
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
	}
	

	//第三题
	public void test3() {
		System.out.println("请输入十个整数");
		int[] num = new int[10];
		input(num);
		int sum = getSum(num);
		System.out.println("整数之和为："+sum);
		double ave = getAve(num);
		System.out.println("平均值是:"+ave);
		int max = getMax(num);
		System.out.println("最大值是:"+max);
		int min = getMin(num);
		System.out.println("最小值是:"+min);
	}
	
	
	
	//第四题
	public void test4() {
		int[] arr = {4,0,5,8,2,0,6,8,3};
		int[] newArr;
		System.out.println("原数组为：");
		show(arr);
		System.out.println("去掉0之后的数组为：");
		newArr = cut(arr, 0);
		show(newArr);
	}
	//从数组中去掉某个值
	public int[] cut(int[] arr,int num) {
		int count = 0;
		for (int i : arr) {
			if (i == 0) {
				count++;
			}
		}
		int[] newArr = new int[arr.length-count];
		for (int i = 0, j=0; i < arr.length; i++) {
			if (arr[i] != num) {
				newArr[j++] = arr[i];
				
			}
		}
		return newArr;
	}
	
	
	
	//第五题
	public void test5() {
		int[] a = {1,7,9,11,13,15,17,19};
		int[] b = {2,4,6,8,10};
		int[] c = merge(a, b);
		sort(c);
		show(c);
	}
	//合并数组
	public int[] merge(int[] a,int[] b) {
		int count = a.length + b.length;
		int[] c = new int[count];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i+a.length] = b[i];
		}
		return c;
	}

	
	//第六题
	public void test6() {
		int count = 20;
		int[] fi = fibonacci(count);
		show(fi);
	}
	
	//斐波那契数列
	public int[] fibonacci(int count) {
		int[] fi = new int[count];
		fi[0] = 1;
		fi[1] = 1;
		for (int i = 2; i < fi.length; i++) {
			fi[i] = fi[i-2] + fi[i-1];
		}
		return fi;
	}

	
	//第七题
	public void test7() {
		int[] grade = new int[10]; 
		System.out.println("请输入10个成绩");
		input(grade);
		int sum = 0;
		for (int i = 0; i < grade.length; i++) {
			if (grade[i]!=getMax(grade)&&grade[i]!=getMin(grade)) {
				sum+=grade[i];
			}
		}
		DecimalFormat df = new DecimalFormat("#.00");
		double ave = Double.parseDouble(df.format(sum / (double)(grade.length-2)));
		System.out.println("最终得分："+ave);
	}
	
	
	//第八题
	public void test8() {
		int[] a = {1,2,3,4,0};
		int i = 0;
		int j = 0;
		boolean flag = true;
		for (; i < a.length-1 && flag; i++) {
			for (j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					flag = false;
					break;
				}
			}
		}
		if(i == a.length-1 && j == a.length) {
			System.out.println("不重复");
		}else {
			System.out.println("重复");
		}
	}

	@Test
	//第九题
	public void test9() {
		
		binaryToDecimal(35);
	}
	//十进制转二进制
	public void binaryToDecimal(int n) {
		String str = "";
		while (n!=0) {
			str = n%2+str;
			n/=2;
		}
		System.out.println(str);
	}


}
