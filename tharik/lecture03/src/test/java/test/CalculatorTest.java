/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

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
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of sum method, of class Calculator.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int no1 = 2;
        int no2 = 5;
        int expResult = 7;
        int result = Calculator.sum(no1, no2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSum2() {
        System.out.println("sum2");
        int no1 = -2;
        int no2 = 5;
        int expResult = 3;
        int result = Calculator.sum(no1, no2);
        assertEquals(expResult, result);
    }
    
}
