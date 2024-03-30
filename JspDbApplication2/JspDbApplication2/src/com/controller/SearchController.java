package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DBApplication;
import com.model.Register;

/**
 * Servlet implementation class SearchController
 */
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    try {
		        int rno = Integer.parseInt(request.getParameter("rno"));
		        DBApplication dao = new DBApplication();
		        Register r = dao.searchRecord(rno);
		        System.out.println(r.getRno()+"\t"+r.getFname());

		        if (r != null) {
		        	HttpSession session = request.getSession();
		            if (session != null) {
		                session.setAttribute("sdata", r);
		                response.sendRedirect("Search.jsp");
		            } else {
		                // Handle the case when there is no session
		                response.getWriter().println("Error: Session not available.");
		            }
		        } else {
		            // Handle the case when the record is not found
		            response.getWriter().println("Record not found for rno: " + rno);
		        }
		    } catch (NumberFormatException e) {
		        // Handle the case when the 'rno' parameter is not a valid integer
		        response.getWriter().println("Error: Invalid input for 'rno'. Please provide a valid integer.");
		    } catch (Exception e) {
		        // Handle other exceptions
		        e.printStackTrace(); // log or handle the exception appropriately
		        response.getWriter().println("An error occurred: " + e.getMessage());
		    }
		}

		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
