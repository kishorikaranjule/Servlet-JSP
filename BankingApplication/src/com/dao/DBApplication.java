package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.model.Login;
import com.model.Register;
public class DBApplication {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public int saveData(List<Register> lst)
	{
		System.out.println("dbsave1");
		int i=0;
		//Account a=lst.get(0);
		Register a=null;
		con=DBConnection.myConnection();
		try
		{
			Iterator<Register> itr=lst.iterator();
			System.out.println("dbsave2");
			while(itr.hasNext())
			{
				System.out.println("dbsave3");
				a=itr.next();
				ps=con.prepareStatement("insert into Registration2 values(?,?,?,?,?)");
				ps.setInt(1,a.getRno());
				ps.setString(2,a.getFname());
				ps.setString(3,a.getPass());
				ps.setString(4,a.getEmail());
				ps.setDouble(5,a.getBal());
				i = ps.executeUpdate();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				con.close();
			} 
			catch (SQLException e) 
			{	
				e.printStackTrace();
			}
		}
		return i;
	}
	public Register searchRecord(int rno){
		Register temp=null;
		List<Register> lst=getAllData();
		for(Register r:lst){
			if(r.getRno()==rno){
				temp=r;
				break;
			}
		}
		return temp;
	}
	public List<Register> getAllData()
	{
		List<Register> lst=new LinkedList<Register>();
		con=DBConnection.myConnection();
		try
		{
		Statement s=
					con.createStatement
					(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_READ_ONLY);
			rs=s.executeQuery("select * from Registration2");
			while(rs.next())
			{
				Register a=new Register();
				a.setRno(rs.getInt(1));
				a.setFname(rs.getString(2));
				a.setPass(rs.getString(3));
				a.setEmail(rs.getString(4));
				a.setBal(rs.getDouble(5));
				lst.add(a);
				System.out.println("cnt");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return lst;
	}
	public boolean validateUser(Login l)
	{
		con=DBConnection.myConnection();
		List<Register> lst=getAllData();
		boolean b=false;
		for(Register r:lst)
		{
			if(r.getRno()==l.getRno())
			{
				if(r.getPass().equals(l.getPass()))
				{
					b=true;
					break;
				}
			}
		}
		return b;
	}
}
