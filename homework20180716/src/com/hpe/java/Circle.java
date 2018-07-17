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
		radius = 0;
	}

	public Circle(double r) {
		super();
		this.radius = r;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public void show() {
		System.out.println("圆的半径是："+radius+"，周长为："+getPerimeter()+"，面积为："+getArea());
	}

}
