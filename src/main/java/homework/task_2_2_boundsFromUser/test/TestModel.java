package homework.task_2_2_boundsFromUser.test;

import homework.task_2_2_boundsFromUser.game.Model;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        assertTrue(model.setBounds(lowerBound, upperBound));
        assertEquals(model.getLowerBound(), lowerBound);
        assertEquals(model.getUpperBound(), upperBound);
    }

    @Test
    public void testGenerateRandomNumber() {
        int lowerBound = 0;
        int upperBound = 100;
        model.setBounds(lowerBound, upperBound);

        int randomNumber;
        for (int i = 0; i < 10000; i++) {
            model.generateRandomNumber();
            randomNumber = model.getGeneratedNumber();
            if (!(randomNumber > lowerBound &&
                    randomNumber < upperBound)) {
                fail();
            }
            assertNotEquals(randomNumber, 0);
            assertNotEquals(randomNumber, 100);
        }
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
