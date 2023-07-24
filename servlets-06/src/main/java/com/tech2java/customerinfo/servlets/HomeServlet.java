package com.tech2java.customerinfo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import com.tech2java.customerinfo.dao.CustomerDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HomeServlet", 
             
            urlPatterns = "/home")
public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = -3786105116752867237L;

	CustomerDao customerDao = new CustomerDao();

	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// setting content type
		resp.setContentType("text/html");
		// get PrintWriter object to write data to browser
		PrintWriter out = resp.getWriter();
		out.println("<h2>Login Successful. <br>Current Data & Time" + LocalDateTime.now() + "</h2>");

		try {
			out.println("<h4>Links</h4>");
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
