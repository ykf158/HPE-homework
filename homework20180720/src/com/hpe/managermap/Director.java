package com.hpe.managermap;

public class Director extends Employee{
	
	public Director(String idNo, String name, String position, int days, double wage) {
		super(idNo, name, position, days, wage);
		this.pay();
	}
	
	@Override
	public void pay() {
		double sumpay = getWage()+getWage()*0.08+getWage()*0.3+2000+3000-getWage()/30*getDays();
		this.setWage(sumpay);
	}

	
}
