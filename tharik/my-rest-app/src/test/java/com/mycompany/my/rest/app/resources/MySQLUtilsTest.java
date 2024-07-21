/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.my.rest.app.resources;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author icbt
 */
public class MySQLUtilsTest {
    
    public MySQLUtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getStudents method, of class MySQLUtils.
     */
//    @Test
//    public void testGetStudents() {
//        System.out.println("getStudents");
//        MySQLUtils instance = new MySQLUtils();
//        List<Student> expResult = null;
//        List<Student> result = instance.getStudents();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getStudent method, of class MySQLUtils.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        MySQLUtils instance = new MySQLUtils();
        Student student = new Student(99, "Aryton Senna", "1966");
        
        // Testing Add student
        boolean addResult = instance.addStudent(student);
        assertEquals(true, addResult);

        // Testing get student
        Student result = instance.getStudent(student.getId());
        assertEquals(student.getId(), result.getId());
        assertEquals(student.getName(), result.getName());
        assertEquals(student.getDateOfBirth(), result.getDateOfBirth());
        
        // Testing update student
        student = new Student(99, "Aryton Senna - changed", "1966 - changed");
        boolean updateResult = instance.updateStudent(student);
        assertEquals(true, updateResult);
        result = instance.getStudent(student.getId());
        assertEquals(student.getId(), result.getId());
        assertEquals(student.getName(), result.getName());
        assertEquals(student.getDateOfBirth(), result.getDateOfBirth());
        
        // Testing delete student
        boolean deleteResult = instance.deleteStudent(student.getId());
        assertEquals(true, deleteResult);
        result = instance.getStudent(student.getId());
        assertEquals(null, result);
    }

    /**
     * Test of addStudent method, of class MySQLUtils.
//     */
//    @Test
//    public void testAddStudent() {
//        System.out.println("addStudent");
//        Student st = null;
//        MySQLUtils instance = new MySQLUtils();
//        boolean expResult = false;
//        boolean result = instance.addStudent(st);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateStudent method, of class MySQLUtils.
//     */
//    @Test
//    public void testUpdateStudent() {
//        System.out.println("updateStudent");
//        Student st = null;
//        MySQLUtils instance = new MySQLUtils();
//        boolean expResult = false;
//        boolean result = instance.updateStudent(st);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteStudent method, of class MySQLUtils.
//     */
//    @Test
//    public void testDeleteStudent() {
//        System.out.println("deleteStudent");
//        int id = 0;
//        MySQLUtils instance = new MySQLUtils();
//        boolean expResult = false;
//        boolean result = instance.deleteStudent(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
