package homework.task_2_2_boundsFromUser.test;

import homework.task_2_2_boundsFromUser.game.Controller;
import homework.task_2_2_boundsFromUser.game.Model;
import homework.task_2_2_boundsFromUser.game.View;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class TestController {

    private Model model;
    private View view;
    private Controller controller;

    @Before
    public void initialize(){
        model = new Model();
        view = new View();
        controller = new Controller(model, view);
    }

    @Test
    public void testInputNumberFromScanner() {
        int lowerBound = 0;
        int upperBound = 100;
        model.setBounds(lowerBound, upperBound);
        model.generateRandomNumber();

        String inputForScanner = "Text , 56.5  _ 89smth ' 45";
        Scanner scanner = new Scanner(inputForScanner);
        assertEquals(controller.inputNumberFromScanner(scanner), 45);
    }

    @Test
    public void testAskToSetBoundsPositive() {
        String input = "yes y Y YES Yes";
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            assertTrue(controller.askToSetBounds(scanner));
        }
    }

    @Test
    public void testAskToSetBoundsNegative() {
        String input = "yew tru YYY Yee";
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            assertFalse(controller.askToSetBounds(scanner));
        }
    }

    @Test
    public void testInputBoundFromScanner() {
        String input = "56.5 32. 0. dsf ere - , 45 67 8";
        Scanner scanner = new Scanner(input);
        assertEquals(controller.inputBoundsFromScanner(scanner), 45);
        assertEquals(controller.inputBoundsFromScanner(scanner), 67);
        assertEquals(controller.inputBoundsFromScanner(scanner), 8);
    }
}
