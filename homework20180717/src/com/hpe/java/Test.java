package com.hpe.java;

public class Test {

	public static void main(String[] args) {

		Vehicle v1 = new Car();
		v1.run();
		v1.wheelsNum();
		
		Vehicle v2 = new Motorbike();
		v2.run();
		v2.wheelsNum();
		
		
	}

}
