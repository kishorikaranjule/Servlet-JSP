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
 * Servlet implementation class RetrieveController
 */
@WebServlet("/RetrieveController")
public class RetrieveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		int empId=Integer.parseInt(request.getParameter("empId"));
		EmployeeDao edao=new EmployeeDao();
		List<Employee> lstemp=edao.searchRecord(empId);
		PrintWriter pw=response.getWriter();
		Employee eobj=null;
		
		if(lstemp!=null) {
			eobj=lstemp.get(0);
			pw.print("<h1>"+eobj.getEmpId()+"&nbsp"+eobj.getEmpName()+"&nbsp"+eobj.getEmpSalary()+"</h1>");
		}
		else
		{
			pw.println("Record not found");
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
