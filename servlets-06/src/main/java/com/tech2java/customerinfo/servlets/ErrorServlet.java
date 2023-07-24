package com.tech2java.customerinfo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
		name = "ErrorServlet",
		urlPatterns = "/error")
public class ErrorServlet extends HttpServlet {

	private static final long serialVersionUID = -3786105116752867237L;

	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//setting content type
        resp.setContentType("text/html");
		//get PrintWriter object to write data to browser
		PrintWriter out=resp.getWriter();
		out.println("<h2>Current Data & Time"+LocalDateTime.now()+"</h2>");
				
		try {
			out.println("<h3>Login failed.Please login again</h3>"
					+ "<a href='/servlets-06/login.html'>Login</a>");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	
	
}
