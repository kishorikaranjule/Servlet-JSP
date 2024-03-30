<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>User Balance</h1>
    <c:if test="${not empty user}">
        <p>User ID: ${user.userId}</p>
        <p>Balance: ${user.balance}</p>
    </c:if>

</body>
</html>