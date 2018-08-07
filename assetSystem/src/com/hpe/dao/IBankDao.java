package com.hpe.dao;

import java.sql.SQLException;
import java.util.List;

import com.hpe.po.Bank;

/**
 * @title  对bank表操作的接口
 * @author 尤锴丰
 * @date  2018年8月3日上午8:48:09
 */
public interface IBankDao {

	/**
	 * @title 添加-->向bank表中添加一条记录
	 * @author 尤锴丰
	 * @date 2018年8月3日上午9:00:09
	 * @param bank
	 * @return 受影响的行数
	 */
	int addBank(Bank bank);
	
	
	/**
	 * @title 根据银行id删除银行
	 * @author 尤锴丰
	 * @date 2018年8月3日上午9:02:40
	 * @param bankId
	 * @return 受影响的行数
	 * @throws SQLException 
	 */
	int deleteBankById(int bankId) throws SQLException;
	
	
	/**
	 * @title 修改银行
	 * @author 尤锴丰
	 * @date 2018年8月3日上午9:07:53
	 * @param bank
	 * @return 受影响的行数
	 */
	int updateBankById(Bank bank);
	
	
	/**
	 * @title 查询所有银行
	 * @author 尤锴丰
	 * @date 2018年8月3日上午9:08:56
	 * @return
	 */
	List<Bank> selectAllBank();
	
	
	/**
	 * @title 根据银行名查询名银行
	 * @author 尤锴丰
	 * @date 2018年8月3日上午9:10:36
	 * @param bankName
	 * @return Bank-->null表示没有此名称的银行，不为null表示这个银行的信息
	 */
	Bank selectBankByName(String bankName);
	
	
	/**
	 * @title 根据银行id删除银行
	 * @author 尤锴丰
	 * @date 2018年8月3日上午9:13:36
	 * @param bankId
	 * @return Bank-->null表示没有此名称的银行，不为null表示这个银行的信息
	 */
	Bank selectBankById(int bankId);
	
	
	
}
