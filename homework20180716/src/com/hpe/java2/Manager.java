package com.hpe.java2;

public class Manager extends Employee{

	
	public Manager(String idNo, String name, String position, int days,double wage) {
		this.setIdNo(idNo);
		this.setName(name);
		this.setPosition(position);
		this.setDays(days);
		this.setWage(wage+wage*0.2+wage*0.5+500-wage/30*days) ;
	}

	
}
