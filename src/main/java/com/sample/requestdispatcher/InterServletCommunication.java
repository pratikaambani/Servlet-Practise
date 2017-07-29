package com.sample.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InterServletCommunication
 */
public class InterServletCommunication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		System.out.println("Things to look for in this SL.");

		System.out.println("1. InterServlet Communication");
		System.out.println("2. Sending data from 1 SL to another");
		System.out.println("3. Request Dispatcher Interface");
		System.out.println("4. forward() #commentedToUse include()");
		System.out.println("5. include()");

		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String fName = request.getParameter("fname");
		String mName = request.getParameter("mname");

		System.out.println("name = " + name + fName + mName);

		boolean b = false;

		if (name.equals("")) {
			out.println("name is required.");
			b = false;
		}
		if (fName.equals("")) {
			out.println("fathers anme s required.");
			b = false;
		}
		if (mName.equals("")) {
			out.println("mothers name is required.");
			b = false;
		} else {
			b = true;
		}

		if (b == true) {

			System.out.println("Now going to RequestDispatcher.");
			RequestDispatcher rD = request.getRequestDispatcher("regstrSL");

			rD.forward(request, response);
			// rD.include(request, response);

			System.out.println("He he, we are again in first servlet after doing some processing in second servlet.");
		}

	}

}
