package com.example;

public class Fibonacci {

    public static int[] generateFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Number of terms cannot be negative"
            );
        }

        int[] series = new int[n];
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            series[i] = a;

            int c = a + b;
            a = b;
            b = c;
        }

        return series;
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci Series:");

        for (int number : generateFibonacci(n)) {
            System.out.print(number + " ");
        }
    }
}