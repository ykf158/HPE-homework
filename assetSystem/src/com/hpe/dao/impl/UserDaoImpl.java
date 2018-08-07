package com.hpe.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.hpe.dao.IUserDao;
import com.hpe.po.User;
import com.hpe.util.JdbcUtil;

public class UserDaoImpl implements IUserDao {

	public List<User> selectAllUser() {
		String sql = "select * from user ";
		List<User> alluser = null;
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		try {
			alluser = qr.query(sql, new BeanListHandler<>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return alluser;
	}

	@Override
	public long addUser(User user) {
		String sql = "insert into user(userName,userPassword,realName,sex,tel,idCard,address)values(?,?,?,?,?,?,?)";
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		Object[] params = { user.getUserName(), user.getUserPassword(), user.getRealName(), user.getSex(),
				user.getTel(), user.getIdCard(), user.getAddress() };
		long id=0l;
		try {
			qr.update(sql, params);
			id = ((Number)qr.query("select last_insert_id()", new ScalarHandler<>())).longValue();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public int updateUserById(User user) {
		String sql = "update user set userPassword=? where userId=?";
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		Object[] params = { user.getUserPassword(), user.getUserId()};
		int row = 0;
		try {
			row = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public User selectUserByName(String userName) {
		String sql = "select *from  user where userName=?";
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		Object[] params = { userName };
		User user = null;
		try {
			user = qr.query(sql, new BeanHandler<>(User.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User selectUserByNameAndPwd(String userName, String userPassword) {
		String sql = "select *from  user where userName=? and userPassword=?";
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		Object[] params = { userName, userPassword };
		User user = null;
		try {
			user = qr.query(sql, new BeanHandler<>(User.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
