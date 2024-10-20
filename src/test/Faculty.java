package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private int facultyId;
    private String name;
    private String designation;
    private String department;
    private String email;
    private String phoneNumber;
    private Date joiningDate;
    private String qualification;

    // Constructors
    public Faculty() {
    }

    public Faculty(String name, String designation, String department, String email, String phoneNumber, Date joiningDate, String qualification) {
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
    }

    // Getters and Setters
    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    // Method to add a faculty member to the database
    public void addFaculty() throws ClassNotFoundException, SQLException {
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO Faculty (name, designation, department, email, phone_number, joining_date, qualification) VALUES (?, ?, ?, ?, ?, ?, ?)")) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, designation);
            preparedStatement.setString(3, department);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, phoneNumber);
            preparedStatement.setDate(6, joiningDate);
            preparedStatement.setString(7, qualification);

            preparedStatement.executeUpdate();
        }
    }

    // Method to delete a faculty member from the database by ID
    public void deleteFaculty() throws ClassNotFoundException, SQLException {
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection
                     .prepareStatement("DELETE FROM Faculty WHERE faculty_id = ?")) {

            preparedStatement.setInt(1, facultyId);
            preparedStatement.executeUpdate();
        }
    }

    // Method to retrieve all faculty members from the database
    public List<Faculty> getAllFaculty() throws ClassNotFoundException, SQLException {
        List<Faculty> facultyList = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Faculty");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Faculty faculty = new Faculty();
                faculty.setFacultyId(resultSet.getInt("faculty_id"));
                faculty.setName(resultSet.getString("name"));
                faculty.setDesignation(resultSet.getString("designation"));
                faculty.setDepartment(resultSet.getString("department"));
                faculty.setEmail(resultSet.getString("email"));
                faculty.setPhoneNumber(resultSet.getString("phone_number"));
                faculty.setJoiningDate(resultSet.getDate("joining_date"));
                faculty.setQualification(resultSet.getString("qualification"));
                facultyList.add(faculty);
            }
        }
        return facultyList;
    }

	
}
