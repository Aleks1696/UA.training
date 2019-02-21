package homework.block_6_task_registrationForm.app.controller;

import homework.block_6_task_registrationForm.app.view.Messages;
import homework.block_6_task_registrationForm.app.view.View;

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
        while (!(scanner.hasNextLine() && (result = scanner.nextLine()).matches(regex))) {
            view.print(Messages.ERROR_MESSAGE);
        }
        return result;
    }
}
