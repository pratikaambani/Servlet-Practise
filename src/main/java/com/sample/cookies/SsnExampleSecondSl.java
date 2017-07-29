package com.sample.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieExampleSecondServletc
 */
// @WebServlet("/CookieExampleSecondServletc")
public class SsnExampleSecondSl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");
		
		System.out.println("Look for servlet SsnExample before this.");

		PrintWriter out = response.getWriter();

		System.out.println("This example is using Cookie");
		Cookie ck[] = request.getCookies();
		out.print("This is value of cookie = " + ck[0].getValue());

		System.out.println("Cookie value = " + ck[0].getValue());

		System.out.println("This example is using Hidden Form");
		String nameUsingHiddenForm = request.getParameter("uName");

		System.out.println("nameUsingHiddenForm = " + nameUsingHiddenForm);
		
		
		String gettingDataUsingURLRewriting = request.getParameter("UN");
		
		System.out.println("This example is using Hidden Form");
		System.out.println("Hurrey now we'll get data using URL ReWriting");
		System.out.println("And The data is");
		System.out.println("UserName = " +gettingDataUsingURLRewriting);
		
		
		

	}
}
