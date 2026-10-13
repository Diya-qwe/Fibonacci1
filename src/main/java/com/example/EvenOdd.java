
package com.example;

public class EvenOdd {

    public String check(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();

        System.out.println("10 is " + obj.check(10));
        System.out.println("7 is " + obj.check(7));
    }
}
