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
public class ValidationFilter implements Filter {

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

		String name = request.getParameter("name");
		String mail = request.getParameter("mail");

		System.out.println("This is executed first from filter. #preProcessing");

		System.out.println("From First Filter");
		
		chain.doFilter(request, response);
		
		System.out.println("Again we are back in First Filter");
		
/*		int marks = 0;
		try {
			marks = Integer.parseInt(request.getParameter("marks"));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
*/
		if (name.equals("")) {
			out.println("Name is required.");
		}

		if (mail.equals("")) {
			out.println("mail is required.");
		}

/*		if (marks == 0) {
			out.println("marks is required.");
		}
*/
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
