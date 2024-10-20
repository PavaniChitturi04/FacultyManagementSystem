package test;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet("/ViewFacultyServlet")
public class ViewFacultyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pavani1", "root", "Pavani@04");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM faculty");
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Employee List</title>");
            out.println("<style>");
            out.println("table {");
            out.println("    border-collapse: collapse;");
            out.println("    width: 100%;");
            out.println("}");
            out.println("th, td {");
            out.println("    border: 1px solid #dddddd;");
            out.println("    text-align: left;");
            out.println("    padding: 8px;");
            out.println("}");
            out.println("th {");
            out.println("    background-color: #f2f2f2;");
            out.println("}");
            out.println("nav {");
            out.println("    background-color: #836953;");
            out.println("    padding: 10px 20px; /* Add padding to separate login details */");
            out.println("    display: flex;");
            out.println("    justify-content: space-between; /* Align items with space between */");
            out.println("    align-items: center; /* Vertically center items */");
            out.println("}");
            out.println("nav h1 {");
            out.println("    color: #fff;");
            out.println("    margin: 0;");
            out.println("}");
            out.println("nav .login-details {");
            out.println("    color: #fff;");
            out.println("    text-align: right;");
            out.println("}");
            out.println("nav ul {");
            out.println("    list-style-type: none;");
            out.println("    margin: 0;");
            out.println("    padding: 0;");
            out.println("    text-align: center;");
            out.println("}");
            out.println("nav ul li {");
            out.println("    display: inline;");
            out.println("    margin: 0 10px;");
            out.println("}");
            out.println("nav ul li a {");
            out.println("    color: #fff;");
            out.println("    text-decoration: none;");
            out.println("}");
            out.println(".red-text {");
            out.println("    color: #836953; /* Sets text color to red */");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav>");
            out.println("<p style=\"text-align: right;\">");
            out.println("<h1><a href=\"\" class=\"red-text\">kjdkschbhcgvbxhcvbxvnbnxcbsdcx</a>Employee Management System</h1>");
            out.println("</p>");
            out.println("<div class=\"login-details\">");
            out.println("Hello, " + request.getSession().getAttribute("username") + "!");
            out.println("</div>");
            out.println("</nav>");

            // Output the second navigation links
            out.println("<nav>");
            out.println("<p style=\"text-align: center;\">");
            out.println("<ul>");
            out.println("<li><a href=\"addFaculty.jsp\">Add Employee</a></li>");
            out.println("<li><a href=\"viewFaculty.jsp\">View Employee</a></li>");
            out.println("<li><a href=\"updateFaculty.jsp\">Update Employee</a></li>");
            out.println("<li><a href=\"deleteFaculty.jsp\">Delete Employee</a></li>");
            out.println("</ul>");
            out.println("</p>");
            out.println("</nav>");

            out.println("<h2>Employee List</h2>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>ID</th>");
            out.println("<th>Name</th>");
            out.println("<th>Designation</th>");
            out.println("<th>Department</th>");
            out.println("<th>Email</th>");
            out.println("<th>Phone Number</th>");
            out.println("<th>Joining Date</th>");
            out.println("<th>Qualification</th>");
            out.println("</tr>");

            while (resultSet.next()) {
                out.println("<tr>");
                out.println("<td>" + resultSet.getInt("faculty_id") + "</td>");
                out.println("<td>" + resultSet.getString("name") + "</td>");
                out.println("<td>" + resultSet.getString("designation") + "</td>");
                out.println("<td>" + resultSet.getString("department") + "</td>");
                out.println("<td>" + resultSet.getString("email") + "</td>");
                out.println("<td>" + resultSet.getString("phone_number") + "</td>");
                out.println("<td>" + resultSet.getDate("joining_date") + "</td>");
                out.println("<td>" + resultSet.getString("qualification") + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
            out.println("<a href='home.jsp'>Go to home</a>");
            out.println("</body>");
            out.println("</html>");

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle database error
        }
    }
}
