package homework.task_2.test;

import static org.junit.Assert.*;

import homework.task_2.game.Model;
import homework.task_2.game.controller.Controller;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestController {

    private static Controller controller;
    private static Model model;

    @BeforeClass
    public static void initializeController(){
        controller = new Controller();
        model = new Model();
    }

    @Test
    public void testParseNumbersFromString(){
        String input1 = "14 - 69";
        String input2 = "04 -9";
        String input3 = "1-99887";
        String input4 = "243 - 69";
//        String input5 = "-14 - -69";
        assertArrayEquals(controller.parseNumbersFromString(input1), new int[]{14, 69});
        assertArrayEquals(controller.parseNumbersFromString(input2), new int[]{4, 9});
        assertArrayEquals(controller.parseNumbersFromString(input3), new int[]{1, 99887});
        assertArrayEquals(controller.parseNumbersFromString(input4), new int[]{243, 69});
//        assertArrayEquals(controller.parseNumbersFromString(input5), new int[]{-14, -69});
    }

    //NullPointer - view and model are not initialized
    @Test
    public void testCheckNumber(){
        int number = 8;
        int generatedNumber1 = 9;
        int generatedNumber2 = 8;
        int generatedNumber3 = 4;
        assertEquals(controller.checkNumber(number, generatedNumber1), false);
        assertEquals(controller.checkNumber(number, generatedNumber2), true);
        assertEquals(controller.checkNumber(number, generatedNumber3), false);

    }



}
