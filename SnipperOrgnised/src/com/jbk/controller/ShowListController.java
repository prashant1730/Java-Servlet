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
import com.jbk.service.ShowListService;

/**
 * Servlet implementation class ShowListController
 */
@WebServlet("/showlist")
public class ShowListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowListController() {
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
		System.out.println("I am in show list");
		ShowListService sl = new ShowListService();
		try {
			ArrayList<BloodInfo> al = sl.ShowAllList();
			System.out.println("LIST DONE");

			if (al != null) {

				System.out.println("List Displayed");
				request.setAttribute("ListOfBloodDonar", al);
				RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
				rd.forward(request, response);

			} else {
				System.out.println("Data Not Available");
				request.setAttribute("elsemsg", "Data Not Available");
				RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);

			}

		} catch (Exception e) {
			System.out.println("Problem in getting List.....");
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
