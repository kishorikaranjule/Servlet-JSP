package emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import emp.model.Employee;

public class EmployeeDao {
	
	static Connection con=null;
	
	public static Connection myConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456789");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
	public int saveData(Employee eobj) {  //insert data
		Connection con=myConnection();
		int i=0;
		
		try {
			PreparedStatement pstate = con.prepareStatement("insert into emp values(?,?,?)");
			pstate.setInt(1, eobj.getEmpId());
			pstate.setString(2, eobj.getEmpName());
			pstate.setFloat(3, eobj.getEmpSalary());
			i = pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
	
	public List<Employee> searchRecord(int empId){
		ResultSet result=null;
		List<Employee> lstemp=null;
		Connection con=myConnection();
		int i=0;
		
		try {
			System.out.println("empId value "+empId);
			PreparedStatement pstate=con.prepareStatement("select * from emp where emp_Id=?");
			pstate.setInt(1, empId);
			result=pstate.executeQuery();
			
			if(result.next()) {
				System.out.println("hi");
				lstemp=new ArrayList<Employee>();
				lstemp.add(new Employee(result.getInt(1),result.getString(2),result.getFloat(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstemp;
	}
	
	public List<Employee> displayAll(){
		Connection con=myConnection();
		List<Employee> lstall=new LinkedList<Employee>();
		String str="select * from emp";
		
		try {
			Statement state=con.createStatement();
			ResultSet result=state.executeQuery(str);
			while(result.next()) {
				lstall.add(new Employee(result.getInt(1),result.getString(2),result.getFloat(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstall;
	}
	
public int deleteEmployee(int empId) {
	Connection con=myConnection();
	int i=0;
	try {
		PreparedStatement pstate=con.prepareStatement("delete from emp where emp_Id=?");
		pstate.setInt(1, empId);
		i=pstate.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return i;
}
public int updateEmployee(Employee eobj) {
	Connection con=myConnection();
	int i=0;
	try {
		PreparedStatement pstate=con.prepareStatement("update emp set emp_Salary=? where emp_Id=?");
		pstate.setInt(2, eobj.getEmpId());
		pstate.setFloat(1, eobj.getEmpSalary());
	    i=pstate.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return i;
}
	
}