package com.hpe.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hpe.po.CommonEmployee;
import com.hpe.po.Director;
import com.hpe.po.Employee;
import com.hpe.po.Manager;

public class EmpService {

	List<Employee> employees = new ArrayList<>();
	Employee employee = null;
	public void init(String path) {
		// 读取记事本中的数据（一行转换为
		// 一个Telephone对象，将这个对象放到tels，执行一次(启动时)）
		BufferedReader br = null;
		try {
			File file = new File(path);
			if(!file.exists()) {
				file.createNewFile();
			}
			br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				String[] info = line.split(",");
				if (info[2].equals("普通员工")) {
					employee = new CommonEmployee(info[0], info[1], info[2], Integer.parseInt(info[3]), Double.parseDouble(info[4]));
				} else if(info[2].equals("经理")) {
					employee = new Manager(info[0], info[1], info[2], Integer.parseInt(info[3]), Double.parseDouble(info[4]));
				} else if(info[2].equals("董事长")) {
					employee = new Director(info[0], info[1], info[2], Integer.parseInt(info[3]), Double.parseDouble(info[4]));
				}
				
				
				//将telephone对象添加到tels中
				employees.add(employee);			
			}
		} catch (NumberFormatException | IOException e) {
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

	/**
	 * @title 添加电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:13:34
	 * @param telephone
	 * @return int
	 */
	public int add(Employee employee) {
		int index = selectIndexByName(employee.getName());
		if (index != -1) {
			return -1;
		}

		return employees.add(employee) ? 1 : 0;

	}

	/**
	 * @title 删除电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:10:58
	 * @param name
	 * @return boolean
	 */
	public boolean detele(String name) {

		int index = selectIndexByName(name);
		if (index == -1) {
			return false;
		}

		// 删除
		employees.remove(index);
		return true;
	}

	/**
	 * @title 根据姓名修改电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:39:38
	 * @param oldName
	 * @param newEmployee
	 * @return boolean
	 */
	public boolean update(String oldName, Employee newEmployee) {
		// 得到索引
		int oldIndex = selectIndexByName(oldName);
		// 判断是否重名
		int newName = selectIndexByName(newEmployee.getName());
		if (newName == -1) {
			employees.set(oldIndex, newEmployee);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @title 查询所有电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:14:13
	 * @return List<Telephone>
	 */
	public List<Employee> select() {
		return employees;
	}


	/**
	 * @title 返回name在集合中的索引
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:15:07
	 * @param name
	 * @return int
	 */
	public int selectIndexByName(String name) {
		for (int i = 0; i < employees.size(); i++) {
			Employee tel = employees.get(i);
			String name1 = tel.getName();
			if (name.equals(name1)) {
				return i;
			}
		}
		return -1;
	}

	
	/**
	 * @title 退出应用时，将tels中的数据写到path这个文件中，属性以英文“,”隔开 
	 * @author 尤锴丰
	 * @date 2018年7月27日下午2:39:35
	 * @param path
	 */
	public void save(String path) {
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(path));
			for (Employee employee : employees) {
				bw.write(employee.message());
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
