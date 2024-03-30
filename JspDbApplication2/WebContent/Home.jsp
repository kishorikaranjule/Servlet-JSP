<!--   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="Register.jsp">Registration</a><br>
<a href="Login.jsp">Login</a><br>
<a href="Search.jsp">SearchRecord</a><br>
<a href="DisplayServlet">DisplayAll</a>
</body>
</html>-->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Navigation</title>

    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">

    <style>
        /* Custom styles */
        body {
            padding: 20px;
        }

        a {
            display: block;
            margin-bottom: 10px;
            color: #007bff; /* Bootstrap primary color */
        }

        a:hover {
            text-decoration: none;
        }
    </style>
</head>
<body>
    <a href="Register.jsp">Registration</a>
    <a href="Login.jsp">Login</a>
    <a href="Search.jsp">Search Record</a>
    <a href="DisplayServlet">Display All</a>

    <!-- Bootstrap JS and Popper.js (optional) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
