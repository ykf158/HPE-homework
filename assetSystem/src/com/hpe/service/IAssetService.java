package com.hpe.service;

import java.util.List;

import com.hpe.po.Asset;
import com.hpe.po.AssetInfo;

public interface IAssetService {

	
	/**
	 * @title 根据用户id查询资产
	 * @author 尤锴丰
	 * @date 2018年8月3日下午7:41:24
	 * @param userId
	 * @return
	 */
	List<AssetInfo> selectAssetsByUserId(int userId);
	
	
	
	/**
	 * 
	 * @title 根据用户id查询总资产
	 * @author 尤锴丰
	 * @date 2018年8月3日下午7:41:50
	 * @param userId
	 * @return
	 */
	double selectSumMoneyByUserId(int userId);
	
	/**
	 * @title 添加资产
	 * @author 尤锴丰
	 * @date 2018年8月3日下午7:43:27
	 * @param asset
	 * @return
	 */
	int addAsset(Asset asset);
	
	/**
	 * 
	 * @title 提取资产
	 * @author 尤锴丰
	 * @date 2018年8月3日下午7:57:25
	 * @param asset,extractmoney
	 * @return
	 */
	int extractAsset(Asset asset,double etractMoney);
	
	/**
	 * @title 存入资产
	 * @author 尤锴丰
	 * @date 2018年8月3日下午8:22:26
	 * @param asset
	 * @param depositMoney
	 * @return
	 */
	int depositAsset(Asset asset , double depositMoney);
	
	
	
}
