// DatabaseUtil.java
package com.yourpackage.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.yourpackage.model.Transaction;

public class DatabaseUtil {
    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String JDBC_USER = "System";
    private static final String JDBC_PASSWORD = "123456789";

    static {
        try {
        	Class.forName("oracle.jdbc.OracleDriver");
        	//con=DriverManager.getConnection("","","");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

	public static List<Transaction> getLastTenTransactions(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void addTransaction(String userId, Transaction transaction) {
		// TODO Auto-generated method stub
		
	}
}
