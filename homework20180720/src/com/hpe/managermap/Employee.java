package com.hpe.managermap;

public class Employee {

	private String idNo;
	private String name;
	private String position;
	private int days;
	private double wage;
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public Employee(String idNo, String name, String position, int days, double wage) {
		this.idNo = idNo;
		this.name = name;
		this.position = position;
		this.days = days;
		this.wage = wage;
	}
	
	
	public Employee() {
		super();
	}
	
	public void pay() {
		
	}
	
	
	@Override
	public String toString() {
		return "编号：" + idNo + ", 姓名：" + name + ", 职务：" + position + ", 请假天数：" + days + ", 工资："
				+ wage;
	}
	
}
