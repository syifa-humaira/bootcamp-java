package co.g2academy.array;

import co.g2academy.Array.ArrayOfClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOfClassTest {
    @Test
    public void testCreateArray() {

        ArrayOfClass arrayOfClass = new ArrayOfClass();
        char [] actual = arrayOfClass.createArray();
        assertNotNull(actual);
        assertEquals(26,actual.length);
        assertEquals('A', actual[0]);
        assertEquals('Z', actual[25]);
    }
}