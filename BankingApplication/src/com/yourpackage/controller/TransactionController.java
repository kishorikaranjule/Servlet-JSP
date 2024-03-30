// TransactionController.java
package com.yourpackage.controller;

import com.yourpackage.model.Transaction;
import com.yourpackage.service.TransactionService;
import com.yourpackage.service.UserService;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/transactions")
public class TransactionController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private TransactionService transactionService;

    public void init() {
        transactionService = new TransactionService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userId = request.getParameter("userId");

        if (userId != null) {
            List<Transaction> transactions = transactionService.getLastTenTransactions(userId);
            request.setAttribute("transactions", transactions);
            request.getRequestDispatcher("/WEB-INF/views/lastTenTransactions.jsp").forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userId = request.getParameter("userId");
        double amount = Double.parseDouble(request.getParameter("amount"));

        Transaction transaction = new Transaction("Mobile Recharge", amount, new Date());
        transactionService.addTransaction(userId, transaction);

        // Assuming you have an instance of UserService
        UserServiceImpl userService = new UserServiceImpl();

        // Update balance after the transaction
        double newBalance = userService.updateBalance(userId, transaction.getAmount());

        response.sendRedirect(request.getContextPath() + "/transactions?userId=" + userId);
    }
}
