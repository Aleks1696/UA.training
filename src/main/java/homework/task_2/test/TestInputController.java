package homework.task_2.test;

import static org.junit.Assert.*;

import homework.task_2.game.Model;
import homework.task_2.game.controller.Controller;
import homework.task_2.game.controller.InputController;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestInputController {

    private static Controller controller;

    @BeforeClass
    public static void initializeModel() {
        controller = new Controller();
    }

    @Test
    public void testInputValidationOnRangePositive(){
        String input1 = "14 - 18";
        String input2 = "14- 18";
        String input3 = "04 - 1007";
        String input4 = "-4 - 1007";
        String input5 = "89 - -499";
        assertTrue(InputController.inputValidation(input1, controller.rangeRegex));
        assertTrue(InputController.inputValidation(input2, controller.rangeRegex));
        assertTrue(InputController.inputValidation(input3, controller.rangeRegex));
        assertTrue(InputController.inputValidation(input4, controller.rangeRegex));
        assertTrue(InputController.inputValidation(input5, controller.rangeRegex));
    }

    @Test
    public void testInputValidationOnRangeNegative(){
        String input1 = " - 18";
        String input2 = "14  18";
        String input3 = "04 - ";
        String input4 = "";
        String input5 = "89499";
        assertFalse(InputController.inputValidation(input1, controller.rangeRegex));
        assertFalse(InputController.inputValidation(input2, controller.rangeRegex));
        assertFalse(InputController.inputValidation(input3, controller.rangeRegex));
        assertFalse(InputController.inputValidation(input4, controller.rangeRegex));
        assertFalse(InputController.inputValidation(input5, controller.rangeRegex));
    }

    @Test
    public void testInputValidationOnNumberPositive(){
        String input1 = "56";
        String input2 = "09";
//        String input3 = "-32";
        String input4 = "32452314";
//        String input5 = "89.3";
        assertTrue(InputController.inputValidation(input1, controller.isNumber));
        assertTrue(InputController.inputValidation(input2, controller.isNumber));
//        assertTrue(InputController.inputValidation(input3, controller.isNumber));
        assertTrue(InputController.inputValidation(input4, controller.isNumber));
//        assertTrue(InputController.inputValidation(input5, controller.isNumber));
    }



}
