package com.hpe.view;

import java.util.Scanner;

public class AssetManage {

	private Scanner sc = new Scanner(System.in);
	private AdminUI au = null;
	private CustomerUI cu = null;

	public void initGui() {
		while (true) {
			menu();
			switch (sc.nextLine()) {
			case "1":
				admin();
				break;
			case "2":
				customer();
				break;
			case "0":
				System.out.println("谢谢使用");
				System.exit(0);
				break;
			default:
				System.out.println("输入有误，请重试");
				initGui();
				break;
			}
		}
	}

	/**
	 * @title 管理员模块
	 * @author 尤锴丰
	 * @date 2018年8月4日上午9:14:47
	 */
	private void admin() {
		au = new AdminUI();
		if (au.adminLogin()) {
			boolean flag = true;
			while (flag) {
				au.adminMenu();
				switch (sc.nextLine()) {
				case "1":
					au.selectAllUser();
					break;
				case "2":
					au.addBank();
					break;
				case "3":
					au.updateBank();
					break;
				case "4":
					au.deleteBank();
					break;
				case "5":
					au.selectAllBank();
					break;
				case "6":
					flag = false;
					initGui();
					break;
				default:
					System.out.println("输入有误，请重试");
					break;
				}

			}
		} else {
			System.out.println("登录失败，是否重试？\t1(是)，2(否)");
			if (sc.nextLine().equals("1")) {
				admin();
			} else {
				initGui();
			}
		}

	}

	/**
	 * @title 顾客模块
	 * @author 尤锴丰
	 * @date 2018年8月4日上午9:14:14
	 */
	private void customer() {
		cu = new CustomerUI();
		System.out.println("----------------个人资产管理系统----------------");
		System.out.println("*******************用户界面******************");
		System.out.println("********************1.登录******************");
		System.out.println("********************2.注册******************");
		System.out.println("请选择");
		String sec = sc.nextLine();
		if (sec.equals("1")) {
			boolean res = cu.customerLogin();
			if (res) {
				boolean flag = true;
				while (flag) {
					cu.customerMenu();
					switch (sc.nextLine()) {
					case "1":
						System.out.println("----------------查看所有资产----------------");
						cu.selectAllAsset();
						break;
					case "2":
						cu.addAsset();
						break;
					case "3":
						System.out.println("1.存入资产，2.提取资产");
						if (sc.nextLine().equals("1")) {
							cu.depositAsset();
						} else {
							cu.extractAsset();
						}
						break;
					case "4":
						cu.selectSumAsset();
						break;
					case "5":
						cu.changePassword();
						break;
					case "6":
						flag = false;
						initGui();
						break;

					default:
						System.out.println("输入错误，请重试");
						break;
					}
				}
			} else {
				System.out.println("不存在该用户，请重新输入");
				customer();
			}
			

		} else if (sec.equals("2")) {
			cu.customerRegister();
		} else {
			System.out.println("输入错误，请重试");
			customer();
		}

	}

	/**
	 * @title 登录选择菜单
	 * @author 尤锴丰
	 * @date 2018年8月4日上午9:09:36
	 */
	public void menu() {
		System.out.println("----------------个人资产管理系统----------------");
		System.out.println("*******************1.管理员******************");
		System.out.println("********************2.顾客******************");
		System.out.println("********************0.退出******************");
		System.out.println("--------------------------------------------");
		System.out.println("请选择登录方式：");
	}

}
