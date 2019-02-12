package homework.task_2.test;

import static org.junit.Assert.*;

import homework.task_2.game.Model;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestModel {

    private Model model;

    @Before
    public void initializeModel() {
        model = new Model();
    }

    @Test
    public void testSetBounds() {
        int lowerBound = 0;
        int upperBound = 100;
        model.setBounds(lowerBound, upperBound);
        assertEquals(model.getLowerBound(), lowerBound);
        assertEquals(model.getUpperBound(), upperBound);
    }

    @Test
    public void testGenerateRandomNumber() {
        int lowerBound = 0;
        int upperBound = 100;
        model.setBounds(lowerBound, upperBound);

        List<Integer> list = new ArrayList<>();
        int randomNumber;
        for (int i = 0; i < 10000; i++) {
            model.generateRandomNumber();
            randomNumber = model.getGeneratedNumber();
            if (!(randomNumber > model.getLowerBound() &&
                    randomNumber < model.getUpperBound())) {
                fail();
            }
            list.add(randomNumber);
        }
        assertTrue(list.contains(1));
        assertTrue(list.contains(99));
        assertFalse(list.contains(0));
        assertFalse(list.contains(100));
    }

    @Test
    public void testCheckNumber() {
        int lowerBound = 0;
        int upperBound = 100;
        model.setBounds(lowerBound, upperBound);
        model.generateRandomNumber();
        int generatedNumber = model.getGeneratedNumber();

        assertFalse(model.checkNumber(generatedNumber));
        assertEquals((int)model.getInputHistoryList().get(0), generatedNumber);
        assertTrue(model.checkNumber(generatedNumber - 1));
        assertEquals((int)model.getInputHistoryList().get(1), generatedNumber - 1);
        assertTrue(model.checkNumber(generatedNumber + 1));
        assertEquals((int)model.getInputHistoryList().get(2), generatedNumber + 1);
    }
}
