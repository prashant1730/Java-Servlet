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
import com.jbk.service.EditService;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/edit")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("I am in Edit Controller Servlet");
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("Given ID for Edit :" + id);

		EditService es = new EditService();
		try {
			ArrayList<BloodInfo> albi = es.datapass(id);
			System.out.println("ID for Edit :" + albi);

			if (!albi.isEmpty()) {

				request.setAttribute("List", albi);
				RequestDispatcher rd = request.getRequestDispatcher("Edit.jsp");
				rd.forward(request, response);
			} else {
				System.out.println("Something Went Wrong...");

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