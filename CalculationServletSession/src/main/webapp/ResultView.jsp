<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%Calculation cal=null;%>

<%
cal=(Calculation)session.getAttribute("result");
%>
<h1>
<%cal.getNum1()%>
</h1>

<h1>
<%cal.getNum2()%>
</h1>

<h1>
<%cal.getResult()%>
</h1>


</body>
</html>