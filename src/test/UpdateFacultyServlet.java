package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateFacultyServlet")
public class UpdateFacultyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String query = "UPDATE faculty SET name=?, designation=?, department=?, email=?, phone_number=?, joining_date=?, qualification=? WHERE faculty_id=?";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int facultyId = Integer.parseInt(request.getParameter("faculty_id"));
        String name = request.getParameter("name");
        String designation = request.getParameter("designation");
        String department = request.getParameter("department");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phone_number");
        String joiningDateStr = request.getParameter("joining_date");
        String qualification = request.getParameter("qualification");

        // Parse the joining date string into a Date object
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date parsedDate = null;
        try {
            if (joiningDateStr != null && !joiningDateStr.isEmpty()) {
                parsedDate = dateFormat.parse(joiningDateStr);
            }
        } catch (ParseException e) {
            e.printStackTrace(); // Handle parsing error
        }

        // Convert the parsed Date object to a java.sql.Date object
        java.sql.Date joiningDate = null;
        if (parsedDate != null) {
            joiningDate = new java.sql.Date(parsedDate.getTime());
        }

        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/pavani1";
        String username = "root"; // Replace with your database username
        String password = "Pavani@04"; // Replace with your database password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(url, username, password);
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, designation);
                preparedStatement.setString(3, department);
                preparedStatement.setString(4, email);
                preparedStatement.setString(5, phoneNumber);
                preparedStatement.setDate(6, joiningDate); // Use the parsed and converted date
                preparedStatement.setString(7, qualification);
                preparedStatement.setInt(8, facultyId);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    // Successful update
                    response.sendRedirect("updatedSuccessfully.jsp"); // Redirect to a success page
                } else {
                    // Unsuccessful update
                    response.sendRedirect("unsuccessful1.jsp"); // Redirect to an error page
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle exceptions
        }
    }
}
