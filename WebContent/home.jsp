<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <style>
        /* Styles for the navigation bar */
        nav {
            background-color: #836953;
            padding: 10px 20px; /* Add padding to separate login details */
            display: flex;
            justify-content: space-between; /* Align items with space between */
            align-items: center; /* Vertically center items */
        }
        nav h1 {
            color: #fff;
            margin: 0;
        }
        nav .login-details {
            color: #fff;
            text-align: right;
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
        .red-text {
            color: #836953; /* Sets text color to red */
        }
    </style>
</head>
<body>
    <!-- Navigation bar -->
    <nav><p style="text-align: right;">
        <h1><a href="" class="red-text">kjdkschbhcgvbxhcvbxvnbnxcbsdcx</a>Faculty Management System</h1>
        </p>
        <div class="login-details">
            <!-- Place your login details here -->
            Hello, <%= session.getAttribute("username") %>!
        </div>
    </nav>
    <!-- Navigation links -->
    <nav><p style="text-align: center;">
        <ul>
            <li><a href="addFaculty.jsp">Add Faculty</a></li>
            <li><a href="viewFaculty.jsp">View Faculty</a></li>
            <li><a href="updateFaculty.jsp">Update Faculty</a></li>
            <li><a href="deleteFaculty.jsp">Delete Faculty</a></li>
        </ul>
       </p>
    </nav>
</body>
</html>
