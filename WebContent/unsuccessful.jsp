<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        h1 {
            text-align: center;
            color: #d9534f;
        }
        p {
            text-align: center;
            color: #333;
        }
        a {
            display: block;
            text-align: center;
            text-decoration: none;
            color: #007bff;
            font-weight: bold;
            border: 1px solid #007bff;
            border-radius: 5px;
            transition: background-color 0.3s;
            background-color: #fff;
            margin: 0 auto;
            width: 200px; /* Set a specific width */
        }
        a:hover {
            background-color: #007bff;
            color: #fff;
        }
    </style>
</head>
<body>
    <h1>Error Adding Faculty</h1>
    <p>An error occurred while adding the faculty member to the database. Please try again later.</p>
    <p><a href="addFaculty.jsp">Go to Add Faculty</a></p>
</body>
</html>
