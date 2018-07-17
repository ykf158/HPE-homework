package com.hpe.java1;

public class Bus implements Vehicle {

	@Override
	public void start() {
		System.out.println("Bus is start!");
	}

	@Override
	public void stop() {
		System.out.println("Bus is stop!");
	}

}
