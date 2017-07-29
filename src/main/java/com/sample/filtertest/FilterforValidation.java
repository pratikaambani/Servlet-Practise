package com.sample.filtertest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FilterforValidation
 */
public class FilterforValidation extends HttpServlet {
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

		System.out.println("Check Filter - ValidationFilter applied to this servlet by debugging.");
		System.out.println(
				"URL = http://localhost:8081/ServletExamples/studreg?name=Pratik&mail=pratik@test.com&marks=100");
		System.out.println("Additional work is - ");
		System.out.println("Hurrey!!");
		System.out.println("We have implemented filter chaining");
		System.out.println("Look for ValidationFilter2");
		
		

		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		int marks = Integer.parseInt(request.getParameter("marks"));

		System.out.println("name = " + name + " and mail = " + mail + " and marks = " + marks);
		
		PrintWriter out = response.getWriter();
		out.println("Check console.");		

	}

}
