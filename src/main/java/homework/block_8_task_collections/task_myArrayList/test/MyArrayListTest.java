package homework.block_8_task_collections.task_myArrayList.test;

import homework.block_8_task_collections.task_myArrayList.MyArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {
    MyArrayList<Integer> myArrayList;

    @Before
    public void initialization() {
        myArrayList = new MyArrayList<>();
    }

    @Test
    public void size() {
        assertEquals(0, myArrayList.size());
        myArrayList.add(5);
        myArrayList.add(5);
        myArrayList.add(6);
        assertEquals(3, myArrayList.size());
    }

    @Test
    public void capacity() {
        assertEquals(10, myArrayList.capacity());
        myArrayList = new MyArrayList<>(89);
        assertEquals(89, myArrayList.capacity());
    }

    @Test
    public void get() {
       for (int i = 0; i < 40; i++) {
           myArrayList.add(i);
           assertEquals(i, myArrayList.get(i));
       }
    }

    @Test
    public void add() {
        for (int i = 0; i < 80; i++) {
            myArrayList.add(i);
            assertEquals(i, myArrayList.get(i));
        }
        assertEquals(80, myArrayList.size());
    }

    @Test
    public void remove() {
        for (int i = 0; i < 40; i++) {
            myArrayList.add(i);
        }
        myArrayList.remove(34);
        assertEquals(39, myArrayList.size());
        myArrayList.remove(0);
        assertNotEquals(0, myArrayList.get(0));
    }
}