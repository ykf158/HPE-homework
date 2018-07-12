package com.hpe.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MyTools {
	// 遍历数组
	public void show(int[] str) {
		for (int i : str) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// 最大值
	public int getMax(int[] arr) {
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	// 最小值
	public int getMin(int[] arr) {
		int min = arr[0];
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	// 平均值
	public double getAve(int[] arr) {
		DecimalFormat df = new DecimalFormat("#.00");
		double ave = 0;
		ave = Double.parseDouble(df.format(getSum(arr) / (double) arr.length));
		return ave;
	}

	// 求和
	public int getSum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	// 逆序
	public void resort(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

	// 分解质因数,输入1判断是否是完数
	public int primeNumber(int num, int sec) {
		int i = 2;
		int j = 2;
		int count = 0;
		int index = 0;
		int a = num;
		int b = num;
		// 计算质数因子数
		while (b > 1) {
			if (b % i == 0) {
				b /= i;
				count++;
			} else {
				i++;
			}
		}
		// 分解质因数
		int[] arr = new int[count];
		while (a > 1) {
			if (a % j == 0) {
				a /= j;
				arr[index] = j;
				index++;
			} else {
				j++;
			}

		}
		if (sec == 1) {
			// 判断是否属于完数
			if (num == getSum(arr)) {
				return 1;
			}
		} else {
			System.out.print(num + "=");
			for (int k = 0; k < arr.length; k++) {
				if (k == arr.length - 1) {
					System.out.print(arr[k]);
				} else {
					System.out.print(arr[k] + "*");
				}
			}
		}
		return 0;
	}

	// 多个特殊数相加
	public void numPlus(int a, int b, boolean flag) {
		int sum = 0;
		int c = a;
		int[] arr = new int[b];
		arr[0] = a;
		for (int i = 1; i < b; i++) {
			c = (int) (c + a * Math.pow(10, i));
			arr[i] = c;

		}
		if (flag) {
			for (int i = 0; i < arr.length; i++) {
				if (i < arr.length - 1) {
					System.out.print(arr[i] + "+");
				} else {
					System.out.print(arr[i] + "=");
				}
			}
		}

		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
	}

	// 打印重复字符
	public void printStr(String str, int a) {
		for (int i = 1; i <= a; i++) {
			System.out.print(str);
		}
	}

	// 求排列数
	public int permu(int up,int bellow)
	{
		int result=1;
		for(int i=up;i>0;i--)
		{
			result*=bellow;
			bellow--;
		}
		return result;
	}
/*
	// 排列组合
	public void permutations(int[] arr , int num) {
		int count = permu(arr.length, num);
		int[] a = new int[count];
		
	}*/
	
	
	
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
	
	//杨辉三角
	public void printYang(int a) {
		int[][] t = new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < a; j++) {
				if(j == 0 || i == j) {
					t[i][j] = 1;
					System.out.print(1+" ");
				}else if(i>1&&j<i){
					t[i][j] = t[i-1][j]+t[i-1][j-1];
					System.out.print(t[i][j]+" ");
				}
				
			}
			System.out.println();
		}
	}
	
	
	//数组元素位置移动
	public void move(int[] a,int m) {
		int[] b = new int[m];
		int[] c = new int[a.length-m];
		for (int i = a.length-m, j = 0; i < a.length; i++,j++) {
			b[j] = a[i]; 
		}
		for (int i = 0; i < a.length-m; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			a[i]=b[i];
		}
		for (int i = 0; i < c.length; i++) {
			a[i+m]=c[i];
		}
	}
	
	
	
}
