package com.tech2java.customerinfo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class HelloWorldServlet extends HttpServlet{

	private static final long serialVersionUID = 6929263852687250414L;

	@Override
	public void init(ServletConfig config) throws ServletException {
	
	 System.out.println("HelloWorldServlet::init method.");
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloWorldServlet:: service method.");
		
		//setting content-type as html
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h3>Date :"+LocalDateTime.now()+"</h3>");
	}

	@Override
	public void destroy() {
		System.out.println("HelloWorldServlet::	public method.");
	}

	
	
	

}
