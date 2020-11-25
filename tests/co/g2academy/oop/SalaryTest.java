package co.g2academy.oop;

import org.junit.Test;

import java.util.EnumMap;

import static org.junit.Assert.*;

public class SalaryTest {

    @Test
    public void  testPolymorphismInMethod() {
        Employee employee = new Employee("syifa", "jakarta", 4700);
        String actual = employee.mailCheck();
        assertEquals("Mailing a check to syifa jakarta", actual);

        Employee salary = new Salary("syifa", "jakarta",117,4700);
        actual = employee.mailCheck();
        assertEquals("Within mailCheck of Salary class. Mailing a check to syifa jakarta", actual);
    }

    @Test
    public void testAVoidSettingSalaryToNegativeValue(){
        Salary salary = new Salary("syifa", "jakarta",117, 4700);
        salary.setSalary(-1);
        double actual = salary.getSalary();
        assertEquals(Double.valueOf(4700), Double.valueOf(actual));
    }
}