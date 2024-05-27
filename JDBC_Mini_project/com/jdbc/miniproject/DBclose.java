package com.jdbc.miniproject;

import java.sql.Connection;
import java.sql.SQLException;

public final class DBclose {
	public static void getClose(Connection con) throws SQLException {
		 con.close(); 	
	}
}