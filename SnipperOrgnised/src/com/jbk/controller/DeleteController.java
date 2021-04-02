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
import com.jbk.service.DeleteService;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("I am in Delete Controller");
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("Id Going to Delete :" + id);
		DeleteService ds = new DeleteService();
		try {
			ArrayList<BloodInfo> albb = ds.deleteuser(id);
			System.out.println("Record After Deleted");
			if (!albb.isEmpty()) {
				request.setAttribute("ListOfBloodDonar", albb);
				RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
				rd.forward(request, response);
			} else {
				System.out.println("Data Not Available After Deletion....");
				request.setAttribute("sorryfromDeleteController", "No Data Available in List");
				RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
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
