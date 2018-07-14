package com.hpe.java3;

public class Max {

	public int max(int a,int b) {
		if (a>b) {
			return a;
		} else {
			return b;
		}
	}

	public int max(int a,int b,int c) {
		
		if (max(a,b)>c) {
			return max(a,b);
		} else {
			return c;
		}
	}

	public int max(int a,int b,int c,int d) {
		if (max(a,b,c)>d) {
			return max(a,b,c);
		} else {
			return d;
		}
	}
}
