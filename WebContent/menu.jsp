<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <style>
        nav {
            background-color: #836953;
            padding: 10px 0;
            text-align: center;
        }
        nav h1 {
            color: #fff;
        }
        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            text-align: center;
        }
        nav ul li {
            display: inline;
            margin: 0 10px;
        }
        nav ul li a {
            color: #fff;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <!-- Navigation bar -->
    <nav>
        <h1>Faculty Management System</h1>
        <ul>
            <li><a href="addFaculty.jsp">Add Faculty</a></li>
            <li><a href="viewFaculty.jsp">View Faculty</a></li>
            <li><a href="updateFaculty.jsp">Update Faculty</a></li>
            <li><a href="deleteFaculty.jsp">Delete Faculty</a></li>
        </ul>
    </nav>
</body>
</html>