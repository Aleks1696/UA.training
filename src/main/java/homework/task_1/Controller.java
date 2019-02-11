package homework.task_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Borodavka Oleksandr 07.02.2019
 */

public class Controller {

    private String REGEX_FIRST_WORD = "Hello";
    private String REGEX_SECOND_WORD = "world";

    private int numberOfWordsCount;

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        model.setFirstWord(inputDataWithScanner(scanner));
        model.setSecondWord(inputDataWithScanner(scanner));

        view.printMessage(View.OUR_INPUT + model.getInputData());
    }

    private String inputDataWithScanner(Scanner scanner) {
        String input;
        boolean wordMatches;
        do {
            if (numberOfWordsCount == 0) {
                view.printMessage(View.ENTER_FIRST_WORD_MESSAGE);
                input = scanner.next();
                wordMatches = wordValidation(input, REGEX_FIRST_WORD);
            } else {
                view.printMessage(View.ENTER_SECOND_WORD_MESSAGE);
                input = scanner.next();
                wordMatches = wordValidation(input, REGEX_SECOND_WORD);
            }

            if (!wordMatches) {
                view.printMessage(View.WRONG_INPUT_MESSAGE);
            }
        } while (!wordMatches);
        numberOfWordsCount++;
        return input;
    }

    private boolean wordValidation(String word, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }
}
