package com.hpe.dao.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;

import com.hpe.dao.IAssetDao;
import com.hpe.po.Asset;
import com.hpe.po.AssetInfo;
import com.hpe.util.JdbcUtil;

public class AssetDaoImpl implements IAssetDao {

	@Override
	public List<AssetInfo> selectAssetByUserId(int userId) {

		StringBuffer sql = new StringBuffer();
		sql.append("select a.userId,u.userName,a.bankId,b.bankName,a.cardNum").append(",cardMoney,createDate ")
				.append("from asset a").append(" INNER JOIN user u").append(" ON a.userId = u.userId ")
				.append("INNER JOIN bank b").append(" on a.bankId = b.bankId").append(" where a.userId = ?");

		Object[] params = { userId };
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		List<AssetInfo> assetsInfo = null;
		try {
			assetsInfo = qr.query(sql.toString(), new BeanListHandler<>(AssetInfo.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return assetsInfo;
	}

	@Override
	public int deleteAssetByBankId(int bankId) throws SQLException {

		String sql = "delete from asset where bankId = ?";
		Object[] params = { bankId };
		QueryRunner qr = new QueryRunner();
		int rows = qr.update(JdbcUtil.getConnection(), sql, params);
		return rows;
	}

	@Override
	public Asset selectAssetByBankIdAndCardNum(Asset asset) {

		String sql = "select * from asset where bankId = ? and cardNum = ?";
		Object[] params = { asset.getBankId(), asset.getCardNum() };
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		Asset res = null;
		try {
			res = qr.query(sql, new BeanHandler<>(Asset.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int addAsset(Asset asset) {
		String sql = "insert into asset(bankId,cardNum,cardMoney,createDate,userId)"
					+"values(?,?,?,?,?)";
		Object[] params = {asset.getBankId(),asset.getCardNum(),asset.getCardMoney(),new Date(),asset.getUserId()};
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		int rows = 0;
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	@Override
	public Asset selectByBankIdAndCardNumAndUserId(Asset asset) {
		
		String sql = "select * from asset where bankId = ? and cardNum = ? and userId = ?";
		Object[] params = {asset.getBankId(),asset.getCardNum(),asset.getUserId()};
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		Asset res = null;
		
		try {
			res = qr.query(sql, new BeanHandler<>(Asset.class),params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public double selectCardMoneyByBankIdAndCardNum(Asset asset) {
		String sql = "select cardMoney from asset where bankId = ? and cardNum = ?";
		Object[] params = {asset.getBankId(),asset.getCardNum()};
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		double money = 0.0;
		try {
			Map<String, Object> res = qr.query(sql, new MapHandler(),params);
			Object object = res.get("cardMoney");
			money = Double.parseDouble(object.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return money;
	}

	@Override
	public int updateCardMoneyByBankIdAndCardNum(Asset asset, double money) {
		
		String sql = "update asset set cardMoney = cardMoney+? where bankId = ? and cardNum = ?";
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		Object[] params = {money,asset.getBankId(),asset.getCardNum()};
		int rows = 0;
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rows;
	}

	@Override
	public double selectCountMoneyByUserId(int userId) {
		
		String sql = "select sum(cardMoney) as sumMoney from asset where userId = ?";
		Object[] params = {userId};
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		double sumMoney = 0.0;
		try {
			Map<String, Object> res = qr.query(sql, new MapHandler(),params);
			Object object = res.get("sumMoney");
			sumMoney = Double.parseDouble(object.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return sumMoney;
	}

}
