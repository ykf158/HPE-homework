package com.hpe.service;

import java.util.List;

import com.hpe.po.User;

/**
 * @title  用户的业务
 * @author  尤锴丰
 * @date  2018年8月3日下午5:05:11
 */
public interface IUserService {

	/**
	 * @title 查看所有用户的业务
	 * @author 尤锴丰
	 * @date 2018年8月3日下午5:06:32
	 * @return
	 */
	List<User> selectAllUser();
	
	/**
	 * @title 注册用户的业务
	 * @author 尤锴丰
	 * @date 2018年8月3日下午5:25:29
	 * @param user
	 * @return
	 */
	int register(User user);
	
	/**
	 * @title 用户登录的业务
	 * @author 尤锴丰
	 * @date 2018年8月3日下午5:26:09
	 * @param user
	 * @return
	 */
	User login(User user);
	
	/**
	 * @title 修改密码
	 * @author 尤锴丰
	 * @date 2018年8月3日下午5:32:23
	 * @param user
	 * @return
	 */
	boolean changePwd(User user);
}
