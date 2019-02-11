package homework.task_2.game;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int DEFAULT_LOWER_BOUND = 0;
    private int DEFAULT_UPPER_BOUND = 100;
    private int lowerBound;
    private int upperBound;

    private int number;

    private List<Integer> inputHistoryList = inputHistoryList = new ArrayList<>();

    public int generateRandomNumber() {
        DEFAULT_UPPER_BOUND -= DEFAULT_LOWER_BOUND;
        number = (int) (Math.random() * ++DEFAULT_UPPER_BOUND) + DEFAULT_LOWER_BOUND;
        return number;
    }

    public int generateRandomNumber(int lowerBound, int upperBound){
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        upperBound -= lowerBound;
        number = (int) (Math.random() * ++upperBound) + lowerBound;
        return number;
    }

    public void writeInputToHistory(int inputNumber) {
        inputHistoryList.add(inputNumber);
    }

    public List<Integer> getInputHistoryList() {
        return inputHistoryList;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public int getNumber() {
        return number;
    }

    public int getDEFAULT_LOWER_BOUND() {
        return DEFAULT_LOWER_BOUND;
    }

    public int getDEFAULT_UPPER_BOUND() {
        return DEFAULT_UPPER_BOUND;
    }
}
