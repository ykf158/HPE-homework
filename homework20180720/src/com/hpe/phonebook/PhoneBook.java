package com.hpe.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

	ArrayList<PhonBookMember> phoneList = new ArrayList<PhonBookMember>();
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
		if (phoneList.add(pbm)) {
			System.out.println("添加成功");
			System.out.println(pbm);
		} else {
			System.out.println("添加失败，请重试");
		}
	}

	public void deletePhone() {
		sc.nextLine();
		String name = sc.nextLine();
		//获取要删除的元素下标
		int index = findPersonByName(phoneList, name);
		if (index != -1) {
			System.out.println(phoneList.get(index));
			System.out.println("确定要删除此人吗？1（是）0（否）");
			if (sc.nextInt() == 1) {
				phoneList.remove(index);
				System.out.println("删除成功");
				selectAll();
			}
		}else {
			System.out.println("查无此人");
		}		
	}

	public void updatePhone() {
		sc.nextLine();
		String name = sc.nextLine();
		int index = findPersonByName(phoneList, name);
		if (index != -1) {
			System.out.println(phoneList.get(index));
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
			phoneList.set(index, pbm);
			System.out.println("修改成功");
			System.out.println(pbm);
		} else {
			System.out.println("查无此人");
		}
		
	}
	
	//查询全部
	public void selectAll() {
		for (PhonBookMember phonBookMember : phoneList) {
			System.out.println(phonBookMember);
		}
	}

	//按照姓名查询
	public void selectOfName() {
		sc.nextLine();
		String name = sc.nextLine();
		int index = findPersonByName(phoneList, name);
		if (index != -1) {
			System.out.println(phoneList.get(index));
		}else {
			System.out.println("查无此人");
		}		
	}
	
	
	//返回name在集合中的索引
	public int findPersonByName(List<PhonBookMember> list, String name) {
		for (int i = 0; i < list.size(); i++) {
			PhonBookMember p = list.get(i);
			String name1 = p.getName();
			if (name.equals(name1)) {
				return i;
			}
		}
		return -1;
	}
	

}
