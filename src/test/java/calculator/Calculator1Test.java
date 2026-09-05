/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class Calculator1Test {
    private Calculator1 calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator1();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(7, 3));
        assertEquals(0, calculator.add(-3, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(4, calculator.subtract(10, 6));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void testPower() {
        assertEquals(8.0, calculator.power(2, 3), 0.01);
        assertEquals(1.0, calculator.power(5, 0), 0.01);
    }

    @Test
    void testModulus() {
        assertEquals(1, calculator.modulus(10, 3));
    }

    @Test
    void testModulusByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.modulus(10, 0));
    }
}