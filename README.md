# Faculty Management System

## Introduction
The **Faculty Management System** is a Java-based application designed to manage a list of faculty members using CRUD (Create, Read, Update, Delete) operations. It uses **JDBC** (Java Database Connectivity) to interact with a **MySQL** database. The system allows administrators to add, view, update, and delete faculty records such as faculty name, department, and salary.

## Features
- **Create**: Add a new faculty member to the system.
- **Read**: View details of all faculty members.
- **Update**: Modify existing faculty member information.
- **Delete**: Remove a faculty member from the system.

## Technologies Used
- **Java**: Programming language used for application development.
- **JDBC**: For database connectivity between the Java application and MySQL.
- **MySQL**: Relational database management system for storing faculty records.
- **MySQL Workbench**: (Optional) for managing and interacting with the MySQL database.

## Prerequisites
To run this project, the following software is required:
1. **Java Development Kit (JDK)**: Ensure that JDK 8 or higher is installed.
2. **MySQL**: Install MySQL server to create and manage the database.
3. **MySQL Connector for Java (JDBC Driver)**: Download and add the MySQL JDBC driver to the project classpath.
4. **IDE**: Use an IDE like Eclipse, IntelliJ IDEA, or NetBeans to run the Java application (optional).
5. **MySQL Workbench**: (Optional) for managing the database via a graphical interface.

## Database Setup
1. **Create Database**: Create a database named `faculty_management` in MySQL.
    ```sql
    CREATE DATABASE faculty_management;
    ```
   
2. **Create Table**: Inside the `faculty_management` database, create a table `faculty` to store faculty information.
    ```sql
    CREATE TABLE faculty (
        id INT AUTO_INCREMENT PRIMARY KEY,
        faculty_name VARCHAR(100),
        department VARCHAR(50),
        salary DECIMAL(10, 2)
    );
    ```

## Project Setup
1. **Clone or Download the Project**: Download or clone this repository to your local machine.
   
2. **Database Configuration**:
    - Open the project and locate the file where the JDBC connection is established (e.g., `DatabaseConnection.java`).
    - Modify the database connection string with your MySQL credentials:
      ```java
      String url = "jdbc:mysql://localhost:3306/faculty_management";
      String username = "your_username";  // Replace with your MySQL username
      String password = "your_password";  // Replace with your MySQL password
      ```

3. **Add MySQL Connector (JAR)**: Download the MySQL Connector JAR file and add it to your project's classpath or dependencies.

## Running the Project
1. Compile the Java files in your IDE or through the terminal using `javac`.
2. Run the main class (`FacultyManagementSystem.java`) from your IDE or via terminal:
    ```bash
    java FacultyManagementSystem
    ```
3. You can now perform various CRUD operations on the faculty database using the command-line interface (CLI).

## CRUD Operation Examples

- **Add a New Faculty Member**:
    The system will prompt you to enter the faculty name, department, and salary, which will be saved in the database.

- **View All Faculty Members**:
    The system will fetch and display all records from the `faculty` table.

- **Update Faculty Information**:
    You can select a faculty member based on their ID and update their details, such as name, department, or salary.

- **Delete a Faculty Member**:
    You can delete a faculty member by specifying their ID.

## Code Overview

### 1. Database Connection (`DatabaseConnection.java`)
This class establishes a connection to the MySQL database using JDBC.

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/faculty_management";
        String username = "your_username";
        String password = "your_password";
        return DriverManager.getConnection(url, username, password);
    }
}
