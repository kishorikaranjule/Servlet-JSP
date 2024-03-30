package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dao.EmployeeDao;
import emp.model.Employee;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empId=Integer.parseInt(request.getParameter("empId"));
		String empName=request.getParameter("empName");
		float empSalary=Float.parseFloat(request.getParameter("empSalary"));
		 
		EmployeeDao edao=new EmployeeDao();
		
		Employee eobj=new Employee(empId,empName,empSalary);
		int i = edao.updateEmployee(eobj);
		 
	
		if(i>0) 
		{
			response.sendRedirect("Update.html");
		}
		else
		{
			response.sendRedirect("Error.html");
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
