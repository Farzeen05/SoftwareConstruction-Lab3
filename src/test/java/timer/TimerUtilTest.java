/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package timer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimerUtilTest {
    private final TimerUtil timer = new TimerUtil();

    @Test
    void testNormalCase() {
        assertEquals(15, timer.secondsBetween(10, 25));
    }

    @Test
    void testBoundaryZero() {
        assertEquals(0, timer.secondsBetween(0, 0));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> timer.secondsBetween(20, 10));
    }
}