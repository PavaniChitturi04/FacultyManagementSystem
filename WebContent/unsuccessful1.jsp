<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Updating Faculty</title>
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
        padding: 5px 10px;
        border: 1px solid #007bff;
        border-radius: 5px;
        transition: background-color 0.3s;
        margin: 0 auto;
        width: fit-content; /* Make the link width fit its content */
    }
    a:hover {
        background-color: #007bff;
        color: #fff;
    }
</style>
</head>
<body>
    <h1>Error Updating Faculty</h1>
    <p>An error occurred while updating the faculty member in the database. Please try again later.</p>
    <p><a href="updateFaculty.jsp">Go to Update Faculty</a></p>
</body>
</html>
