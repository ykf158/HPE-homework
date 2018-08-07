package com.hpe.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.hpe.dao.IAdminDao;
import com.hpe.po.Admin;
import com.hpe.util.JdbcUtil;

public class AdminDaoImpl implements IAdminDao{

	@Override
	public Admin selectAdminByNameAndPwd(Admin admin) {
		String sql = "select * from admin where adminName = ? and adminPassword = ?";
		//创建QueryRunner
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		
		//占位符数组
		Object[] params = {admin.getAdminName(),admin.getAdminPassword()};
		
		
		
		Admin res = new Admin();
		//执行查询
		try {
			res = qr.query(sql, new BeanHandler<>(Admin.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

}
