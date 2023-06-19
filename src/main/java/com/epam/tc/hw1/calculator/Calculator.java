package com.epam.tc.hw1.calculator;

public final class Calculator {
    public int sum(final int a, final int b) {
        return a + b;
    }

    public int subtract(final int a, final int b) {
        return a - b;
    }

    public int multiply(final int a, final int b) {
        return a * b;
    }

    public double divide(final double a, final double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
