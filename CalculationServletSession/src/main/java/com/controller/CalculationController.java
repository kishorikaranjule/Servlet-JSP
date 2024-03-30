package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
		 //int Add=num1+num2;
		 PrintWriter pw=response.getWriter();
		 
		 Calculation cal=new Calculation();
		 cal.setNum1(num1);
		 cal.setNum2(num2);
		 cal.setResult(cal.getNum1()+cal.getNum2());
		 
		 //create session
		 HttpSession session=request.getSession();
		 session.setAttribute("result", cal);
		 //response.sendRedirect("FinalController");
		 
		 response.sendRedirect("ResultView.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
