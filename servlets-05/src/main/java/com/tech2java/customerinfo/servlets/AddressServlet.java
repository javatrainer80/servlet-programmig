package com.tech2java.customerinfo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Enumeration;

import com.tech2java.customerinfo.dao.CustomerDao;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "AddressServlet", 
            initParams = { @WebInitParam(name = "city", value = "HYD"),
		                   @WebInitParam(name = "state", value = "TS") }, 
            urlPatterns = "/address-servlet")
public class AddressServlet extends HttpServlet {

	private static final long serialVersionUID = -3786105116752867237L;

	CustomerDao customerDao = new CustomerDao();

	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// setting content type
		resp.setContentType("text/html");
		// get PrintWriter object to write data to browser
		PrintWriter out = resp.getWriter();
		out.println("<h2>Current Data & Time" + LocalDateTime.now() + "</h2>");

		try {
			out.println("<h3>Init Parameters</h3>");
			out.println("<h4>" + getInitParameter("city")+"==="+getInitParameter("state")+"</h4>");
			
			out.println("<br>");
			
			Enumeration<String> enumeration=getInitParameterNames();
			while(enumeration.hasMoreElements()) {
				String paramName=(String)enumeration.nextElement();
				String paramValue=getInitParameter(paramName);
				out.print("name::"+paramName +"->VALUE->"+paramValue);
			}
			
			out.println("<br><h3> Context Parameters</h3>");
			
			ServletContext context=getServletContext();
			out.println("<h4>" + context.getInitParameter("city")+ "==="+
					context.getInitParameter("state")+"</h4>");
					

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
