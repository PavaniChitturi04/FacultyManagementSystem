<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Faculty Management System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        h2 {
            text-align: center;
            color: #333;
            font-size: 40px;
        }
        table {
            margin: 50px auto;
            border-collapse: collapse;
        }
        th, td {
            padding: 50px;
            border: 40px solid #f4f4f4;
            text-align: center;
        }
        th {
            background-color: #007bff;
            color: white;
        }
        a {
            text-decoration: none;
            color: white;
            font-weight: bold;
        }
        a:hover {
            color: #0056b3;
        }
        h3 {
            text-align: center;
            color: #333;
            font-size: 30px;
        }
    </style>
</head>
<body>
    <h3>Hello, <%= session.getAttribute("username") %>!</h3>
    <h2>Welcome to Faculty Management System!</h2>
    
    <table>
        <tr>
            <th><a href="addFaculty.jsp">Add Faculty</a></th>
            <th><a href="viewFaculty.jsp">View Faculty</a></th>
        </tr>
        <tr>
            <th><a href="updateFaculty.jsp">Update Faculty</a></th>
            <th><a href="deleteFaculty.jsp">Delete Faculty</a></th>
        </tr>
    </table>
</body>
</html>
