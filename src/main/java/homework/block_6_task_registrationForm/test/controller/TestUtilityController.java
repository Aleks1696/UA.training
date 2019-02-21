package homework.block_6_task_registrationForm.test.controller;

import homework.block_6_task_registrationForm.app.controller.Regex;
import homework.block_6_task_registrationForm.app.controller.UtilityController;
import homework.block_6_task_registrationForm.app.view.Messages;
import homework.block_6_task_registrationForm.app.view.View;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class TestUtilityController {

    private UtilityController utilityController;

    @Before
    public void setUp() {
        String nameFromUser = "ніколя_:)";
        utilityController = new UtilityController(new View(), new Scanner(nameFromUser));
    }

    @Test
    public void inputValueWithScanner() {
        assertEquals(utilityController.inputValueWithScanner(
                Messages.NICK_NAME_MESSAGE, Regex.UA_NICK_NAME_REGEX), "ніколя_:)");
    }
}