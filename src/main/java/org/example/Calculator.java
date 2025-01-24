package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("divide by 0 not allowed");
        }
        return a / b;
    }

    public double squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take the square root of a negative number");
        }
        return Math.sqrt(a);
    }
    public double powerOfTwo(int a) {
        return Math.pow(a, 2);
    }
    public double sin(double angleInRadians) {
        return Math.sin(angleInRadians);
    }

    public double cos(double angleInRadians) {
        return Math.cos(angleInRadians);
    }
    public int convertToDecimal(String number, int base) {
        if (base < 2 || base > 36) {
            throw new IllegalArgumentException("Base must be between 2 and 36");
        }
        return Integer.parseInt(number, base);
    }

}

