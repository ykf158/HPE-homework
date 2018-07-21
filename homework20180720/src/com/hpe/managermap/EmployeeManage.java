package com.hpe.managermap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManage {

	Map<String, Employee> employeeMap = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	CommonEmployee g;
	Manager m;
	Director c;

	public EmployeeManage() {
		init();
	}

	public void init() {
		while (true) {
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
				break;
			case 2:
				delete();
				break;
			case 3:
				update();
				break;
			case 4:
				select();
				break;
			case 0:
				System.out.println("谢谢使用，已退出");
				System.exit(0);
				break;
			default:
				System.out.println("输入错误，请重试！");
				break;
			}
		}
	}

	public void add() {

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
			employeeMap.put(name, g);
			System.out.println("添加成功");
			showList();
		} else if (position.equals("经理")) {
			m = new Manager(idNo, name, position, days, wage);
			employeeMap.put(name, m);
			System.out.println("添加成功");
			showList();
		} else if (position.equals("董事长")) {
			c = new Director(idNo, name, position, days, wage);
			employeeMap.put(name, c);
			System.out.println("添加成功");
			showList();
		} else {
			System.out.println("职务输入错误，请重试");
		}

	}

	public void delete() {
		sc.nextLine();
		System.out.println("请输入员工姓名");
		String name = sc.nextLine();
		if (employeeMap.containsKey(name)) {
			System.out.println(employeeMap.get(name));
			System.out.println("确定要删除此人吗？1（是）0（否）");
			if (sc.nextInt() == 1) {
				employeeMap.remove(name);
				System.out.println("删除成功");
				showList();
			}

		} else {
			System.out.println("查无此人");

		}

	}

	public void update() {
		sc.nextLine();
		System.out.println("请输入员工姓名");
		String name = sc.nextLine();
		if (employeeMap.containsKey(name)) {
			System.out.println(employeeMap.get(name));
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
				employeeMap.remove(name);
				employeeMap.put(newName, g);
				System.out.println("修改成功");
			} else if (position.equals("经理")) {
				m = new Manager(idNo, newName, position, days, wage);
				employeeMap.remove(name);
				employeeMap.put(newName, m);
				System.out.println("修改成功");
			} else if (position.equals("董事长")) {
				c = new Director(idNo, newName, position, days, wage);
				employeeMap.remove(name);
				employeeMap.put(newName, c);
				System.out.println("修改成功");
			} else {
				System.out.println("职务输入错误，请重试");
			}
			
		} else {
			System.out.println("查无此人");

		}
		
		
		

	}

	public void select() {
		sc.nextLine();
		System.out.println("请输入员工姓名");
		String name = sc.nextLine();
		if (employeeMap.containsKey(name)) {
			System.out.println(employeeMap.get(name));
		} else {
			System.out.println("查无此人");

		}
	}

	// 遍历集合元素
	public void showList() {
		Set<String> keySet = employeeMap.keySet();
		for (String key : keySet) {
			System.out.println(employeeMap.get(key));
		}
	}

}
