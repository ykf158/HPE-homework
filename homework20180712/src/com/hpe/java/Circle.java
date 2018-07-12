package com.hpe.java;

public class Circle {
	private double radius;
	double pi = Math.PI;
	public Circle() {
		super();
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
	
	public double getArea(double r) {
		return pi*r*r;
	}
	public double getPerimeter(double r) {
		return 2*pi*r;
	}
	public void show(double r,double area,double perimeter) {
		System.out.println("圆的半径为："+r+"，周长为："+area+"，面积为："+perimeter);
	}

}
