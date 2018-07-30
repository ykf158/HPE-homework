package com.hpe.view;

import java.util.List;
import java.util.Scanner;

import com.hpe.po.CommonEmployee;
import com.hpe.po.Director;
import com.hpe.po.Employee;
import com.hpe.po.Manager;
import com.hpe.service.EmpService;

public class EmployeeUi {

	Scanner sc = new Scanner(System.in);
	EmpService empService = new EmpService();

	public EmployeeUi() {

		init();

	}

	public void init() {
		empService.init("employeeManager/employeeManager.txt");
		while (true) {
			menu();
			switch (sc.nextLine()) {
			case "1":
				add();
				break;
			case "2":
				delete();
				break;
			case "3":
				update();
				break;
			case "4":
				select();
				break;
			case "0":
				empService.save("employeeManager/employeeManager.txt");
				System.out.println("谢谢使用");
				System.exit(0);
				break;
			default:
				System.out.println("输入错误，请重试");
				break;
			}

		}
	}

	private void menu() {
		System.out.println("|--------------|");
		System.out.println("|-----1 增加-----|");
		System.out.println("|-----2 删除-----|");
		System.out.println("|-----3 修改-----|");
		System.out.println("|-----4 查询-----|");
		System.out.println("|-----0 退出-----|");
		System.out.println("|--------------|");
		System.out.println("请选择业务：");
	}

	public void add() {

		System.out.println("-----------添加-----------");
		
		Employee employee = createEmployee();
		if (employee!=null) {
			// 调用Telservice中的addTel方法，传telphone，接收返回值
			int addRes = empService.add(employee);
			if (addRes > 0) {
				System.out.println("添加成功");
			} else if (addRes == 0) {
				System.out.println("添加失败");
			} else {
				System.out.println("此名称的员工已存在，无法添加");
			}

		}else {
			System.out.println("员工职位输入错误，请重新输入");
		}
	}

	private Employee createEmployee() {

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
		
		sc.nextLine();
		if (position.equals("普通员工")) {
			return new CommonEmployee(idNo, name, position, days, wage);
		} else if(position.equals("经理")) {
			return new Manager(idNo, name, position, days, wage);
		} else if(position.equals("董事长")) {
			return new Director(idNo, name, position, days, wage);
		} else {
			return null;
		}

	}

	public void delete() {
		System.out.println("-----------删除-----------");
		System.out.println("请输入姓名");
		String name = sc.nextLine();
		boolean isDel = empService.detele(name);
		if (isDel) {
			System.out.println("删除成功");
		} else {
			System.out.println("用户不存在");
		}

	}

	public void update() {
		System.out.println("-----------修改-----------");
		System.out.println("请输入姓名");
		String oldName = sc.nextLine();

		int oldTel = empService.selectIndexByName(oldName);
		if (oldTel == -1) {
			System.out.println("此人不存在");
		} else {
			System.out.println("请输入新的信息");
			Employee newEmp = createEmployee();
			boolean updateRes = empService.update(oldName, newEmp);
			if (updateRes) {
				System.out.println("更新成功");
			} else {
				System.out.println("名字重复，更新失败");
			}
		}
	}

	// 查询全部
	public void select() {
		System.out.println("-----------查询-----------");
		// 调用Telservice中selectAllTel方法，得到素有电话本
		List<Employee> tels = empService.select();
		// 遍历显示所有电话
		for (Employee employee : tels) {
			System.out.println(employee);
		}

	}


}
