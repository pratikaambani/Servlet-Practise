package com.sample.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieExample
 */
// @WebServlet("/CookieExample")
public class SsnExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Things to look for in this SL.");

		System.out.println("1. Session Management using Cookkies.");
		System.out.println("2. Session Management using Hidden FormField.");
		System.out.println("3. Session Management using URL Rewriting.");
		System.out.println("JSPS included = SessionUsingCookie.jsp");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String userName = request.getParameter("username");

		Cookie ck = new Cookie("UserName", userName);
		ck.setMaxAge(10);
		ck.setPath("\\\\tsclient\\D\\Xtra");
		response.addCookie(ck);

		System.out.println(" getComment * " + ck.getComment());
		System.out.println(" Domain =  " + ck.getDomain());
		System.out.println(" MaxAge = " + ck.getMaxAge());
		System.out.println(" getPath * " + ck.getPath());
		System.out.println(" getValue * " + ck.getValue());
		System.out.println(" getVersion * " + ck.getVersion());
		System.out.println(" getClass * " + ck.getClass());
		System.out.println(" getSecure * " + ck.getSecure());

		out.println();
		out.println("<form action='cookiesssnpg2'>");
		out.println("<input type='submit' value='Okay, Go!'>");
		out.println("</form>");

		System.out.println("Now this is using Form Hidden field.");

		out.println("<form action='cookiesssnpg2'>");
		out.println("<input type = 'hidden' name = 'uName' value = " + userName + " >");
		out.println("<input type='submit' value='Okay, Go!'>");
		out.println("</form>");

		System.out.println("Now this is using URL Rewriting.");
		out.print("<a href = 'cookiesssnpg2?UN=" + userName + "'>");

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
