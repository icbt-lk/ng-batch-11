/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.my.rest.app.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author icbt
 */
public class MySQLUtils implements DBUtils {

    static final String DB_URL = "jdbc:mysql://localhost/batch_11";
    static final String USER = "root";
    static final String PASS = "";

    @Override
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                students.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getString("dateOfBirth")));
            }
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }

        return students;
    }

    @Override
    public Student getStudent(int id) {
        Student student = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE id=" + id);
            if (rs.next()) {
                student = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("dateOfBirth"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }

        return student;
    }

    @Override
    public boolean addStudent(Student st) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a prepared statement with an SQL query to insert a new student
            String query = "INSERT INTO students (id, name, dateOfBirth) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, st.getId());
            pstmt.setString(2, st.getName());
            pstmt.setString(3, st.getDateOfBirth());

            // Execute the insert query
            int rowsAffected = pstmt.executeUpdate();

            // Close resources
            pstmt.close();
            conn.close();

            // Check if the insert was successful (1 row affected means success)
            return rowsAffected == 1;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();  // Handle or log the exception properly
            return false;
        }
    }

    @Override
    public boolean updateStudent(Student st) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a prepared statement with an SQL query to update a student
            String query = "UPDATE students SET name=?, dateOfBirth=? WHERE id=?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, st.getName());
            pstmt.setString(2, st.getDateOfBirth());
            pstmt.setInt(3, st.getId());

            // Execute the update query
            int rowsAffected = pstmt.executeUpdate();

            // Close resources
            pstmt.close();
            conn.close();

            // Check if the update was successful (1 row affected means success)
            return rowsAffected == 1;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();  // Handle or log the exception properly
            return false;
        }
    }

    @Override
    public boolean deleteStudent(int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a prepared statement with an SQL query to delete a student
            String query = "DELETE FROM students WHERE id=?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);

            // Execute the delete query
            int rowsAffected = pstmt.executeUpdate();

            // Close resources
            pstmt.close();
            conn.close();

            // Check if the delete was successful (1 row affected means success)
            return rowsAffected == 1;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();  // Handle or log the exception properly
            return false;
        }
    }

}
