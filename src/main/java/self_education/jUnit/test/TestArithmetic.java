package self_education.jUnit.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import self_education.jUnit.main_code.Arithmetic;

public class TestArithmetic {

    private static Arithmetic arithmetic;

    /*BeforeClass allows to initialize object once (one for all tests, unlike @Before)*/
    @BeforeClass
    public static void initializeInstance(){
        arithmetic = new Arithmetic();
    }

    @Test
    public void TestAdditionPositive(){
        assertEquals(arithmetic.addition(5., 5.7), 10.7, 0.00001);
    }

    @Test
    public void TestAdditionNegative(){
        assertNotEquals(arithmetic.addition(5.09, 2), 7);
    }

    @Test
    public void TestSubtractionPositive(){
        assertNotEquals(arithmetic.subtraction(0b11, 4), -1);
    }

    @Test
    public void TestDivisionPositive(){
        assertEquals(arithmetic.division(5, 2), 2);
    }

    @Test(expected = ArithmeticException.class)
    public void TestDivisionNegative(){
        arithmetic.division(6, 0);
    }

    @Test
    public void TestArrayCopyPositive(){
        int [] array = {3,7,4,8,1,1};
        assertArrayEquals(arithmetic.arrayCopy(array), array);
    }

    @Test
    public void TestCharacterInBytes(){
        char c = 'c';
        assertEquals(arithmetic.characterInBytes(c), Integer.toBinaryString(c));
    }

    @Test (timeout = 2000)
    public void TestObjectCreationPositive(){
        assertNotNull(arithmetic.objectCreation());
    }



}
