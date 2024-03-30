<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="mydiv">
<form action="LoginController">
User Name <input type="text" name="uname"></br>
Password <input type="text" name="pass"></br>

<input type="submit" value="Click Me">

</form>
</div>

<%!String str=null; %>

<%
if(!session.isNew()){
	Object o=session.getAttribute("msg");
	str=o.toString();

%>
<h1 style="color: red;"><%=str%></h1>
<%}
session.invalidate();
%>
</body>
</html>