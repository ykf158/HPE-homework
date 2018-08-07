package com.hpe.service;

import com.hpe.po.Admin;

/**
 * @title  管理员业务
 * @author  尤锴丰
 * @date  2018年8月3日下午4:45:26
 */
public interface IAdminService {

	/**
	 * @title 登录业务
	 * @author 尤锴丰
	 * @date 2018年8月3日下午4:48:11
	 * @param admin
	 * @return
	 */
	Admin login(Admin admin);
	
}
