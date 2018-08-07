package com.hpe.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hpe.po.Asset;
import com.hpe.po.AssetInfo;
import com.hpe.po.Bank;
import com.hpe.po.User;
import com.hpe.service.impl.AssetServiceImpl;
import com.hpe.service.impl.BankServiceImpl;
import com.hpe.service.impl.UserServiceImpl;

public class CustomerUI {
	private Scanner sc = new Scanner(System.in);
	private User user = new User();
	private UserServiceImpl usi = new UserServiceImpl();
	private List<Bank> banks = new ArrayList<>();
	private List<AssetInfo> assets = new ArrayList<>();
	private AssetServiceImpl asi = new AssetServiceImpl();
	private BankServiceImpl bsi = new BankServiceImpl();
	private Asset asset = new Asset();
	

	/**
	 * @title 顾客登录
	 * @author 尤锴丰
	 * @date 2018年8月4日下午2:07:57
	 */
	public boolean customerLogin() {
		System.out.println("****************用户登录****************");
		System.out.println("请输入用户名：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		user.setUserName(username);
		user.setUserPassword(password);
		user = usi.login(user);
		return user != null;

	}

	/**
	 * @title
	 * @author 尤锴丰
	 * @date 2018年8月4日下午2:24:59
	 */
	public void customerMenu() {
		System.out.println("----------------个人资产管理系统----------------");
		System.out.println("****************[欢迎您，用户-" + user.getUserName() + "]****************");
		System.out.println("1.查看资产\t2.添加新资产\t3.存取资产\t4.查看总资产\t5.修改密码\t6.返回登录主菜单");
		System.out.println("----------------个人资产管理系统----------------");
		System.out.println("请选择业务：");
	}

	/**
	 * @title 顾客注册
	 * @author 尤锴丰
	 * @date 2018年8月4日下午2:07:47
	 */
	public void customerRegister() {
		System.out.println("******************用户注册*****************");
		System.out.println("请输入用户名");
		String userName = sc.nextLine();
		System.out.println("请输入密码");
		String password = sc.nextLine();
		System.out.println("请输入真实姓名");
		String realName = sc.nextLine();
		System.out.println("请输入性别");
		String sex = sc.nextLine();
		System.out.println("请输入电话号码");
		String tel = sc.nextLine();
		System.out.println("请输入身份证号");
		String cardId = sc.nextLine();
		System.out.println("请输入联系地址");
		String address = sc.nextLine();
		user.setUserName(userName);
		user.setUserPassword(password);
		user.setSex(sex);
		user.setTel(tel);
		user.setAddress(address);
		user.setIdCard(cardId);
		user.setRealName(realName);
		int res = usi.register(user);
		if (res == -1) {
			System.out.println("该用户名已存在");
		} else {
			System.out.println("注册成功");
		}
		
	}

	/**
	 * @title 查询全部资产
	 * @author 尤锴丰
	 * @date 2018年8月4日下午2:07:30
	 */
	public void selectAllAsset() {
		assets = asi.selectAssetsByUserId(user.getUserId());
		for (AssetInfo assetInfo : assets) {
			System.out.println(assetInfo);
		}
	}

	/**
	 * @title 添加新资产
	 * @author 尤锴丰
	 * @date 2018年8月4日下午2:07:08
	 */
	public void addAsset() {
		System.out.println("---------------添加新资产----------------");
		System.out.println("目前存在的银行信息：");
		banks = bsi.selectAllBank();
		for (Bank bank : banks) {
			System.out.println(bank);
		}
		System.out.println("请输入银行id");
		int bankId = Integer.parseInt(sc.nextLine());
		System.out.println("请输入卡号");
		String CardNum = sc.nextLine();
		System.out.println("请输入金额");
		double money = Double.parseDouble(sc.nextLine());
		asset.setBankId(bankId);
		asset.setCardNum(CardNum);
		asset.setCardMoney(money);
		asset.setUserId(user.getUserId());
		int res = asi.addAsset(asset);
		if (res == -1) {
			System.out.println("该银行不存在");
		} else if (res == -2) {
			System.out.println("该银行已存在该卡号");
		} else {
			System.out.println("添加成功");
		}

	}

	/**
	 * @title 存入资产
	 * @author 尤锴丰
	 * @date 2018年8月4日下午2:10:12
	 */
	public void depositAsset() {
		System.out.println("---------------存入---------------");
		System.out.println("您目前的资产如下：");
		selectAllAsset();
		System.out.println("请输入银行id");
		int bankId = Integer.parseInt(sc.nextLine());
		System.out.println("请输入银行卡号");
		String cardNum = sc.nextLine();
		System.out.println("请输入存入金额");
		double depositMoney = Double.parseDouble(sc.nextLine());
		asset.setBankId(bankId);
		asset.setCardNum(cardNum);
		int res = asi.depositAsset(asset, depositMoney);
		if (res == -1) {
			System.out.println("您并无此资产");
		} else {
			System.out.println("恭喜您，存入资产成功");
		}

	}

	/**
	 * @title 提取资产
	 * @author 尤锴丰
	 * @date 2018年8月4日下午2:08:53
	 */
	public void extractAsset() {
		System.out.println("---------------提取---------------");
		System.out.println("您目前的资产如下：");
		selectAllAsset();
		System.out.println("请输入银行id");
		int bankId = Integer.parseInt(sc.nextLine());
		System.out.println("请输入银行卡号");
		String cardNum = sc.nextLine();
		System.out.println("请输入提取金额");
		double extractMoney = Double.parseDouble(sc.nextLine());
		asset.setBankId(bankId);
		asset.setCardNum(cardNum);
		int res = asi.extractAsset(asset, extractMoney);
		if (res == -1) {
			System.out.println("您并无此资产");
		} else if (res == -2) {
			System.out.println("资产不足");
		} else {
			System.out.println("恭喜您，提取资产成功");
		}

	}

	/**
	 * @title 查询总资产
	 * @author 尤锴丰
	 * @date 2018年8月4日下午2:11:47
	 */
	public void selectSumAsset() {
		double sumAsset = 0;
		assets = asi.selectAssetsByUserId(user.getUserId());
		for (AssetInfo assetInfo : assets) {
			sumAsset += assetInfo.getCardMoney();
		}

		System.out.println("总资产为：" + sumAsset + "英镑");

	}

	/**
	 * @title 修改密码
	 * @author 尤锴丰
	 * @date 2018年8月4日下午2:12:33
	 */
	public void changePassword() {
		System.out.println("请输入原密码");
		if (sc.nextLine().equals(user.getUserPassword())) {
			System.out.println("请输入新密码");
			user.setUserPassword(sc.nextLine());
			if (usi.changePwd(user)) {
				System.out.println("密码修改成功");
			} else {
				System.out.println("密码修改失败");
			}
		} else {
			System.out.println("密码输入有误");
		}
		
		
	}

}
