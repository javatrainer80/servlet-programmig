package com.tech2java.customerinfo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
		name = "Servlet1",
		urlPatterns = "/servlet1")
public class Servlet1 extends HttpServlet {

	private static final long serialVersionUID = -3786105116752867237L;

	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
        resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		try {
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/servlet2");
			out.println("<h3>Servlet-01 START</h3>");
			rd.include(req, resp);
			out.println("<h3>Servlet-01 END</h3>");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	
	
}
