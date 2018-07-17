package com.hpe.java2;

import java.util.Scanner;

public class EmployeeManage {

	private static Scanner sc = new Scanner(System.in);
	private static Employee[] e = new Employee[100];
	private static CommonEmployee g;
	private static Manager m;
	private static Director c;
	
	
	public static void main(String[] args) {

		init();

	}

	public static void init() {
		System.out.println("|--------------|");
		System.out.println("|-----1 增加-----|");
		System.out.println("|-----2 删除-----|");
		System.out.println("|-----3 修改-----|");
		System.out.println("|-----4 查询-----|");
		System.out.println("|-----0 退出-----|");
		System.out.println("|--------------|");
		System.out.println("请选择业务：");
		int sec = sc.nextInt();
		switch (sec) {
		case 1:
			add();
			init();
			break;
		case 2:
			delete();
			init();
			break;
		case 3:
			update();
			init();
			break;
		case 4:
			select();
			init();
			break;
		case 0:
			System.exit(0);
			break;

		default:
			System.out.println("输入错误，请重试！");
			init();
			break;
		}
	}
	
	public static void add() {
		
		sc.nextLine();
		System.out.println("请输入员工编号：");
		String idNo = sc.nextLine();
		System.out.println("请输入员工姓名：");
		String name = sc.nextLine();
		System.out.println("请输入员工职务：(普通员工  经理  董事长)");
		String position = sc.nextLine();
		System.out.println("请输入员工请假天数：");
		int days = sc.nextInt();
		System.out.println("请输入员工基本工资：");
		double wage = sc.nextDouble();
		
		if (position.equals("普通员工")) {
			g = new CommonEmployee(idNo, name, position, days, wage);
			for (int i = 0; i < e.length; i++) {
				if (e[i]==null) {
					e[i]=g;
					System.out.println("添加成功");
					break;
				}
			}
		} else if(position.equals("经理")) {
			m = new Manager(idNo, name, position, days, wage);
			for (int i = 0; i < e.length; i++) {
				if (e[i]==null) {
					e[i]=m;
					System.out.println("添加成功");
					break;
				}
			}
		} else if(position.equals("董事长")) {
			
			c = new Director(idNo, name, position, days, wage);
			for (int i = 0; i < e.length; i++) {
				if (e[i]==null) {
					e[i]=c;
					System.out.println("添加成功");
					break;
				}
			}
		} else {
			System.out.println("职务输入错误，请重试");
		}
		
		
	}
	
	
	
	public static void delete() {
		sc.nextLine();
		System.out.println("请输入员工姓名");
		String name = sc.nextLine();
		for (int i = 0; i < e.length; i++) {
			if (e[i]!=null) {
				if (e[i].getName().equals(name)) {
					System.out.println(e[i].toString());
					e[i] = null;
					System.out.println("删除成功");
					break;
				}
			}
		}
	}
	public static void update() {
		sc.nextLine();
		System.out.println("请输入员工姓名");
		String name = sc.nextLine();
		for (int i = 0; i < e.length; i++) {
			if (e[i]!=null) {
				if (e[i].getName().equals(name)) {
					System.out.println(e[i].toString());
					System.out.println("请重新输入员工信息");
					System.out.println("请输入员工编号：");
					String idNo = sc.nextLine();
					System.out.println("请输入员工姓名：");
					String newName = sc.nextLine();
					System.out.println("请输入员工职务：(普通员工  经理  董事长)");
					String position = sc.nextLine();
					System.out.println("请输入员工请假天数：");
					int days = sc.nextInt();
					System.out.println("请输入员工基本工资：");
					double wage = sc.nextDouble();
					
					if (position.equals("普通员工")) {
						g = new CommonEmployee(idNo, newName, position, days, wage);
						e[i] = g;
						System.out.println("修改成功");
						System.out.println(e[i].toString());
						break;
						
					} else if(position.equals("经理")) {
						m = new Manager(idNo, newName, position, days, wage);
						e[i] = m;
						System.out.println("修改成功");
						System.out.println(e[i].toString());
						break;
					} else if(position.equals("董事长")) {
						
						c = new Director(idNo, newName, position, days, wage);
						e[i] = c;
						System.out.println("修改成功");
						System.out.println(e[i].toString());
						break;
					} else {
						System.out.println("职务输入错误，请重试");
					}
					
				}
			}
		}
		
	}
	public static void select() {
		sc.nextLine();
		System.out.println("请输入员工姓名");
		String name = sc.nextLine();
		int i = 0;
		for (; i < e.length; i++) {
			if (e[i]!=null) {
				if (e[i].getName().equals(name)) {
					System.out.println(e[i].toString());
					break;
				}
			}
		}
		if (i==e.length) {
			System.out.println("查无此人");
		}
	}

}
