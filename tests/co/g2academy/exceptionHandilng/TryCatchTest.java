package co.g2academy.exceptionHandilng;

import org.junit.Test;

public class TryCatchTest {

    @Test
    public void testArithmaticException() {
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of code . . .");
    }

    @Test
    public void testFinallyWhenItHasDifferentFlow() {
        try {
            int data = 50 / 0;
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
       System.out.println("rest of code . . .");
    }
}
