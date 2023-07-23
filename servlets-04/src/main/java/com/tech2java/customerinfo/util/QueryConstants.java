package com.tech2java.customerinfo.util;

public interface QueryConstants {

	String JDBC_URL="jdbc:mysql://localhost:3306/cis";
	String MYSQL_DRIVER="com.mysql.cj.jdbc.Driver";
	String USER_NAME="root";
	String PASSWORD="root";
	
	
	//INSERTT QUERY
	String CUSTOMER_INSERT_QUERY="insert into customer values(?,?,?,?)";
	
	
}
