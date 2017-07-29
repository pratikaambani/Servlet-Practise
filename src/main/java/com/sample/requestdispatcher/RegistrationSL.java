package com.sample.requestdispatcher;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationSL
 */
//@WebServlet("/RegistrationSL")
public class RegistrationSL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String name = request.getParameter("name");
		String fName = request.getParameter("fname");
		String mName = request.getParameter("mname");

		System.out.println("Hi, From second servlet");
		System.out.println("Now we are in second servlet");
		System.out.println("Lets check values over here");
		System.out.println("#inSecondServlet");

		System.out.println("name = " + name);
		System.out.println("fname = " + fName);
		System.out.println("mname = " + mName);

		super.doGet(request, response);
	}
}
