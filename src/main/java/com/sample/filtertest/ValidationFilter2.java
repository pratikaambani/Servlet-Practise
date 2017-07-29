package com.sample.filtertest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ValidationFilter
 */
public class ValidationFilter2 implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		PrintWriter out = response.getWriter();

		System.out.println("This is executed first from second filter. #preProcessing");
		System.out.println("From First Filter");

		int marks = 0;
		try {
			marks = Integer.parseInt(request.getParameter("marks"));
			
			System.out.println("Marks are = " +marks);
			System.out.println("also this is from second filter");

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		if (marks == 0) {
			out.println("marks is required.");
		}

		else {
			chain.doFilter(request, response);
		}

		// pass the request along the filter chain
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {

		String value = fConfig.getInitParameter("marks");

		System.out.println("value = " + value);
	}

}
