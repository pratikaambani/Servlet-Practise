package com.sample.testservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServletWithRequestMethods extends HttpServlet {
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

		System.out.println("1. use sl directly from URL");
		System.out.println("2. welcome file");
		System.out.println("3. html to java console/browser");
		System.out.println("4. URL = http://localhost:8080/ServletExamples/firstsl?name=Pratik");
		System.out.println("5. html content in servlet ");

		System.out.println("Enclosing htmls are - GettingName.html");

		PrintWriter out = response.getWriter();

		String nameFromURL = request.getParameter("name");
		out.println("\n Name is  = " + nameFromURL);

		Enumeration<String> s = request.getParameterNames();
		while (s.hasMoreElements()) {
			System.out.println("sds = " + s.nextElement());
		}

		int port1 = request.getLocalPort();
		int port2 = request.getRemotePort();
		int port3 = request.getServerPort();
		System.out.println("port1 = " + port1 + " and port2 = " + port2 + " and port3 = " + port3);

		String serverName = request.getServerName();
		System.out.println("serverName = " + serverName);

		out.println("<html> <title>SerlvetExampleTitle</title><body>");
		out.println("<b>Value = " + nameFromURL + "</b>");
		out.println("</body></html>");

	}

}
