package com.sample.testservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionMaintaining
 */
public class SessionMaintaining extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionMaintaining() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		System.out.println("Things to look for in this SL.");
		
		System.out.println("1. Session maintaining among jsps.");
		System.out.println("2. get/setAttribute");
		System.out.println("3. response.sendRedirect");
		System.out.println("JSPs = formSubmit1.jsp,formSubmit2.jsp, formSubmit3.jsp");

		
		
		HttpSession session = request.getSession();

		String fNo = request.getParameter("fno");

		if (fNo.equals("1")) {
			String name = request.getParameter("name");
			String fName = request.getParameter("fname");
			String mName = request.getParameter("mname");

			session.setAttribute("name", name);
			session.setAttribute("fName", fName);
			session.setAttribute("mName", mName);

			response.sendRedirect("./formSubmit2.jsp");
		}

		if (fNo.equals("2")) {

			String telephoneNo = request.getParameter("tel");
			String mobileNo = request.getParameter("mob");
			String eMailID = request.getParameter("email");

			session.setAttribute("telephoneNo", telephoneNo);
			session.setAttribute("mobileNo", mobileNo);
			session.setAttribute("eMailID", eMailID);

			response.sendRedirect("./formSubmit3.jsp");
		}

		if (fNo.equals("3")) {

			String education = request.getParameter("edu");
			String address = request.getParameter("add");
			String country = request.getParameter("c");

			session.setAttribute("education", education);
			session.setAttribute("address", address);
			session.setAttribute("country", country);

			String nameFromFirst = (String) session.getAttribute("name");
			String fNameFromFirst = (String) session.getAttribute("fName");
			String mNameFromFirst = (String) session.getAttribute("nName");

			String telFromSecond = (String) session.getAttribute("telephoneNo");
			String mobFromSecond = (String) session.getAttribute("mobileNo");
			String eMailFromSecond = (String) session.getAttribute("eMailID");

			System.out.println("nameFromFirst = " + nameFromFirst);
			System.out.println("fnameFromFirst = " + fNameFromFirst);
			System.out.println("mNameFromFirst = " + mNameFromFirst);

			System.out.println("telFromSecond = " + telFromSecond);
			System.out.println("mobFromSecond = " + mobFromSecond);
			System.out.println("eMailFromSecond = " + eMailFromSecond);

			System.out.println("education = " + education);
			System.out.println("address = " + address);
			System.out.println("country = " + country);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
