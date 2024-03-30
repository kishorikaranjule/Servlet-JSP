<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="CalculationController">
<table>
<tr><td>Number1: </td><td><input type="text" name="num1"></td></tr>
<tr><td>Number2: </td><td><input type="text" name="num2"></td></tr>
<tr><td><input type="submit" value="Click here"></td></tr>

</table>
</form>
<%!Calculation calci=null; %>
<%if(!session.isNew()){
	calci=(Calculation)session.getAttribute("data");//key
	session.invalidate();
	%>
<table border="3px">
<tr>
<td><%=calci.getNum1() %></td>
<td><%=calci.getNum2() %></td>
<td><%=calci.getResult() %>></td>
</tr>

</table>
<%} %>
</body>
</html>