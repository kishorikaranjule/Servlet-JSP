// DatabaseUtil.java
package com.yourpackage.util;

import java.util.HashMap;
import java.util.Map;

import com.yourpackage.model.Transaction;

public class DatabaseUtil {
    private static Map<String, Double> balances = new HashMap<>();
    private static Map<String, Transaction> transactions = new HashMap<>();

    static {
        // Initialize sample data (replace with actual database interactions)
        balances.put("user123", 1000.0);
        balances.put("user456", 500.0);
    }

    public static double getBalance(String mobileNo) {
        // Retrieve balance from the database (replace with actual database interactions)
        return balances.getOrDefault(mobileNo, 0.0);
    }

    public static void updateBalance(String mobileNo, double newBalance) {
        // Update balance in the database (replace with actual database interactions)
        balances.put(mobileNo, newBalance);
    }

    public static void storeTransaction(Transaction transaction) {
        // Store transaction in the database (replace with actual database interactions)
        transactions.put(transaction.getMobileNo(), transaction);
    }
}
