package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testFirstFiveTerms() {
        assertArrayEquals(
            new int[]{0, 1, 1, 2, 3},
            Fibonacci.generateFibonacci(5)
        );
    }

    @Test
    public void testFirstSevenTerms() {
        assertArrayEquals(
            new int[]{0, 1, 1, 2, 3, 5, 8},
            Fibonacci.generateFibonacci(7)
        );
    }

    @Test
    public void testOneTerm() {
        assertArrayEquals(
            new int[]{0},
            Fibonacci.generateFibonacci(1)
        );
    }

    @Test
    public void testTwoTerms() {
        assertArrayEquals(
            new int[]{0, 1},
            Fibonacci.generateFibonacci(2)
        );
    }

    @Test
    public void testZeroTerms() {
        assertArrayEquals(
            new int[]{},
            Fibonacci.generateFibonacci(0)
        );
    }

    @Test
    public void testNegativeTerms() {
        assertThrows(
            IllegalArgumentException.class,
            () -> Fibonacci.generateFibonacci(-1)
        );
    }

    @Test
    public void testFirstTenTerms() {
        assertArrayEquals(
            new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34},
            Fibonacci.generateFibonacci(10)
        );
    }
}