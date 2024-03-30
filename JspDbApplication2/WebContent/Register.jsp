<!-- 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="RegistrationServlet" method="post">
<table border="2" align="center" bgcolor="gray">
	<tr>
		<td>RegNo</td>
		<td><input type="text" name="rno"></td>
	</tr>
	<tr>
		<td>First Name</td>
		<td><input type="text" name="fname"></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="pass"></td>
	</tr>
	<tr>
		<td>Acc Bal</td>
		<td><input type="text" name="bal"></td>
	</tr>
	<tr>
		<td><input type="submit" value="Register"></td>
	</tr>
	
</table>

</form>

</body>
</html>-->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Form</title>

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
        input[type="password"],
        input[type="number"],
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
    </style>
</head>
<body>

    <form action="RegistrationServlet" method="post">
        <table border="2" align="center">
            <tr>
                <td>RegNo</td>
                <td><input type="text" name="rno" pattern="[0-9]+" title="Please enter a valid numeric Reg No" required></td>
            </tr>
            <tr>
                <td>First Name</td>
                <td><input type="text" name="fname" pattern="[A-Za-z]+" title="Please enter a valid name" required></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="pass" pattern=".{6,}" title="Password must be at least 6 characters" required></td>
            </tr>
            <tr>
                <td>Acc Bal</td>
                <td><input type="number" name="bal" pattern="[0-9]+" title="Please enter a valid numeric value" required></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Register"></td>
            </tr>
        </table>
    </form>

    <!-- Bootstrap JS and Popper.js (optional) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
