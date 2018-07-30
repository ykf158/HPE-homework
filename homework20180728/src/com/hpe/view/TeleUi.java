package com.hpe.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hpe.po.Telephone;
import com.hpe.service.TeleService;

public class TeleUi {

	Scanner sc = new Scanner(System.in);
	TeleService telService = new TeleService();
	Telephone telephone = null;
	public TeleUi() {

		init();

	}

	public void init() {
		while (true) {
			menu();
			switch (sc.nextLine()) {
			case "1":
				addPhone();
				break;
			case "2":
				deletePhone();
				break;
			case "3":
				updatePhone();
				break;
			case "4":
				selectAllTel();
				break;
			case "5":
				selectOfName();
				break;
			case "0":
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
		System.out.println("----------------------电话本管理系统----------------------");
		System.out.println("1.添加\t2.删除\t3.修改\t4.查询所有\t5.根据姓名查询\t0.退出  ");
		System.out.println("----------------------电话本管理系统----------------------");
		System.out.println("请选择业务");
	}

	public void addPhone() {

		System.out.println("-----------添加电话本-----------");
		telephone = createTel();
		// 调用Telservice中的addTel方法，传telphone，接收返回值
		int addRes = telService.addTel(telephone);
		if (addRes > 0) {
			System.out.println("添加成功");
		} else if (addRes == 0) {
			System.out.println("添加失败");
		} else {
			System.out.println("此名称的电话本已存在，无法添加");
		}

	}

	private Telephone createTel() {

		System.out.print("姓名：");
		String name = sc.nextLine();

		System.out.print("性别：");
		char sex = sc.nextLine().charAt(0);

		System.out.print("年龄：");
		int age = sc.nextInt();

		System.out.print("电话：");
		sc.nextLine();
		String number = sc.nextLine();

		System.out.print("QQ：");
		String qq = sc.nextLine();

		System.out.print("地址：");
		String address = sc.nextLine();

		return new Telephone(name, sex, age, number, qq, address);

	}

	public void deletePhone() {
		System.out.println("-----------查询所有电话本-----------");
		System.out.println("请输入姓名");
		String name = sc.nextLine();
		int isDel = telService.deteleTelByName(name);
		if (isDel > 0) {
			System.out.println("删除成功");
		} else if (isDel == 0) {
			System.out.println("删除失败");
		} else {
			System.out.println("此名称的电话本不存在，无法删除");
		}

	}

	public void updatePhone() {
		System.out.println("-----------查询所有电话本-----------");
		System.out.println("请输入姓名");
		String oldName = sc.nextLine();

		Telephone oldTel = telService.selectTelByName(oldName);
		if (oldTel == null) {
			System.out.println("此人不存在");
		} else {
			System.out.println("请输入新的信息,名字无法修改，如需修改，请先删除此人");
			Telephone newTel = createTel();
			int updateRes = telService.updateTelByName(oldName, newTel);
			if (updateRes > 0) {
				System.out.println("修改成功");
			} else if (updateRes == 0) {
				System.out.println("修改失败");
			} else {
				System.out.println("此名称的电话本不存在，无法修改");
			}
		}
	}

	// 查询全部
	public void selectAllTel() {
		System.out.println("-----------查询所有电话本-----------");
		// 调用Telservice中selectAllTel方法，得到素有电话本
		List<Telephone> tels = new ArrayList<>();
		tels = telService.selectAllTel();
		if (tels != null) {
			// 遍历显示所有电话
			for (Telephone tel : tels) {
				System.out.println(tel);
			}
		}
		

	}

	// 按照姓名查询
	public void selectOfName() {
		System.out.println("-----------根据姓名查询电话本-----------");
		System.out.println("请输入姓名：");
		String name = sc.nextLine();
		Telephone tel = telService.selectTelByName(name);
		System.out.println(tel != null ? tel : "查无此人");
	}

	
}
