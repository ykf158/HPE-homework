package com.hpe.phonebookmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook {

	Map<String, PhonBookMember> phoneMap = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	PhonBookMember pbm;

	public PhoneBook() {

		init();

	}

	public void init() {
		while (true) {
			System.out.println("----------------------电话本管理系统----------------------");
			System.out.println("1.添加\t2.删除\t3.修改\t4.查询所有\t5.根据姓名查询\t0.退出  ");
			System.out.println("----------------------电话本管理系统----------------------");
			System.out.println("请选择业务");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("-------------添加电话本-------------");
				addPhone();
				break;
			case 2:
				System.out.println("-------------删除电话本-------------");
				System.out.print("请输入删除的姓名：");
				deletePhone();
				break;
			case 3:
				System.out.println("-------------修改电话本-------------");
				System.out.print("请输入姓名：");
				updatePhone();
				break;
			case 4:
				System.out.println("-------------打印所有电话本-------------");
				selectAll();
				break;
			case 5:
				System.out.println("-------------查找电话本-------------");
				System.out.print("请输入姓名：");
				selectOfName();
				break;
			case 0:
				System.out.println("谢谢使用，已退出");
				System.exit(0);
				break;
			default:
				System.out.println("输入错误，请重试");
				break;
			}

		}
	}

	public void addPhone() {
		sc.nextLine();
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
		pbm = new PhonBookMember(name, sex, age, number, qq, address);
		phoneMap.put(name, pbm);
		System.out.println("添加成功");
		System.out.println(pbm);
		
	}

	public void deletePhone() {
		sc.nextLine();
		String name = sc.nextLine();
		if (phoneMap.containsKey(name)) {
			System.out.println(phoneMap.get(name));
			System.out.println("确定要删除此人吗？1（是）0（否）");
			if (sc.nextInt() == 1) {
				phoneMap.remove(name);
				System.out.println("删除成功");
				selectAll();
			}
			
		} else {
			System.out.println("查无此人");

		}
			
	}

	public void updatePhone() {
		sc.nextLine();
		String name = sc.nextLine();
		if (phoneMap.containsKey(name)) {
			System.out.println(phoneMap.get(name));
			System.out.println("请输入新的信息");
			System.out.print("姓名：");
			String newName = sc.nextLine();
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
			pbm = new PhonBookMember(newName, sex, age, number, qq, address);
			phoneMap.remove(name);
			phoneMap.put(newName, pbm);
			System.out.println("修改成功");
		} else {
			System.out.println("查无此人");
		}
	}
	
	//查询全部
	public void selectAll() {
		//通过KeySet方法获取全部key的set集合
		Set<String> keySet = phoneMap.keySet();
		for (String key : keySet) {
			System.out.println(key+" :  "+phoneMap.get(key));
		}
	}

	//按照姓名查询
	public void selectOfName() {
		sc.nextLine();
		String name = sc.nextLine();
		if (phoneMap.containsKey(name)) {
			System.out.println(phoneMap.get(name));
		}else {
			System.out.println("查无此人");
		}
			
	}
	
	
	
	

}
