// BankingService.java
package com.yourpackage.service;

import com.yourpackage.model.Transaction;
import com.yourpackage.util.DatabaseUtil;

public class BankingService {
    public void processMobileRecharge(String mobileNo, double amount, double rechargeAmount) {
        // Retrieve balance from the database
        double currentBalance = DatabaseUtil.getBalance(mobileNo);

        // Update the balance
        double updatedBalance = currentBalance - rechargeAmount;
        DatabaseUtil.updateBalance(mobileNo, updatedBalance);

        // Store the transaction
        Transaction transaction = new Transaction(mobileNo, updatedBalance, updatedBalance);
        transaction.setMobileNo(mobileNo);
        transaction.setAmount(amount);
        transaction.setRechargeAmount(rechargeAmount);
        // Set other transaction details as needed
        DatabaseUtil.storeTransaction(transaction);
    }
}
