package homework.block_1_task_regex.controller;

import homework.block_1_task_regex.view.Messages;
import homework.block_1_task_regex.view.View;

import java.util.Scanner;

public class UtilityController {

    private View view;
    private Scanner scanner;

    public UtilityController(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public String inputValueWithScanner(String message, String regex) {
        String result;
        view.print(message);
        while (!(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            view.print(Messages.ERROR_MESSAGE);
        }
        return result;
    }
}
