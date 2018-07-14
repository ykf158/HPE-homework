package com.hpe.java1;

public class Cylinder extends Circle{

	private double height;

	public Cylinder(double r,double h) {
		super();
		setRadius(r);
		this.height = h;
	}
	public double getVolume() {
		return this.getArea()*height;
	}
	public void showVolume() {
		System.out.println("体积为"+getVolume());
	}
	
}
