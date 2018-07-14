package com.hpe.java1;

public class TestCylinder {

	public static void main(String[] args) {

		Circle c = new Circle(3);
		Cylinder cy = new Cylinder(2, 2);
		c.show();
		System.out.println("-----------");
		cy.show();
		cy.showVolume();
		
	}

}
