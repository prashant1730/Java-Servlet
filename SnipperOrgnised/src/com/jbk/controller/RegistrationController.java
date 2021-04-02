package com.jbk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jbk.service.RegistrationService;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/Registration_Page")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationController() {
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

		String un = request.getParameter("username");
		String bg = request.getParameter("bloodgroup");
		String wgt = request.getParameter("weight");
		String cn = request.getParameter("contactNumber");
		String loc = request.getParameter("location");
		String pass = request.getParameter("password");

		RegistrationService rs = new RegistrationService();
		try {
			boolean result = rs.datapass(un, bg, wgt, cn, loc, pass);
			if (result) {
				System.out.println("Registration Done");
				request.setAttribute("Done", "Registration Successful...");
				RequestDispatcher ps = request.getRequestDispatcher("home.jsp");
				ps.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
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
