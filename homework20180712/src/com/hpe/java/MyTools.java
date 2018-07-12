package com.hpe.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MyTools {
	// 遍历数组
	public void showArray(int[] str) {
		for (int i : str) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public void showArray(double[] str) {
		for (double i : str) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public void showArray(String[] str) {
		for (String i : str) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// 最大值
	public int getArrayMax(int[] arr) {
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
	public int getArrayMax(double[] arr) {
		double max = arr[0];
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
	public int getArrayMin(int[] arr) {
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
	public int getArrayMin(double[] arr) {
		double min = arr[0];
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
	public double getArrayAve(int[] arr) {
		DecimalFormat df = new DecimalFormat("#.00");
		double ave = 0;
		ave = Double.parseDouble(df.format(getArraySum(arr) / (double) arr.length));
		return ave;
	}
	public double getArrayAve(double[] arr) {
		DecimalFormat df = new DecimalFormat("#.00");
		double ave = 0;
		ave = Double.parseDouble(df.format(getArraySum(arr) / (double) arr.length));
		return ave;
	}

	// 求和
	public int getArraySum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	public double getArraySum(double[] arr) {
		double sum = 0;
		for (double i : arr) {
			sum += i;
		}
		return sum;
	}

	// 逆序
	public void resortArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	public void resortArray(double[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			double temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	public void resortArray(String[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
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
	public double[] merge(double[] a,double[] b) {
		int count = a.length + b.length;
		double[] c = new double[count];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i+a.length] = b[i];
		}
		return c;
	}
	public String[] merge(String[] a,String[] b) {
		int count = a.length + b.length;
		String[] c = new String[count];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i+a.length] = b[i];
		}
		return c;
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
	public void move(double[] a,int m) {
		double[] b = new double[m];
		double[] c = new double[a.length-m];
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
	public void move(String[] a,int m) {
		String[] b = new String[m];
		String[] c = new String[a.length-m];
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
	
	
	//从数组中去掉某个值
	public int[] cut(int[] arr,int num) {
		int count = 0;
		for (int i : arr) {
			if (i == num) {
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
	public double[] cut(double[] arr,double num) {
		int count = 0;
		for (double i : arr) {
			if (i == num) {
				count++;
			}
		}
		double[] newArr = new double[arr.length-count];
		for (int i = 0, j=0; i < arr.length; i++) {
			if (arr[i] != num) {
				newArr[j++] = arr[i];
				
			}
		}
		return newArr;
	}
	public String[] cut(String[] arr,String str) {
		int count = 0;
		for (String i : arr) {
			if (i == str) {
				count++;
			}
		}
		String[] newArr = new String[arr.length-count];
		for (int i = 0, j=0; i < arr.length; i++) {
			if (arr[i] != str) {
				newArr[j++] = arr[i];
				
			}
		}
		return newArr;
	}
	
	
	//判断数组元素是否重复
	public void isRepeat(int[] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length-1 && flag; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("不重复");
		}else {
			System.out.println("重复");
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
			if (num == getArraySum(arr)) {
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
	
	//打印杨辉三角
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
	
	//打印圣诞树
	public void printTree(int h) {
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

	//打印菱形
	public void printDiamond(int h) {
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
	
	//打印m行n列的*矩阵
	public void printStar(int m , int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
		}
	}

	
	//打印n*n乘法表
	public void printMultiplicationTable(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+"*"+j+"="+i*j+"  ");
			}
			System.out.println();
		}
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
