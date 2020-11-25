package co.g2academy.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsATest {

    @Test
    public void testMammalIsAnAnimal (){
        Animal mammal = new Mammal();
        assertTrue(mammal instanceof Animal);
    }

    @Test
    public void testDogIsAnAnimal (){
        Mammal dog = new Dog();
        assertTrue(dog instanceof Animal);
    }

    @Test
    public void testDogIsAMammal (){
        Dog dog = new Dog();
        assertTrue(dog instanceof Mammal);
    }

}