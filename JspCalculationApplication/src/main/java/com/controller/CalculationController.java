package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Calculation;

/**
 * Servlet implementation class CalculationController
 */
@WebServlet("/CalculationController")
public class CalculationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int num1=Integer.parseInt(request.getParameter("num1"));
		 int num2=Integer.parseInt(request.getParameter("num2"));
		 
		 Calculation calci=new Calculation();
		 calci.setNum1(num1);
		 calci.setNum2(num2);
		 calci.setResult(calci.getNum1()+calci.getNum2());
		 
		 HttpSession session=request.getSession();
		 session.setAttribute("data", calci);//key and object
		 response.sendRedirect("CalculationView.jsp");
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
