package com.tech2java.customerinfo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tech2java.customerinfo.dto.Customer;
import com.tech2java.customerinfo.util.JdbcUtil;
import com.tech2java.customerinfo.util.QueryConstants;

public class CustomerDao {

	public void save(Customer customer) throws ClassNotFoundException, SQLException {
		
		Connection connection=JdbcUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(QueryConstants.CUSTOMER_INSERT_QUERY);
		pstmt.setInt(1,customer.getCustomerId());
		pstmt.setString(2, customer.getCustomerName());
		pstmt.setInt(3, customer.getCustomerAge());
		pstmt.setString(4, customer.getCustomerAddress());
		
		int no = pstmt.executeUpdate();
		System.out.println("No of rows inserted.." + no);
	}
}
