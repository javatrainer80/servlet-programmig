package com.tech2java.customerinfo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServletwith3.0", initParams = { @WebInitParam(name = "param1", value = "value1"),
		@WebInitParam(name = "param2", value = "value2") }, urlPatterns = { "/hello-3.0",
				"/hello-3.1" }, loadOnStartup = 1

)
public class HelloWorldServlet_3_0 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2296045190279337557L;

	public void init(ServletConfig config) throws ServletException {

		System.out.println("HelloWorldServlet_3_0::init method.");

	}

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloWorldServlet_3_0:: service method.");

		// setting content-type as html
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h3>Date :" + LocalDateTime.now() + "</h3>");
	}

	public void destroy() {
		System.out.println("HelloWorldServlet_3_0::	public method.");
	}

}
