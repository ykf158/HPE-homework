package com.hpe.java2;

public class CommonEmployee extends Employee{

	
	public CommonEmployee(String idNo, String name, String position, int days, double wage) {
		this.setIdNo(idNo);
		this.setName(name);
		this.setPosition(position);
		this.setDays(days);
		this.setWage(wage+wage*0.1+wage*0.5+200-wage/30*days) ;
		
	}


}
