<%-- <%@page import="java.util.LinkedList"%>
<%@page import="com.model.Register"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</body>
	<a href="DisplayServlet"></a>
<table>
<tr>
<td></td>
</tr>
</table>



</html> --%>

<%@page import="java.util.LinkedList"%>
<%@page import="com.model.Register"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Display Page</title>

    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">

    <style>
        /* Custom styles */
        body {
            padding: 20px;
        }

        table {
            width: 100%;
            margin-top: 20px;
        }

        table, td {
            border-collapse: collapse;
        }

        td {
            padding: 10px;
        }
    </style>
</head>
<body>

    <a href="DisplayServlet" class="btn btn-primary">Go to Display Servlet</a>

    <table class="table table-bordered">
        <tr>
            <td>Column 1</td>
            <td>Column 2</td>
            <!-- Add more columns as needed -->
        </tr>
        <tr>
            <td>Data 1</td>
            <td>Data 2</td>
            <!-- Add more data rows as needed -->
        </tr>
    </table>

    <!-- Bootstrap JS and Popper.js (optional) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>
