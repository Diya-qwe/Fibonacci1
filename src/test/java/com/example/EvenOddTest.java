
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddTest {

    EvenOdd obj = new EvenOdd();

    @Test
    public void testEvenNumber() {
        assertEquals("Even", obj.check(10));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", obj.check(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", obj.check(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertEquals("Even", obj.check(-4));
    }

    @Test
    public void testNegativeOddNumber() {
        assertEquals("Odd", obj.check(-3));
    }
}
