package homework.block_1_task_regex.test.controller;

import homework.block_1_task_regex.app.controller.Regex;
import homework.block_1_task_regex.app.controller.UtilityController;
import homework.block_1_task_regex.app.view.Messages;
import homework.block_1_task_regex.app.view.View;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class UtilityControllerTest {

    private UtilityController utilityController;

    @Before
    public void setUp() {
        String nameFromUser = "Квітка-Основ'яненко";
        utilityController = new UtilityController(new View(), new Scanner(nameFromUser));
    }

    @Test
    public void inputValueWithScanner() {
        assertEquals(utilityController.inputValueWithScanner(
                Messages.FIRST_NAME_MESSAGE, Regex.UA_NAME_REGEX), "Квітка-Основ'яненко");
    }
}