package co.g2academy.array;

import co.g2academy.Array.ArrayEnhancedLoop;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayEnhancedLoopTest {
        private ArrayEnhancedLoop array = new ArrayEnhancedLoop();

    @Test
    public void testSumAllItemInArrayOfInteger() {
        int actual = array.calculateSumOfAllItem();
        assertEquals(30, actual);
    }

    @Test
    public void testMultiplicationAllItemInArrayOfInteger() {
        int actual = array.calculateMultiplication();
        assertEquals(2400, actual);
    }

    @Test
    public void testAverageAllItem() {
        int actual = array.calculateAverage();
        assertEquals(6,actual);
    }
}