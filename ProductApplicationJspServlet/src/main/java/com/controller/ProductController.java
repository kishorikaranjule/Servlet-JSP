package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Product;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<Product> prodList=null;
	public void init()
	{
		prodList=new LinkedList<Product>();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter pw=response.getWriter();
		int prodId=Integer.parseInt(request.getParameter("pid"));
		String prodName=request.getParameter("pname");
		float prodPrice=Float.parseFloat(request.getParameter("pprice"));
		int prodQty=Integer.parseInt(request.getParameter("pqty"));
		
		Product prod=new Product(prodId, prodName, prodPrice, prodQty);
		prodList.add(prod);
		//create session
		HttpSession session=request.getSession(true);
		session.setAttribute("prod", prodList);
		pw.print("<h1>do you want to add more product in cart click Yes or No</h1>");
        pw.println("<a href='Product.html'>Yes</a>");
		 
         
        pw.print("<h1>To confirm product bill click yes</h1>");
        pw.print("<a href='CartServlet.java'>Yes</a>");
         
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
