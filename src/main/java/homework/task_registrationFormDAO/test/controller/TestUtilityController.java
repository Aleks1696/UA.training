package homework.task_registrationFormDAO.test.controller;

import homework.task_registrationFormDAO.app.controller.Regex;
import homework.task_registrationFormDAO.app.controller.UtilityController;
import homework.task_registrationFormDAO.app.view.Messages;
import homework.task_registrationFormDAO.app.view.View;
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