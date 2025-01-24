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

    @Test
    void powerOfTwo() {
        assertEquals(25.0, calculator.powerOfTwo(5), "5 squared should be 25");
    }

    @Test
    void sin() {
        assertEquals(0.5, calculator.sin(Math.toRadians(30)), 0.0001, "Sin(30°) should be 0.5");
        assertEquals(1.0, calculator.sin(Math.toRadians(90)), 0.0001, "Sin(90°) should be 1.0");
        assertEquals(0.0, calculator.sin(Math.toRadians(0)), 0.0001, "Sin(0°) should be 0.0");
        assertEquals(-0.5, calculator.sin(Math.toRadians(210)), 0.0001, "Sin(210°) should be -0.5");
    }

    @Test
    void cos() {
        assertEquals(Math.sqrt(3) / 2, calculator.cos(Math.toRadians(30)), 0.0001, "Cos(30°) should be sqrt(3)/2");
        assertEquals(0.0, calculator.cos(Math.toRadians(90)), 0.0001, "Cos(90°) should be 0.0");
        assertEquals(1.0, calculator.cos(Math.toRadians(0)), 0.0001, "Cos(0°) should be 1.0");
        assertEquals(-0.5, calculator.cos(Math.toRadians(120)), 0.0001, "Cos(120°) should be -0.5");
    }
}