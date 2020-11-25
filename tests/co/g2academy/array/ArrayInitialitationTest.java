package co.g2academy.array;

import co.g2academy.Array.ArrayInitialitation;
import co.g2academy.basic.MyDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayInitialitationTest {

    private ArrayInitialitation array = new ArrayInitialitation();

    @Test
    public void testNameInitialization() {
        String[] actual = array.getNames();
        assertNotNull(actual);
        assertEquals(3, actual.length);
        assertEquals("Giorgino", actual[0]);
    }

    @Test
    public void testSimpleInitialization() {
        String[] actual = array.getSimpleNames();
        assertNotNull(actual);
        assertEquals(3, actual.length);
    }

    @Test
    public void testDatesInitialization() {
        MyDate[] actual = array.getDates();
        assertNotNull(actual);
        assertEquals(3, actual.length);
    }

    @Test
    public void testSimpleDatesInitialization() {
        MyDate[] actual = array.getSimpleDates();
        assertNotNull(actual);
        assertEquals(3, actual.length);
    }
}