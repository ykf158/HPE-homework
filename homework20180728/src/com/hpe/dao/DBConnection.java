package com.hpe.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/telephone?useUnicode=true&charactorEncoding=utf-8&useSSL=false";
		String user = "root";
		String password = "you1582540778";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	
	
}
