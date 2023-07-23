package com.tech2java.customerinfo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import com.tech2java.customerinfo.dao.CustomerDao;
import com.tech2java.customerinfo.dto.Customer;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
		name = "SaveCustomerServlet",
		urlPatterns = "/savecustomer",
		loadOnStartup = 1)
public class SaveCustomerServlet extends HttpServlet {

	private static final long serialVersionUID = -3786105116752867237L;

	CustomerDao customerDao=new CustomerDao();
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("Inside SaveCustomerServlet init method...");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//setting content type
        resp.setContentType("text/html");
		//get PrintWriter object to write data to browser
		PrintWriter out=resp.getWriter();
		out.println("<h2>Current Data & Time"+LocalDateTime.now()+"</h2>");
				
		try {
			System.out.println("Request in SaveCustomerServlet..START");
			String id=req.getParameter("custid");//value
			String name=req.getParameter("custName");//value
			String age=req.getParameter("custAge");//value
			String addr=req.getParameter("custAddr");//value
			
			//Creating object
			Customer customer=new Customer();
			customer.setCustomerId(Integer.parseInt(id)); //convert string to int
			customer.setCustomerName(name);
			customer.setCustomerAge(Integer.parseInt(age));
			customer.setCustomerAddress(addr);
			
			customerDao.save(customer);
			System.out.println("Request in SaveCustomerServlet..END");
			
			//Redirecting to CutomerServlet to send Result
			resp.sendRedirect("/servlets-05-v1/send-result");
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	
	
}
