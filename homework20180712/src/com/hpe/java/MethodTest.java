package com.hpe.java;

import org.junit.Test;

public class MethodTest {
	
	//求两个数据之和的方法
	public int getSum(int a,int b) {
		return a+b;
	}
	public double getSum(double a,double b) {
		return a+b;
	}
	
	
	//判断两个数据是否相等
	public boolean equal(int a,int b) {
		if (a==b) {
			return true;
		}else {
			return false;
		}
	}
	public boolean equal(double a,double b) {
		if (a==b) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	//获取两个数的较大值
	public int getLarger(int a, int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	public double getLarger(double a, double b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	
	
	
	@Test
	public void test1() {
		calculate(2);
		calculate(2, 3);
		calculate("test");
	}
	
	public void calculate(int a) {
		System.out.println(a*a);
	}
	public void calculate(int a,int b) {
		System.out.println(a*b);
	}
	public void calculate(String str) {
		System.out.println(str);
	}
	
	
	@Test
	public void test2() {
		System.out.println(max(2, 3));
		System.out.println(max(2.2, 3.2));
		System.out.println(max(2.2, 3.2,1.2));
	}
	
	public int max(int a, int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	public double max(double a, double b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public double max(double a, double b,double c) {
		if (a>b) {
			if (a>c) {
				return a;
			} else {
				return c;
			}
		}else {
			if (b>c) {
				return b;
			} else {
				return c;
			}
		}
	}
	
}
