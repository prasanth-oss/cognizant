
package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(10, calculator.multiply(2, 5));
    }



}
