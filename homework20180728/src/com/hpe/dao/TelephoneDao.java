package com.hpe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.hpe.po.Telephone;

public class TelephoneDao {
	
	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet rs =null;
	Telephone telephone = null;
	
	
	/**
	 * @title 添加电话本到数据库中
	 * @author 尤锴丰
	 * @date 2018年7月28日上午11:01:25
	 * @param tel
	 * @return 
	 */
	public boolean addTel(Telephone tel) {
		connection = DBConnection.getConnection();
		String sql = "insert into telephone(name,sex,age,tel,qq,address) values(?,?,?,?,?,?)";
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, tel.getName());
			pstmt.setString(2, String.valueOf(tel.getSex()));
			pstmt.setInt(3, tel.getAge());
			pstmt.setString(4, tel.getTel());
			pstmt.setString(5, tel.getQq());
			pstmt.setString(6, tel.getAddress());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	
	/**
	 * @title 删除电话本
	 * @author 尤锴丰
	 * @date 2018年7月28日上午11:04:08
	 * @param name
	 * @return 
	 */
	public boolean deleteTel(String name) {
		connection = DBConnection.getConnection();
		String sql = "delete from telephone where name = ?";
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	
	/**
	 * @title 修改电话本
	 * @author 尤锴丰
	 * @date 2018年7月28日上午11:05:25
	 * @param oldTel,newTel
	 * @return
	 */
	public boolean updateTel(String oldName,Telephone newTel) {
		connection = DBConnection.getConnection();
		String sql = "update telephone set sex = ?,age = ?,tel = ?, qq = ?,address = ? where name = ?";
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, String.valueOf(newTel.getSex()));
			pstmt.setInt(2, newTel.getAge());
			pstmt.setString(3, newTel.getTel());
			pstmt.setString(4, newTel.getQq());
			pstmt.setString(5, newTel.getAddress());
			pstmt.setString(6, oldName);
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	
	/**
	 * @title 查询全部电话本
	 * @author 尤锴丰
	 * @date 2018年7月28日上午11:12:29
	 * @return ArrayList<Telephone>
	 */
	public ArrayList<Telephone> selectAllTel() {
		connection = DBConnection.getConnection();
		ArrayList<Telephone> list= new ArrayList<>();
		String sql = "select * from telephone";
		try {
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				telephone = new Telephone();
				telephone.setName(rs.getString(2));
				telephone.setSex(rs.getString(3).charAt(0));
				telephone.setAge(rs.getInt(4));
				telephone.setTel(rs.getString(5));
				telephone.setQq(rs.getString(6));
				telephone.setAddress(rs.getString(7));
				list.add(telephone);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
	/**
	 * @title 根据姓名查询 
	 * @author 尤锴丰
	 * @date 2018年7月28日上午11:14:59
	 * @param name
	 * @return
	 */
	public Telephone selectTelByName(String name) {
		//创建连接
		connection = DBConnection.getConnection();
		//定义SQL语句
		String sql = "select * from telephone where name = ?";
		//创建PreparedStatement对象（使用connection创建），用于发送预编译的SQL语句
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				telephone = new Telephone();
				telephone.setName(rs.getString(2));
				telephone.setSex(rs.getString(3).charAt(0));
				telephone.setAge(rs.getInt(4));
				telephone.setTel(rs.getString(5));
				telephone.setQq(rs.getString(6));
				telephone.setAddress(rs.getString(7));
				if (telephone!=null) {
					return telephone;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
			
		
		
	}
	
}
