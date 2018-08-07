package com.hpe.service.impl;

import com.hpe.dao.IAdminDao;
import com.hpe.dao.impl.AdminDaoImpl;
import com.hpe.po.Admin;
import com.hpe.service.IAdminService;

public class AdminServiceImpl implements IAdminService{

	private IAdminDao adminDao = new AdminDaoImpl();//注入
	@Override
	public Admin login(Admin admin) {
		return adminDao.selectAdminByNameAndPwd(admin);
	}

}
