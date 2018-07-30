package com.hpe.po;

public class CommonEmployee extends Employee{

	
	public CommonEmployee(String idNo, String name, String position, int days, double wage) {
		super(idNo, name, position, days, wage);
		this.pay();
		
	}
	
	@Override
	public void pay() {
		double sumpay = getWage()+getWage()*0.1+getWage()*0.5+200-getWage()/30*getDays();
		this.setWage(sumpay);
	}


}
