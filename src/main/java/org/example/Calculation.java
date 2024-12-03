package org.example;

public class Calculation {
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
            throw new IllegalArgumentException("Division by zero");
        } else {
            return a / b;
        }
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}