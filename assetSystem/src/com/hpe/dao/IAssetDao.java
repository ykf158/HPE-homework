package com.hpe.dao;

import java.sql.SQLException;
import java.util.List;

import com.hpe.po.Asset;
import com.hpe.po.AssetInfo;

public interface IAssetDao {
	
	
	/**
	 * @title 根据用户id查询资产
	 * @author 尤锴丰
	 * @date 2018年8月3日下午3:22:55
	 * @param userId
	 * @return List<AssetInfo>
	 */
	List<AssetInfo> selectAssetByUserId(int userId);
	
	
	/**
	 * @title 根据银行id删除资产
	 * @author 尤锴丰
	 * @date 2018年8月3日下午3:25:29
	 * @param bankId
	 * @return
	 * @throws SQLException
	 */
	int deleteAssetByBankId(int bankId) throws SQLException;
	
	
	/**
	 * @title 根据银行id、卡号查询资产
	 * @author 尤锴丰
	 * @date 2018年8月3日下午3:31:37
	 * @param asset
	 * @return
	 */
	Asset selectAssetByBankIdAndCardNum(Asset asset);
	
	
	/**
	 * @title 添加资产
	 * @author 尤锴丰
	 * @date 2018年8月3日下午3:31:48
	 * @param asset
	 * @return
	 */
	int addAsset(Asset asset);
	
	
	/**
	 * @title 根据银行id、卡号、用户id查询资产
	 * @author 尤锴丰
	 * @date 2018年8月3日下午3:33:39
	 * @param asset
	 * @return
	 */
	Asset selectByBankIdAndCardNumAndUserId(Asset asset);
	
	
	/**
	 * @title 根据银行id和卡号查询余额
	 * @author 尤锴丰
	 * @date 2018年8月3日下午3:34:26
	 * @param asset
	 * @return
	 */
	double selectCardMoneyByBankIdAndCardNum(Asset asset);
	
	
	/**
	 * @title 根据银行id和卡号修改余额
	 * @author 尤锴丰
	 * @date 2018年8月3日下午3:35:17
	 * @param asset
	 * @param money
	 * @return
	 */
	int updateCardMoneyByBankIdAndCardNum(Asset asset , double money);
	
	
	/**
	 * @title 根据用户id查询总资产
	 * @author 尤锴丰
	 * @date 2018年8月3日下午6:43:11
	 * @param userId
	 * @return
	 */
	double selectCountMoneyByUserId(int userId);
	
	
	
	
}
