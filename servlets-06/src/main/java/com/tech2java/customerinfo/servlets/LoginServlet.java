package com.tech2java.customerinfo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import com.tech2java.customerinfo.dao.CustomerDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
		name = "LoginServlet",
		urlPatterns = "/login",
		loadOnStartup = 1)
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = -3786105116752867237L;

	CustomerDao customerDao=new CustomerDao();
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//setting content type
        resp.setContentType("text/html");
		//get PrintWriter object to write data to browser
		PrintWriter out=resp.getWriter();
		out.println("<h2>Current Data & Time"+LocalDateTime.now()+"</h2>");
				
		try {
			System.out.println("Request in LoginServlet..START");
			String uname=req.getParameter("username");//value
			//String pwd=req.getParameter("pwd");//value
			
			
			RequestDispatcher rd=null;
			if(null!=uname && !uname.isEmpty() && uname.equalsIgnoreCase("tech2java")) {
				//it takes absolute path(/home-servlet) also relative path(home-servlet)
				rd=req.getRequestDispatcher("home");
				rd.forward(req, resp);
			}else {
				//it allows only absolute url
				rd=getServletContext().getRequestDispatcher("/error");
				rd.forward(req, resp);
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	
	
}
