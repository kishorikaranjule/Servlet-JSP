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
 * Servlet implementation class DisplayAllController
 */
@WebServlet("/DisplayAllController")
public class DisplayAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw=response.getWriter();
		 EmployeeDao edao=new EmployeeDao();
		 List<Employee> lstall=edao.displayAll();
		 pw.println("<table border='3px' bgcolor='f1f1f1'>");
		 for(Employee e:lstall) {
			 pw.println("<tr><td>"+e.getEmpId()+"</td><td>"+e.getEmpName()+"</td><td>"+e.getEmpSalary()+"</td></tr>");
		 }
		 pw.print("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
