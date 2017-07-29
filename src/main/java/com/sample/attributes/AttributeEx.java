package com.sample.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttributeEx
 */
public class AttributeEx extends HttpServlet {
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

		System.out.println("1. Attributes");
		System.out.println("2. Get value in another page which was inserted in this servlet.");
		System.out.println("3. Next servlet is SecondAttrServlet");
		System.out.println("4. URL = http://localhost:8081/ServletExamples/attributesInSL?un=Pratik");

		String name = request.getParameter("un");

		System.out.println("");
		System.out.println("Name stored is = " + name + "\n");

		ServletContext context = request.getServletContext();
		context.setAttribute("name", name);

		// This won't work.
		// RequestDispatcher rd =
		// request.getRequestDispatcher("attributesInSL");
		// rd.forward(request, response);

		PrintWriter out = response.getWriter();
		out.println("<a href='regstrSL1'>Click here to go to next serlvet.</a>");

	}

}
