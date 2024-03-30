<!-- BalanceView.jsp -->
<%@ page import="com.yourpackage.util.DatabaseUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String mobileNo = "user123"; // Replace with actual user identifier
    double balance = DatabaseUtil.getBalance(mobileNo);
%>
<html>
<head>
    <title>Balance View</title>
</head>
<body>
    <h1>Your Balance: <%= balance %></h1>
</body>
</html>