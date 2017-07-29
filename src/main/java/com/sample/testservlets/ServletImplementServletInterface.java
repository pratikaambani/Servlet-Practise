package com.sample.testservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletImplementServletInterface
 */
public class ServletImplementServletInterface implements Servlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method called.");
		System.out.println("As init is called only once, doesnt matter howmany time this servlet called."
				+ "you will see This sop only once.");

		String age = config.getInitParameter("ageForThisServlet");
		System.out.println("Age from xml using servlet config = " + age);

		ServletContext sC = config.getServletContext();

		String ageFromServletContext = sC.getInitParameter("surnameThroughoutTheApplication");
		System.out.println("Age from servletContext = " + ageFromServletContext);
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method called.");

		System.out.println("Things to look for in this SL.");

		System.out.println("1. init called once");
		System.out.println("2. ServletConfig config in xml");
		System.out.println("3. destroy once only");
		System.out.println("4. service multiple times");
		System.out.println("5. mapping in web.xml");
		System.out.println("6. load on startup");
		System.out.println("7. ServletContext in xml");

	}

	@Override
	public void destroy() {
		System.out.println("destroy method called on undeployment or Shutting down.");
		System.out.println(
				"This method is called only upon stopping servlet, so printed when we shutdown out app server.");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
