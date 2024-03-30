// PaymentController.java
package com.yourpackage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yourpackage.model.Transaction;
import com.yourpackage.service.BankingService;

@WebServlet("/payment")
public class PaymentController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String mobileNo = request.getParameter("mobileNo");
        double amount = Double.parseDouble(request.getParameter("amount"));
        double rechargeAmount = Double.parseDouble(request.getParameter("rechargeAmount"));

        // Perform the payment logic
        BankingService bankingService = new BankingService();
        bankingService.processMobileRecharge(mobileNo, amount, rechargeAmount);

        // Forward to confirmation page
        request.getRequestDispatcher("/ConfirmDetails.jsp").forward(request, response);
    }
}
