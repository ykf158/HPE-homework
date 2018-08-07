package com.hpe.service.impl;

import java.util.List;

import com.hpe.dao.IAssetDao;
import com.hpe.dao.IBankDao;
import com.hpe.dao.impl.AssetDaoImpl;
import com.hpe.dao.impl.BankDaoImpl;
import com.hpe.po.Asset;
import com.hpe.po.AssetInfo;
import com.hpe.service.IAssetService;

public class AssetServiceImpl implements IAssetService{

	private IBankDao bankDao = new BankDaoImpl();
	private IAssetDao assetDao = new AssetDaoImpl();
	@Override
	public List<AssetInfo> selectAssetsByUserId(int userId) {
		return assetDao.selectAssetByUserId(userId);
	}

	@Override
	public double selectSumMoneyByUserId(int userId) {
		return assetDao.selectCountMoneyByUserId(userId);
	}

	@Override
	public int addAsset(Asset asset) {
		
		if (bankDao.selectBankById(asset.getBankId())==null) {
			return -1;
		}
		if (assetDao.selectAssetByBankIdAndCardNum(asset)!=null) {
			return -2;
		}
		
		return assetDao.addAsset(asset);
		
		
	}

	@Override
	public int extractAsset(Asset asset, double etractMoney) {
		
		Asset res = assetDao.selectAssetByBankIdAndCardNum(asset);
		if (res == null) {
			return -1;
		}
		
		double balance = assetDao.selectCardMoneyByBankIdAndCardNum(asset);
		if (balance< etractMoney) {
			return -2;
		}
		
		return assetDao.updateCardMoneyByBankIdAndCardNum(asset, -etractMoney);
	}

	@Override
	public int depositAsset(Asset asset, double depositMoney) {
		
		Asset res = assetDao.selectAssetByBankIdAndCardNum(asset);
		if (res == null) {
			return -1;
		}
		
		return assetDao.updateCardMoneyByBankIdAndCardNum(asset, depositMoney);
	}

}
