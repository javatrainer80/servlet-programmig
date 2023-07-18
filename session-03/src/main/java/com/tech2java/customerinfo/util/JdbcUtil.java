package com.tech2java.customerinfo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(QueryConstants.MYSQL_DRIVER);
		Connection connection = DriverManager.getConnection(QueryConstants.JDBC_URL, QueryConstants.USER_NAME,QueryConstants.PASSWORD);
		System.out.println("Connection Established..." + connection);
		return connection;
	}
	
	
}
