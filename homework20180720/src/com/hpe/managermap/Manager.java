package com.hpe.managermap;

public class Manager extends Employee{

	
	public Manager(String idNo, String name, String position, int days,double wage) {
		super(idNo, name, position, days, wage);
		this.pay();
	}

	
	@Override
	public void pay() {
		double sumpay = getWage()+getWage()*0.2+getWage()*0.5+500-getWage()/30*getDays();
		this.setWage(sumpay); 
	}
}
