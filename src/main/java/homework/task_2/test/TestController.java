package homework.task_2.test;

import static org.junit.Assert.*;

import homework.task_2.game.Controller;
import homework.task_2.game.Model;
import homework.task_2.game.View;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Scanner;

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
}
