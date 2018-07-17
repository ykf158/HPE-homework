package com.hpe.java3;

public class Test {

	public static void main(String[] args) {

		Employee.setCompany("惠普");
		Employee e1 = new Employee();
		Employee e2 = new Employee("Jason", 22, '男', "2", 2000.0);
		System.out.println(e1);
		System.out.println(e2);
		e1.play();
		e1.sing();
	}

}
