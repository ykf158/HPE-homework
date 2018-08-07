package com.hpe.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hpe.po.Admin;
import com.hpe.po.Bank;
import com.hpe.po.User;
import com.hpe.service.impl.AdminServiceImpl;
import com.hpe.service.impl.BankServiceImpl;
import com.hpe.service.impl.UserServiceImpl;

public class AdminUI {

	private Scanner sc = new Scanner(System.in);
	private AdminServiceImpl asi = new AdminServiceImpl();
	private Admin admin = new Admin();
	private UserServiceImpl usi = new UserServiceImpl();
	private List<User> users = new ArrayList<>();
	private List<Bank> banks = new ArrayList<>();
	private Bank bank = new Bank();
	private BankServiceImpl bsi = new BankServiceImpl();

	/**
	 * @title 管理员登录
	 * @author 尤锴丰
	 * @date 2018年8月4日上午9:25:14
	 * @return
	 */
	public boolean adminLogin() {
		System.out.println("----------------个人资产管理系统----------------");
		System.out.println("******************管理员登录******************");
		System.out.print("用户名：");
		String userName = sc.nextLine();
		System.out.print("密码：");
		String password = sc.nextLine();
		admin.setAdminName(userName);
		admin.setAdminPassword(password);
		admin = asi.login(admin);
		return admin != null;

	}

	/**
	 * @title 管理员选择菜单
	 * @author 尤锴丰
	 * @date 2018年8月4日上午9:40:33
	 */
	public void adminMenu() {
		System.out.println("****************[欢迎您，管理员-"+admin.getAdminName()+"]****************");
		System.out.println("1.查看所有用户\t2.添加银行\t3.修改银行\t4.删除银行\t5.查看所有银行\t6.返回登录主菜单");
		System.out.println("----------------个人资产管理系统----------------");
		System.out.println("请选择业务：");
	}

	/**
	 * @title 查看所有用户
	 * @author 尤锴丰
	 * @date 2018年8月4日上午9:47:45
	 */
	public void selectAllUser() {
		System.out.println("--------------查看所有用户--------------");
		users = usi.selectAllUser();
		for (User user : users) {
			System.out.println(user);
		}
	}

	/**
	 * @title 添加银行
	 * @author 尤锴丰
	 * @date 2018年8月4日上午10:14:53
	 */
	public void addBank() {
		System.out.println("--------------添加银行--------------");
		System.out.println("请输入银行名：");
		String bankName = sc.nextLine();
		System.out.println("请输入银行电话：");
		String bankTel = sc.nextLine();
		bank.setBankName(bankName);
		bank.setBankTel(bankTel);
		int res = bsi.addBank(bank);
		if (res == 1) {
			System.out.println("添加成功");
		} else if (res == 0) {
			System.out.println("添加失败");
		} else {
			System.out.println("该银行已存在，请确认后再进行添加");
		}

	}

	/**
	 * @title 修改银行
	 * @author 尤锴丰
	 * @date 2018年8月4日上午10:15:10
	 */
	public void updateBank() {
		System.out.println("--------------修改银行--------------");
		System.out.println("请输入要修改的银行编号");
		int bankId = Integer.parseInt(sc.nextLine());
		if (bsi.selectBankByBankId(bankId) != null) {
			System.out.println("请输入新的银行名：");
			String bankName = sc.nextLine();
			System.out.println("请输入新的银行电话：");
			String bankTel = sc.nextLine();
			bank.setBankName(bankName);
			bank.setBankTel(bankTel);
			bank.setBankId(bankId);
			if (bsi.updateBank(bank)) {
				System.out.println("修改银行信息成功");
			} else {
				System.out.println("修改银行信息失败");
			}

		} else {
			System.out.println("银行不存在");
		}
	}

	/**
	 * @title 删除银行
	 * @author 尤锴丰
	 * @date 2018年8月4日上午10:15:23
	 */
	public void deleteBank() {
		System.out.println("--------------删除银行--------------");
		System.out.println("请输入要删除的银行编号");
		int bankId = Integer.parseInt(sc.nextLine());
		if (bsi.selectBankByBankId(bankId) != null) {
			System.out.println(bsi.selectBankByBankId(bankId));
			System.out.println("确定删除吗？y/n");
			String sec = sc.nextLine();
			if (sec.equals("y")) {
				if (bsi.deleteBank(bankId)) {
					System.out.println("删除银行信息成功");
				} else {
					System.out.println("删除银行信息失败");
				}
			} else {
				System.out.println("已取消删除");
			}

		} else {
			System.out.println("银行不存在");
		}

	}

	/**
	 * @title 查询所有银行
	 * @author 尤锴丰
	 * @date 2018年8月4日上午10:15:35
	 */
	public void selectAllBank() {
		System.out.println("--------------查看所有银行--------------");
		banks = bsi.selectAllBank();
		for (Bank bank : banks) {
			System.out.println(bank);
		}
	}

}
