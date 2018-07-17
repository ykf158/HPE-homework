package com.hpe.java3;

public class Employee extends Role {

	private final String id;
	private static String company;
	private double salary;

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public Employee() {
		super();
		this.id = "1";
	}


	public Employee(String name, int age, char sex, String id, double salary) {
		super(name, age, sex);
		this.id = id;
		this.salary = salary;
	}

	@Override
	public void play() {
		System.out.println("employee is playing");
		super.say();
	}
    
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + getName() + ", age=" + getAge()
				+ ", sex=" + getSex() + "]";
	}

	
	

}
