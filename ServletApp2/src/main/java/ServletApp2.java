

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletApp2
 */
@WebServlet("/ServletApp2")
public class ServletApp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletApp2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str=request.getParameter("fname");
		PrintWriter pw=response.getWriter();
		
		String str1=request.getParameter("lname");
		PrintWriter pw1=response.getWriter();
		
		String str2=request.getParameter("psw");
		PrintWriter pw2=response.getWriter();
		
		String str3=request.getParameter("email");
		PrintWriter pw3=response.getWriter();
		
		pw.println("<h1>My First Name: <h1>"+str);
		pw1.println("<h1>My Last Name: <h1>"+str1);
		pw2.println("<h1>My Password: <h1>"+str2);
		pw3.println("<h1>My gmail: <h1>"+str3);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
