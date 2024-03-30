package com.controller;

import java.util.List;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Bill;
import com.model.Product;

/**
 * Servlet implementation class BillServlet
 */
@WebServlet("/BillServlet")
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session=request.getSession(true);
		 List<Product> lstProd=(List)session.getAttribute("data");
		 float total=0,finaltotal=0,cgst=0,sgst=0;
		 PrintWriter pw=response.getWriter();
		 /*for(Product p:lstProd)
		 {
			 total=total+p.getProdPrice()*p.getProdQty();
		 }*/
		 
		 if (lstProd != null) {
			    // The list is not null, so you can safely iterate over it
			    for (Product p : lstProd) {
			        // Your iteration logic here
			        // For example, pw.print("<tr><td>" + p.getProdId() + "</td> ... </tr>");
			    }
			} else {
			    // Handle the case where the list is null (e.g., print an error message)
			    pw.print("<p>No products available.</p>");
			}
		 
		 cgst=total*0.06f;
		 sgst=total*0.06f;
		 finaltotal=total+cgst+sgst;
		 
		 Bill bill=new Bill(1,total,cgst,sgst,finaltotal);
		 session.setAttribute("bill", bill);
		 response.sendRedirect("DisplayServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
