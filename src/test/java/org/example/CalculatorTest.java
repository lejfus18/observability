package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(7,calculator.add(3,4));
        assertNotEquals(7 , calculator.add(3,3));
    }
    @Test
    void subtract() {
        assertEquals(2,calculator.subtract(4,2));
        assertNotEquals(7 , calculator.subtract(3,3));
    }
    @Test
    void multiply() {
        assertEquals(4,calculator.multiply(2,2));
        assertNotEquals(7 , calculator.multiply(3,3));
    }
    @Test
    void divide() {
        assertEquals(1,calculator.divide(2,2));
        assertNotEquals(7 , calculator.divide(3,3));
    }
    @Test
    void divideBY0() {
        assertThrows(IllegalArgumentException.class , () -> calculator.divide(10 , 0));
    }

    @Test
    void squareRoot() {
        assertEquals(4.0, calculator.squareRoot(16), 0.0001);
        assertEquals(3.0, calculator.squareRoot(9), 0.0001);
    }
}