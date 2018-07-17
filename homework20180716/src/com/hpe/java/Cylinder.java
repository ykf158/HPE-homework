package com.hpe.java;

public class Cylinder extends Circle{
	private double hight;

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public Cylinder(double r, double hight) {
		super(r);
		this.hight = hight;
	}
	
	public double getVolume() {
		return getArea()*hight;
	}
	
	public void showVolume() {
		System.out.println("圆柱的体积为："+getVolume());
	}
	

}
