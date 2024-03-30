package add.calculation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		 String str1=request.getParameter("number1");
		 String str2=request.getParameter("number2");
		 
		 int num1=Integer.parseInt(str1);
		 int num2=Integer.parseInt(str2);
		 int Add=num1+num2;
		 
		 PrintWriter pw=response.getWriter();
		 pw.println("<h1>Number 1 is: "+num1+"</h1>");
		 pw.println("<h1>Number 2 is: "+num2+"</h1>");
		 
		 pw.println("<h1>Addition is: "+Add+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
