<!-- ConfirmDetails.jsp -->
<%@ page import="com.yourpackage.model.Transaction" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String mobileNo = request.getParameter("mobileNo");
    double amount = Double.parseDouble(request.getParameter("amount"));
    double rechargeAmount = Double.parseDouble(request.getParameter("rechargeAmount"));

    Transaction transaction=new Transaction();
    //transaction.setMobileNo(mobileNo);
    transaction.setMobileNo(mobileNo);
    transaction.setAmount(amount);
    transaction.setRechargeAmount(rechargeAmount);
    // Set other transaction details as needed
%>
<html>
<head>
    <title>Payment Confirmation</title>
</head>
<body>
    <h1>Payment Successful</h1>
    <p>Transaction Details:</p>
    <p>Mobile Number: <%= transaction.getMobileNo() %></p>
    <p>Amount: <%= transaction.getAmount() %></p>
    <p>Recharge Amount: <%= transaction.getRechargeAmount() %></p>
    <!-- Add other transaction details as needed -->
</body>
</html>
