package com.hpe.dao;

import com.hpe.po.Admin;

public interface IAdminDao {

	/**
	 * @title 根据用户名及密码查询
	 * @author 尤锴丰
	 * @date 2018年8月2日下午5:17:14
	 * @param admin
	 * @return
	 */
	Admin selectAdminByNameAndPwd(Admin admin);

}
