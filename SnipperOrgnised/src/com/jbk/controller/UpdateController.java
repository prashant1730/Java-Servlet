package com.jbk.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jbk.entity.BloodInfo;
import com.jbk.service.UpdateService;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateController() {
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
		int id = Integer.parseInt(request.getParameter("id"));

		String un = request.getParameter("username");
		String bg = request.getParameter("blood_group");
		String wgt = request.getParameter("weight");
		String cn = request.getParameter("contact_Number");
		String loc = request.getParameter("location");
		String pass = request.getParameter("password");

		UpdateService us = new UpdateService();
		try {
			ArrayList<BloodInfo> res = us.updatepass(id, un, bg, wgt, cn, loc, pass);

			if (!res.isEmpty()) {
				request.setAttribute("ListOfBloodDonar", res);
				RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
				rd.forward(request, response);
				System.out.println("Update Done");
			} else {
				System.out.println("Something Went Wrong");
				request.setAttribute("FailMsgFromUpdateController", "Something Went Wrong");
				RequestDispatcher rd = request.getRequestDispatcher("Edit.jsp");
				rd.forward(request, response);
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
