package com.example;
import com.example.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest2 {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator instance created");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator instance destroyed");
    }

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int result = calculator.add(a, b);
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 4;
        int result = calculator.subtract(a, b);
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() {
        int a = 7;
        int b = 6;
        int result = calculator.multiply(a, b);
        assertEquals(42, result);
    }
}


