package com.hpe.java;

public class Cylinder extends Circle{

	private double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public Cylinder() {
		super();
		length = 1;
	}

	public double findVolume() {
		return this.findArea()*length;
	}
}
