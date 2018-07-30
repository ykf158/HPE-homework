package com.hpe.service;

import java.util.ArrayList;
import java.util.List;

import com.hpe.dao.TelephoneDao;
import com.hpe.po.Telephone;

public class TeleService {

	List<Telephone> tels = new ArrayList<>();
	TelephoneDao td = new TelephoneDao();


	/**
	 * @title 添加电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:13:34
	 * @param telephone
	 * @return 1-添加成功，0-添加失败，-1-名字重复，添加失败
	 */
	public int addTel(Telephone telephone) {
		if (td.selectTelByName(telephone.getName())==null) {
			if (td.addTel(telephone)) {
				return 1;
			} else {
				return 0;
			}
		}else {
			return -1;
		}
	}

	/**
	 * @title 删除电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:10:58
	 * @param name
	 * @return 1-删除成功，0-删除失败，-1-名字不存在，删除失败
	 */
	public int deteleTelByName(String name) {
		if (td.selectTelByName(name)!=null) {
			if (td.deleteTel(name)) {
				return 1;
			} else {
				return 0;
			}
		}else {
			return -1;
		}
		
	}

	/**
	 * @title 根据姓名修改电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:39:38
	 * @param oldName
	 * @param newTel
	 * @return 1-更新成功，0-更新失败，-1-名字不存在，更新失败
	 */
	public int updateTelByName(String oldName, Telephone newTel) {
		if (td.selectTelByName(oldName)!=null) {
			if (td.updateTel(oldName, newTel)) {
				return 1;
			} else {
				return 0;
			}
		}else {
			return -1;
		}
			
		
	}

	/**
	 * @title 查询所有电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:14:13
	 * @return List<Telephone>
	 */
	public List<Telephone> selectAllTel() {
		return td.selectAllTel();
	}

	/**
	 * @title 根据名字查询电话本的业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:14:35
	 * @param name
	 * @return Telephone
	 */
	public Telephone selectTelByName(String name) {
		return td.selectTelByName(name);

	}


	


}
