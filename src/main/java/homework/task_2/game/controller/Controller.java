package homework.task_2.game.controller;

import homework.task_2.game.Model;
import homework.task_2.game.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    private Model model;
    private View view;

    public String rangeRegex = "-?\\d+\\s?-\\s?-?\\d+";
    public String isNumber = "\\d+";

    public Controller() {
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        view.print(View.HELLO_MESSAGE, View.RANGE_MESSAGE);
        boolean boundsSetByUser = setRangesFromUser(scanner);
        if (boundsSetByUser) {
            view.print(String.format(
                    View.GAME_STARTED_MESSAGE,
                    model.getLowerBound(),
                    model.getUpperBound()));
        } else {
            view.print(String.format(
                    View.GAME_STARTED_MESSAGE,
                    model.getDEFAULT_LOWER_BOUND(),
                    model.getDEFAULT_UPPER_BOUND()));
        }
        getNumbers(scanner);
    }

    public boolean setRangesFromUser(Scanner scanner) {
        String rangesFromUser = InputController.getInputDataFromUser(scanner);
        boolean rangeSpecifiedByUser = InputController.inputValidation(rangesFromUser, rangeRegex);
        if (rangeSpecifiedByUser) {
            int [] bounds = parseNumbersFromString(rangesFromUser);
            model.generateRandomNumber(bounds[0], bounds[1]);
            return true;
        } else {
            model.generateRandomNumber();
            return false;
        }
    }

    public int [] parseNumbersFromString(String rangesFromUser) {
        Matcher matcher = Pattern.compile(isNumber).matcher(rangesFromUser);
        int index = 0;
        int [] bounds = new int[2];
        while (matcher.find()) {
            bounds[index] = Integer.parseInt(matcher.group());
            index++;
        }
        return bounds;
    }

    public void getNumbers(Scanner scanner) {
        int generatedNumber = model.getNumber();
        boolean isValidNumber;
        int userNumber;
        boolean solved = false;
        String inputFromUser;
        while (!solved) {
            view.print(View.ALREADY_ENTERED_NUMBERS_MESSAGE, model.getInputHistoryList().toString());
            inputFromUser = InputController.getInputDataFromUser(scanner);
            isValidNumber = InputController.inputValidation(inputFromUser, isNumber);
            if (!isValidNumber) {
                view.print(View.WRONG_NUMBER_FORMAT_MESSAGE);
            } else {
                userNumber = Integer.parseInt(inputFromUser);
                solved = checkNumber(userNumber, generatedNumber);
                model.getInputHistoryList().add(userNumber);
            }
        }
    }

    public boolean checkNumber(int number, int generatedNumber) {
        if (number == generatedNumber) {
            view.print(String.format(View.CONGRATULATION_MESSAGE, model.getInputHistoryList().size() + 1));
            return true;
        } else if (number > generatedNumber) {
            view.print(View.LESS_MESSAGE);
        } else {
            view.print(View.GREATER_MESSAGE);
        }
        return false;
    }
}












