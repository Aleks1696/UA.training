package homework.task_2.game;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int generatedNumber;
    private int lowerBound;
    private int upperBound;

    private List<Integer> inputHistoryList = new ArrayList<>();

    public void setBounds(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public void generateRandomNumber() {
        generatedNumber = (int) (Math.random() * (upperBound - (lowerBound + 1)) + lowerBound + 1);
    }

    public boolean checkNumber(int number) {
        inputHistoryList.add(number);
        if (number == generatedNumber) {
            return false;
        } else if (number > generatedNumber) {
            upperBound = number;
            return true;
        } else {
            lowerBound = number;
            return true;
        }
    }

    public int getGeneratedNumber() {
        return generatedNumber;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public List<Integer> getInputHistoryList() {
        return inputHistoryList;
    }
}
