package com.hpe.java;

public class Circle {
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {
		super();
		radius=1;
	}
	
	public double findArea() {
		return Math.PI*radius*radius;
	}
	
}
