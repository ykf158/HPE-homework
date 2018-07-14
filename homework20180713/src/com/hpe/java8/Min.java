package com.hpe.java8;

public class Min {

	public int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
}
