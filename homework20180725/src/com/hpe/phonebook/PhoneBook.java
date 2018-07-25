package com.hpe.phonebook;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

	Scanner sc = new Scanner(System.in);

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

		String note = "姓名：" + name + "，性别： " + sex + "，年龄： " + age + "，电话： " + number + "，QQ： " + qq + "，地址： " + address
				+ "\n";
		System.out.println(note);

		// 找到文件
		File file = new File("phoneBook/phoneBook.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 创建通道
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);

			// 写入数据
			fw.write(note);
			System.out.println("添加成功");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		selectAll();
		

		
	}

	public void deletePhone() {
		sc.nextLine();
		String name = sc.nextLine();
		BufferedReader br = null;
		String str;
		List<String> list = new ArrayList<>();
		FileWriter fw =null;
		try {
			br = new BufferedReader(new FileReader("phoneBook/phoneBook.txt"));
			
			//进行list删除操作
			while((str = br.readLine())!=null) {
				list.add(str);
				if (match(str, name)) {
					System.out.println(str);
					System.out.println("确定要删除此人吗？1（是）0（否）");
					if (sc.nextInt() == 1) {
						list.remove(str);
					}
				}
			}
			
			//重写文件
			File f1 = new File("phoneBook/phoneBook.txt");
			f1.delete();
			File f2 = new File("phoneBook/phoneBook.txt");
			f2.createNewFile();
			fw = new FileWriter(f2);
			for (String string : list) {
				fw.write(string+"\n");
			}
			System.out.println("删除成功");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		selectAll();
		
	}

	public void updatePhone() {
		sc.nextLine();
		String name = sc.nextLine();
		BufferedReader br = null;
		String str;
		List<String> list = new ArrayList<>();
		FileWriter fw =null;
		try {
			br = new BufferedReader(new FileReader("phoneBook/phoneBook.txt"));
			
			//进行list修改操作
			while((str = br.readLine())!=null) {
				list.add(str);
				if (match(str, name)) {
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
					String note = "姓名：" + newName + "，性别： " + sex + "，年龄： " + age 
							+ "，电话： " + number + "，QQ： " + qq + "，地址： " + address;
					list.set(list.indexOf(str), note);
				}
			}
			
			//重写文件
			File f1 = new File("phoneBook/phoneBook.txt");
			f1.delete();
			File f2 = new File("phoneBook/phoneBook.txt");
			f2.createNewFile();
			fw = new FileWriter(f2);
			for (String string : list) {
				fw.write(string+"\n");
			}
			System.out.println("修改成功");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		selectAll();
		
		

	}

	// 查询全部
	public void selectAll() {
		
		FileReader fr = null;
		try {
			fr = new FileReader("phoneBook/phoneBook.txt");
			char[] c = new char[20];
			int len;
			//读取数据
			while ((len = fr.read(c))!=-1) {
				String str = new String(c, 0, len);
				System.out.print(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

	// 按照姓名查询
	public void selectOfName() {
		sc.nextLine();
		String name = sc.nextLine();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("phoneBook/phoneBook.txt"));
			String str;
			while((str = br.readLine())!=null) {
				if (match(str, name)) {
					System.out.println(str);
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
	//查字一条记录中的name属性是否匹配
	public boolean match(String str,String name) {
		int bIndex = str.indexOf("姓名：");
		int eIndex = str.indexOf("，性别");
		String sName = str.substring(bIndex+3, eIndex);
		if(sName.equals(name)) {
			return true;
		}else {
			return false;
		}
		
	}


}
