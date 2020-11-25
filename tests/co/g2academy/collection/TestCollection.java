package co.g2academy.collection;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestCollection {

    //test how to use add all method
    @Test
    public void testUsingAddAllMethodInList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Sonoo");
        secondList.add("Hanumat");
        list.addAll(secondList);

        //exxpected result there are 5 items in list
        int actual = list.size();
        assertEquals(5,actual);
    }

    @Test
    public void testUsingRemoveAllMethodInList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");
        list.removeAll(secondList); // untuk mengahpus semua objek yang ada di dalam sebuah data

        //expected result? there are 2 items in list
        int actual = list.size();
        assertEquals(2, actual);
    }

    @Test
    public void testUsingRetainAllMethodInList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");
        secondList.retainAll(list); // untuk menghapus objek, apabila memiliki data yang beririsan antara data 1 dan 2
                                    // maka data tersebut tidak akan terhapus

        //expected result? there are 2 items in list
        int actual = list.size();
        assertEquals(3, actual);
        String actualRavi = list.get(0);
        assertEquals("Ravi", actualRavi);

    }
}
