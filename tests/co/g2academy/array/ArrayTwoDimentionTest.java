package co.g2academy.array;

import co.g2academy.Array.ArrayTwoDimention;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTwoDimentionTest {
        ArrayTwoDimention array = new ArrayTwoDimention();

    @Test
    public void testArrayTwoDimention() {
        int [][] actual = array.getTwoDim();
        assertNotNull(actual);
        assertEquals(4, actual.length); // length of rows
        assertEquals(5, actual[0].length); // columns length
        assertEquals(5, actual[1].length);
        assertNull(actual[2]);
        assertNull(actual[3]);
    }

    @Test
    public void testNonRectangular() {
        int [][] actual = array.getNonRect();
        assertNotNull(actual);
        assertEquals(4, actual.length);
        assertEquals(2, actual[0].length);
        assertNotNull(actual[3]);
    }
}