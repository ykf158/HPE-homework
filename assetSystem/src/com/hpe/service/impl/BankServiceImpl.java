package com.hpe.service.impl;

import java.util.List;

import com.hpe.dao.IAssetDao;
import com.hpe.dao.IBankDao;
import com.hpe.dao.impl.AssetDaoImpl;
import com.hpe.dao.impl.BankDaoImpl;
import com.hpe.po.Bank;
import com.hpe.service.IBankService;
import com.hpe.util.JdbcUtil;

public class BankServiceImpl implements IBankService{

	private IBankDao bankDao = new BankDaoImpl();
	private IAssetDao assetDao = new AssetDaoImpl();
	@Override
	public List<Bank> selectAllBank() {
		return bankDao.selectAllBank();
	}

	@Override
	public int addBank(Bank bank) {
		Bank res = bankDao.selectBankByName(bank.getBankName());
		if (res!=null) {
			return -1;
		}
		return bankDao.addBank(bank);
	}

	@Override
	public boolean updateBank(Bank bank) {
		
		
		return bankDao.updateBankById(bank)>0;
	}

	@Override
	public boolean deleteBank(int bankId) {
		boolean isDel = true;
		try {
			JdbcUtil.beginTranscation();
			assetDao.deleteAssetByBankId(bankId);
			bankDao.deleteBankById(bankId);
			JdbcUtil.commitTransaction();
			isDel = true;
		} catch (Exception e) {
			try {
				JdbcUtil.rollbackTransaction();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return isDel;
	}

	@Override
	public Bank selectBankByBankId(int bankId) {
		return bankDao.selectBankById(bankId);
	}

}
