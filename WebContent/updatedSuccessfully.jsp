<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }
    h1 {
        text-align: center;
        color: #5cb85c; /* Green color for success */
    }
    p {
        text-align: center;
        color: #333;
    }
    a {
        display: block;
        text-align: center;
        text-decoration: none;
        color: #007bff; /* Blue color for link */
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
    <h1>Faculty Updated Successfully!</h1>
    <p>Your faculty member has been updated in the database successfully.</p>
    <p><a href="Main.jsp">Go to Home</a></p>
</body>
</html>
