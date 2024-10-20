<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Faculty</title>
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
        }
        form {
            max-width: 400px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
            color: #333;
        }
        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #f44336;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #d32f2f;
        }
        a {
            display: block;
            text-align: center;
            text-decoration: none;
            color: white;
            font-weight: bold;
            padding: 5px 10px;
            border: 1px solid #836953;
            border-radius: 5px;
            transition: background-color 0.3s;
            margin: 20px auto;
            width: fit-content;
        }
        a:hover {
            background-color: #0056b3;
            color: #fff;
        }
        nav {
            background-color: #836953;
            /* Vertically center items */
        }
        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            text-align: center; /* Center align the list items */
        }
        nav ul li.crud {
            display: inline-block;
            margin: 0 10px;
        }
        nav h1 {
            list-style-type: none;
            color: white;
            margin: 0;
            padding: 0;
            text-align: center; /* Center align the list items */
        }
    </style>
</head>
<body>
    <!-- Navigation bar -->
    <nav>
        <h1>Faculty Management System</h1>
        <ul>
            <li class="crud"><a href="addFaculty.jsp">Add Faculty</a></li>
            <li class="crud"><a href="viewFaculty.jsp">View Faculty</a></li>
            <li class="crud"><a href="updateFaculty.jsp">Update Faculty</a></li>
            <li class="crud"><a href="deleteFaculty.jsp">Delete Faculty</a></li>
        </ul>
    </nav>
    
    <h2>Delete Faculty</h2>
    <form action="DeleteFacultyServlet" method="post">
        <label for="faculty_id">Faculty ID:</label>
        <input type="text" id="faculty_id" name="faculty_id" required><br><br>
        <input type="submit" value="Delete Faculty">
    </form>
    <a href="Main.jsp">Go to Home</a>
</body>
</html>
