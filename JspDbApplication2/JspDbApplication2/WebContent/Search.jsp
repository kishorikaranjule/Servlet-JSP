<%-- <%@page import="com.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="SearchController">
		Registration No <input type="text" name="rno"><br> <input
			type="submit" value="search">
	</form>
	<%!
		Register r=null;
	%>
	
	<%
	if(!session.isNew())
	{
      	r=(Register)session.getAttribute("sdata");
      	session.invalidate();
    %>
	<table border="3">
		<tr>
			<td><%=r.getRno()%></td>
			<td><%=r.getFname()%></td>
			<td><%=r.getBal()%></td>
		</tr>
	</table>
	<%} %>
	
</body>
</html>--%>

<%@page import="com.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Search Page</title>

    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">

    <style>
        /* Custom styles */
        body {
            background-color: #f8f9fa; /* Bootstrap background color */
            padding: 20px;
        }

        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #ffffff; /* White background color */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Bootstrap box shadow */
            margin-top: 50px;
        }

        table {
            width: 100%;
        }

        table, td {
            border-collapse: collapse;
            margin-top: 20px;
        }

        td {
            padding: 10px;
        }

        input[type="text"],
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            display: inline-block;
            border: 1px solid #ced4da; /* Bootstrap input border color */
            box-sizing: border-box;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #007bff; /* Bootstrap primary color */
            color: #ffffff; /* White text color */
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3; /* Bootstrap darker primary color on hover */
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        table, th, td {
            border: 1px solid #dee2e6; /* Bootstrap table border color */
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
    <form action="SearchController" method="post">
        Registration No <input type="text" name="rno" pattern="[0-9]+" title="Please enter a valid numeric Reg No" required><br>
        <input type="submit" value="Search">
    </form>

    <%
        Register r = null;
        if (!session.isNew()) {
            r = (Register) session.getAttribute("sdata");
            session.invalidate();
    %>
    <table class="table table-bordered">
        <tr>
            <th>Registration No</th>
            <th>First Name</th>
            <th>Account Balance</th>
        </tr>
        <tr>
            <td><%=r.getRno()%></td>
            <td><%=r.getFname()%></td>
            <td><%=r.getBal()%></td>
        </tr>
    </table>
    <%
        }
    %>
</body>
</html>
