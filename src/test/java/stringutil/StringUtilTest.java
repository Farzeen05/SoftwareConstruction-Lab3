/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package stringutil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    private final StringUtil util = new StringUtil();

    @Test
    void testPalindromeTrue() {
        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    void testPalindromeCaseInsensitive() {
        assertTrue(util.isPalindrome("RaceCar"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(util.isPalindrome("hello"));
    }

    @Test
    void testNullInput() {
        assertFalse(util.isPalindrome(null));
    }

    @Test
    void testEmptyString() {
        assertTrue(util.isPalindrome(""));
    }
}