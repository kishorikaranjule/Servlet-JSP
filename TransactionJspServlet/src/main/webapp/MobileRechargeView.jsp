<!-- MobileRechargeView.jsp -->
<html>
<head>
    <title>Mobile Recharge</title>
</head>
<body>
    <form action="ConfirmDetails.jsp" method="post">
        Mobile Number: <input type="text" name="mobileNo" required><br>
        Amount: <input type="text" name="amount" required><br>
        Recharge Amount: <input type="text" name="rechargeAmount" required><br>
        <input type="submit" value="Pay">
    </form>
</body>
</html>