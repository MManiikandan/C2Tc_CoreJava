package com.jdbc.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBconnection {
	private static final String url="jdbc:mysql://localhost:3306/jdbcminiproject";
	private static final String userName="root";
	private static final String passWord="root";
	public static Connection  getConnection() throws SQLException {
		return DriverManager.getConnection(url,userName,passWord);	
	}
	
}
