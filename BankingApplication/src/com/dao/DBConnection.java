package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con=null;
	public static Connection myConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","123456789");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}

}
