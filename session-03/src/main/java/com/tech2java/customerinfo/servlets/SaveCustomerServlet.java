package com.tech2java.customerinfo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.time.LocalDateTime;

import com.tech2java.customerinfo.dao.CustomerDao;
import com.tech2java.customerinfo.dto.Customer;
import com.tech2java.customerinfo.util.JdbcUtil;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "saveCustomer", 
            urlPatterns = { "/save-customer"}, 
            loadOnStartup = 1
)
public class SaveCustomerServlet extends HttpServlet {

	
	private static final long serialVersionUID = 2296045190279337557L;

	Connection connection=null;
	
	//Create CustomerDao object
	CustomerDao customerDao=new CustomerDao();
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("HelloWorldServlet_3_0::init method.");
		try {
			connection=JdbcUtil.getConnection();
			System.out.println("database connection::"+connection);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		

	}

	//for any request method service method will be executed
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloWorldServlet_3_0:: service method.");

		// setting content-type as HTML
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		

		//Creating customer with data
		Customer customer=new Customer();
		customer.setCustomerId(100);
		customer.setCustomerName("John");
		customer.setCustomerAge(45);
		customer.setCustomerAddress("HYD");
		
		//Saving customer 
		try {
			customerDao.save(customer);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		out.println("<h3>Date :" + LocalDateTime.now() + "</h3>");
		out.println("</h3>Customer Data saved successfully in database</h3>");
		
	}

	public void destroy() {
		System.out.println("HelloWorldServlet_3_0::	destroy method.");
	}

}
