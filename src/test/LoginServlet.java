package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String query = "SELECT * FROM logindetails WHERE username = ? AND password = ?";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validate credentials from database
        boolean isValid = false;
		try {
			isValid = validateCredentials(username, password);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace(); // Handle the exception properly
		}

        if (isValid) {
            // Login successful
            HttpSession session = request.getSession(true); // Create session if not existing
            session.setAttribute("username", username);  // Store faculty ID in session
            // Redirect to a welcome page or relevant resource
            response.sendRedirect("Main.jsp");  // Replace with your desired page
        } else {
            // Login failed
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<h2>Invalid username or password</h2>");
            out.println("<a href='login.html'>Try Again</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private boolean validateCredentials(String username, String password) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            // Replace with your actual database connection details
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pavani1", "root", "Pavani@04");
            stmt = connection.prepareStatement(query);
            stmt.setString(1, username);
            // Hash password before comparison (replace with your hashing logic)
            stmt.setString(2, password); 
            rs = stmt.executeQuery();

            return rs.next();  // Return true if a matching record is found
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
