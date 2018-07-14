package com.hpe.java1;

public class Circle {

	private double radius;

	public Circle() {
		super();
		radius = 0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return Math.PI * radius * 2;
	}
	
	public void show() {
		System.out.println("半径："+radius+"，周长："+getArea()+"，面积："+getPerimeter());
	}

}
