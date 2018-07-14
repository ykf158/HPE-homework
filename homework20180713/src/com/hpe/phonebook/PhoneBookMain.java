package com.hpe.phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBookMain {
	
	private static ArrayList<PhonBookMember> phoneList = new ArrayList<PhonBookMember>();
	private static Scanner sc = new Scanner(System.in);
	private static PhonBookMember pbm;	
	
	
	public static void main(String[] args) {
		
		init();
		
	}

	public static void init() {
		
		System.out.println("----------------------电话本管理系统----------------------");
		System.out.println("1.添加         2.删除      3.修改       4.查询所有       5.根据姓名查询       0.退出  ");
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
			init();
			break;
		case 5:
			System.out.println("-------------查找电话本-------------");
			System.out.print("请输入姓名：");
			selectOfName();
			init();
			break;
		case 0:
			System.exit(0);
			System.out.println("已退出");
			break;
		default:
			System.out.println("输入错误，请重试");
			break;
		}
		
		
		

	}

	public static void addPhone() {
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
		System.out.println(pbm);
		if (phoneList.add(pbm)) {
			System.out.println("添加成功");
		}else {
			System.out.println("添加失败，请重试");
		}
		init();
	}

	public static void deletePhone() {
		sc.nextLine();
		String name = sc.nextLine();
		int i = 0;
		for (; i < phoneList.size(); i++) {
			PhonBookMember phonBookMember = phoneList.get(i);
			if (phonBookMember.getName().equals(name)) {
				System.out.println(phonBookMember);
				System.out.println("确定吗？1（是）0（否）");
				if (sc.nextInt() == 1) {
					phoneList.remove(i);
					System.out.println("删除成功");
				}
			}
		}
		if (i==phoneList.size()) {
			System.out.println("查无此人");
		}
		init();
	}

	public static void updatePhone() {
		sc.nextLine();
		String name = sc.nextLine();
		int i = 0;
		for (; i < phoneList.size(); i++) {
			PhonBookMember phonBookMember = phoneList.get(i);
			if (phonBookMember.getName().equals(name)) {
				System.out.println(phonBookMember);
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
				phoneList.set(i, pbm);
				System.out.println("修改成功");
				break;
			}
		}
		if (i==phoneList.size()) {
			System.out.println("查无此人");
		}
		init();
		
	}

	public static void selectAll() {
		for (PhonBookMember phonBookMember : phoneList) {
			System.out.println(phonBookMember);
		}
	}

	public static void selectOfName() {
		sc.nextLine();
		String name = sc.nextLine();
		int i = 0;
		for (; i < phoneList.size(); i++) {
			if (phoneList.get(i).getName().equals(name)) {
				System.out.println(phoneList.get(i));
				break;
			}
		}
		
		if (i==phoneList.size()) {
			System.out.println("查无此人");
		}
	}

}
