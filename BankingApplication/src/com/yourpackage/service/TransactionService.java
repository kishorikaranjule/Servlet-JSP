package com.yourpackage.service;

import com.yourpackage.model.Transaction;
import com.yourpackage.util.DatabaseUtil;

import java.util.List;

public class TransactionService {
    public List<Transaction> getLastTenTransactions(String userId) {
        return DatabaseUtil.getLastTenTransactions(userId);
    }

    public void addTransaction(String userId, Transaction transaction) {
        DatabaseUtil.addTransaction(userId, transaction);
    }
}