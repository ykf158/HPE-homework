package com.hpe.java1;

public class InterfaceDemo {

	public static void main(String[] args) {

		Vehicle v1 = new Bike();
		v1.start();
		v1.stop();
		
		Vehicle v2 = new Bus();
		v2.start();
		v2.stop();
		
	}

}
