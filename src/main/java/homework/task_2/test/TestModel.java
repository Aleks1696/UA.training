package homework.task_2.test;

import static org.junit.Assert.*;

import homework.task_2.game.Model;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestModel {

    private static Model model;

    @BeforeClass
    public static void initializeModel() {
        model = new Model();
    }

    @Test
    public void testGenerateRandomNumberRangeWithoutParam() {
        int lowerBound = 0;
        int upperBound = 100;
        int randomNumber = model.generateRandomNumber();
        if (!(randomNumber >= lowerBound && randomNumber <= upperBound)) {
            fail();
        }
    }

    @Test
    public void testGenerateRandomNumberRangeWithParam() {
        int lowerBound = 10;
        int upperBound = 80;
        int randomNumber = model.generateRandomNumber(lowerBound, upperBound);
        if (!(randomNumber >= lowerBound && randomNumber <= upperBound)) {
            fail();
        }
    }

    @Test
    public void testWriteInputToHistory() {
        int[] inputNumbers = {2, 56, 0, 100, -1, 34, 76, 90, -34};
        for (int i = 0; i < inputNumbers.length; i++) {
            model.writeInputToHistory(inputNumbers[i]);
        }

        List<Integer> inputHistoryList = model.getInputHistoryList();
        int attemptsCount = model.getInputHistoryList().size();
        if (inputHistoryList.size() != inputNumbers.length &&
                inputNumbers.length != attemptsCount) {
            fail();
        } else {
            for (int i = 0; i < inputHistoryList.size(); i++) {
                assertEquals((int) inputHistoryList.get(i), inputNumbers[i]);
            }
        }
    }


}
