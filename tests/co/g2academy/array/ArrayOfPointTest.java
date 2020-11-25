package co.g2academy.array;

import co.g2academy.Array.ArrayOfPoint;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class ArrayOfPointTest {

    @Test
    public void testCreateArrayPoint() {
        ArrayOfPoint arrayOfPoint = new ArrayOfPoint();
        Point[] actual = arrayOfPoint.createArray();

        assertNotNull(actual);
        assertEquals(10, actual.length);
        assertEquals(0, actual[0].x);
        assertEquals(1, actual[0].y);
        assertEquals(9, actual[9].x);
        assertEquals(10, actual[10].y);
    }
}