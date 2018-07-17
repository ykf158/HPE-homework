package com.hpe.java2;

public class Director extends Employee{

	
	public Director(String idNo, String name, String position, int days, double wage) {
		this.setIdNo(idNo);
		this.setName(name);
		this.setPosition(position);
		this.setDays(days);
		this.setWage(wage+wage*0.08+wage*0.3+2000+3000-wage/30*days) ;
	}

	
}
