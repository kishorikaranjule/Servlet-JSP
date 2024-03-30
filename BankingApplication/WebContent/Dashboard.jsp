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
    <a href="balance.jsp">View Balance</a>
    <a href="Login.jsp">Mobile Rechharge</a>
    <a href="lastTenTransaction.jsp">Last Ten Transaction</a>
     

    <!-- Bootstrap JS and Popper.js (optional) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>