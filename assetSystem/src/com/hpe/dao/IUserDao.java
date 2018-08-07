package com.hpe.dao;

import java.util.List;
import com.hpe.po.User;

public interface IUserDao {
	/**
	 * @title 查询所有用户
	 * @author 尤锴丰
	 * @date 2018年8月3日上午11:42:33
	 * @return
	 */
	List<User> selectAllUser();

	/**
	 * @title 添加用户
	 * @author 尤锴丰
	 * @date 2018年8月3日上午11:42:49
	 * @param user
	 * @return
	 */
	long addUser(User user);

	/**
	 * @title 根据id修改密码
	 * @author 尤锴丰
	 * @date 2018年8月3日上午11:43:04
	 * @param user
	 * @return
	 */
	int updateUserById(User user);

	/**
	 * 
	 * @title 根据用户名查询用户
	 * @author 尤锴丰
	 * @date 2018年8月3日上午11:43:17
	 * @param userName
	 * @return
	 */
	User selectUserByName(String userName);

	/**
	 * @title 根据用户及密码查询用户
	 * @author 尤锴丰
	 * @date 2018年8月3日上午11:43:33
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	User selectUserByNameAndPwd(String userName, String userPassword);
	
	
	
}
