package co.g2academy;

import co.g2academy.basic.exampleOverloading;
import org.junit.Test;

import static org.junit.Assert.*;

public class exampleOverloadingTest {

    @Test
    public void minFunctionInteger() {
        int actual = exampleOverloading.minFunction(11,6);
        assertEquals(6, actual);
    }

    @Test
    public void testMinFunctionDouble() {
        double actual = exampleOverloading.minFunction(7.3, 9.4);
        assertEquals(Double.valueOf(7.3),
        Double.valueOf(actual));
    }
}