package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Product;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet.java")
public class CartServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw=response.getWriter();
		 pw.print("Hello...Cart Servlet Here..");
		 
		 //create session 
		 HttpSession session=request.getSession(true);
		 List<Product> lstProd=(List)session.getAttribute("prod");//prod=key
		 //pw.print("<table border='4' bgcolor='blue'>");
		 //pw.print("<table>");
		 for(Product p:lstProd)
		 {
			// pw.print("<tr>");
			 /*pw.print("<tr><td>"+p.getProdId()+"</td></tr>");
			 pw.print("<tr><td>"+p.getProdName()+"</td></tr>");
			 pw.print("<tr><td>"+p.getProdPrice()+"</td></tr>");
			 pw.print("<tr><td>"+p.getProdQty()+"</td></tr>");*/
			 //pw.print("</tr>");
			 pw.print(p.getProdId());
			 pw.print(p.getProdName());
			 pw.print(p.getProdPrice());
			 pw.print(p.getProdQty());
		 }
		 
		 //pw.print("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
