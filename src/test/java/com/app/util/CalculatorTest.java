package com.app.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Calculator class.
 */
class CalculatorTest {

    private Calculator calculator;

    /**
     * Initializes a new Calculator instance before each test.
     */
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    /**
     * Tests addition of two positive numbers.
     */
    @Test
    void add_TwoPositiveNumbers_ReturnsSum() {
        assertEquals(10, calculator.add(4, 6), "4 + 6 should equal 10");
    }

    /**
     * Tests addition of a positive and a negative number.
     */
    @Test
    void add_PositiveAndNegativeNumber_ReturnsCorrectSum() {
        assertEquals(2, calculator.add(5, -3), "5 + (-3) should equal 2");
    }

    /**
     * Tests addition of two negative numbers.
     */
    @Test
    void add_TwoNegativeNumbers_ReturnsSum() {
        assertEquals(-7, calculator.add(-4, -3), "-4 + (-3) should equal -7");
    }

    /**
     * Tests addition where one operand is zero.
     */
    @Test
    void add_NumberAndZero_ReturnsSameNumber() {
        assertEquals(5, calculator.add(5, 0), "5 + 0 should equal 5");
        assertEquals(-3, calculator.add(0, -3), "0 + (-3) should equal -3");
    }

    /**
     * Tests addition with large numbers to check for overflow.
     */
    @Test
    void add_LargeNumbers_DoesNotOverflow() {
        assertEquals(2_147_483_647, calculator.add(1_073_741_823, 1_073_741_824),
                "Large numbers should add correctly");
    }
}
