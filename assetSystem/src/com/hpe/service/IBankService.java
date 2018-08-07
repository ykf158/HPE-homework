package com.hpe.service;

import java.util.List;

import com.hpe.po.Bank;

public interface IBankService {

	
	/**
	 * @title 查询所有银行的业务
	 * @author 尤锴丰
	 * @date 2018年8月3日下午7:02:33
	 * @return
	 */
	List<Bank> selectAllBank();
	
	/**
	 * @title 添加银行的业务
	 * @author 尤锴丰
	 * @date 2018年8月3日下午7:02:50
	 * @param bank
	 * @return
	 */
	int addBank(Bank bank);
	
	
	/**
	 * @title 修改银行的业务
	 * @author 尤锴丰
	 * @date 2018年8月3日下午7:03:34
	 * @param bank
	 * @return
	 */
	boolean updateBank(Bank bank);
	
	
	
	/**
	 * @title 删除银行
	 * @author 尤锴丰
	 * @date 2018年8月3日下午7:04:20
	 * @param bankId
	 * @return
	 */
	boolean deleteBank(int bankId);
	
	
	/**
	 * @title 根据银行id查询银行
	 * @author 尤锴丰
	 * @date 2018年8月3日下午7:06:13
	 * @param bankId
	 * @return
	 */
	Bank selectBankByBankId(int bankId);
}
