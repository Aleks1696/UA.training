package homework.task_2.game.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputController {

    public static String getInputDataFromUser(Scanner scanner) {
        return scanner.nextLine();
    }

    public static boolean inputValidation(String rangeFromUser, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rangeFromUser);
        return matcher.matches();
    }

}
