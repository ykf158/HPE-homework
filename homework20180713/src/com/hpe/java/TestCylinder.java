package com.hpe.java;

public class TestCylinder {

	public static void main(String[] args) {

		Cylinder cy = new Cylinder();
		cy.setRadius(3);
		cy.setLength(3);
		System.out.println(cy.findVolume());
	}

}
