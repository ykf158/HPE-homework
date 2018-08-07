package com.hpe.dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.hpe.dao.IBankDao;
import com.hpe.po.Bank;
import com.hpe.util.JdbcUtil;

public class BankDaoImpl implements IBankDao {

	@Override
	public int addBank(Bank bank) {

		// 1.sql
		String sql = "insert into bank(bankName,bankTel) values(?,?)";

		// 2.QueryRunner
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());

		// 3.占位符数组
		Object[] params = { bank.getBankName(), bank.getBankTel() };

		int rows = 0;
		// 4.执行更新
		try {
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 5.返回
		return rows;
	}

	// 支持事务
	@Override
	public int deleteBankById(int bankId) throws SQLException {

		String sql = "delete from bank where bankid = ? ";
		Object[] params = { bankId };
		QueryRunner qr = new QueryRunner();
		int rows = qr.update(JdbcUtil.getConnection(), sql, params);
		return rows;
	}

	@Override
	public int updateBankById(Bank bank) {

		String sql = "update bank set bankname = ?,banktel = ? where bankid = ?";
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		Object[] params = { bank.getBankName(), bank.getBankTel(), bank.getBankId() };
		for (Object object : params) {
			System.out.println(object);
		}
		int rows = 0;
		try {
			
			rows = qr.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	@Override
	public List<Bank> selectAllBank() {

		String sql = "select * from bank";
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		List<Bank> banks = null;
		try {
			banks = qr.query(sql, new BeanListHandler<>(Bank.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return banks;
	}

	@Override
	public Bank selectBankByName(String bankName) {

		String sql = "select * from bank where bankname = ?";
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		Object[] params = { bankName };
		Bank bank = null;
		try {
			bank = qr.query(sql, new BeanHandler<>(Bank.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bank;
	}

	@Override
	public Bank selectBankById(int bankId) {

		String sql = "select * from bank where bankid = ?";
		QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
		Object[] params = { bankId };
		Bank bank = null;
		try {
			bank = qr.query(sql, new BeanHandler<>(Bank.class), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bank;
	}

}
