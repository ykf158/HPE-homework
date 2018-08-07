package com.hpe.service.impl;

import java.util.List;

import com.hpe.dao.IUserDao;
import com.hpe.dao.impl.UserDaoImpl;
import com.hpe.po.User;
import com.hpe.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao userDao = new UserDaoImpl();

	@Override
	public List<User> selectAllUser() {

		return userDao.selectAllUser();
	}

	@Override
	public int register(User user) {
		User res = userDao.selectUserByName(user.getUserName());
		if (res != null) {
			return -1;
		}
		return (int) userDao.addUser(user);
	}

	@Override
	public User login(User user) {
		return userDao.selectUserByNameAndPwd(user.getUserName(), user.getUserPassword());

	}

	@Override
	public boolean changePwd(User user) {

		return userDao.updateUserById(user) > 0;
	}

}
