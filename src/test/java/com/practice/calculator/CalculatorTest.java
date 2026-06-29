package com.practice.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(3, calc.subtract(5, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(24, calc.multiply(4, 6));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calc.divide(10, 4), 0.0001);
    }

    @Test
    void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }
}
