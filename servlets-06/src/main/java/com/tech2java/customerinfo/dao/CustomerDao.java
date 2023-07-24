package com.tech2java.customerinfo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tech2java.customerinfo.dto.Customer;
import com.tech2java.customerinfo.util.JdbcUtil;

public class CustomerDao {

	
	//save
	public void save(Customer customer)throws Exception {
		Connection connection=JdbcUtil.getConnection();
		System.out.println("SaveCustomerServlet::init::connection=>"+connection);
		
		String sql="insert into customer values(?,?,?,?)";//id,name,age,address
		PreparedStatement pstmt=connection.prepareStatement(sql);
		
		pstmt.setInt(1, customer.getCustomerId());
		pstmt.setString(2, customer.getCustomerName());
		pstmt.setInt(3, customer.getCustomerAge());
		pstmt.setString(4, customer.getCustomerAddress());
		
		pstmt.executeUpdate();
	}
	
	//update
	
	//detete
	
	//retrieve
}
