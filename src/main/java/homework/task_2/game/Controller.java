package homework.task_2.game;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        view.print(View.HELLO_MESSAGE);
        model.setBounds(Initialization.defaultLowerBound, Initialization.defaultUpperBound);
        model.generateRandomNumber();
        startGame(scanner);
    }

    public void startGame(Scanner scanner) {
        view.print(String.format(View.GAME_STARTED_MESSAGE,
                model.getLowerBound(), model.getUpperBound()));

        while (model.checkNumber(inputNumberFromScanner(scanner))) {
            view.print(String.format(View.TRY_AGAIN_MESSAGE,
                    model.getLowerBound(), model.getUpperBound()));
        }
        view.print(String.format(View.CONGRATULATION_MESSAGE,
                model.getInputHistoryList().size(),
                model.getInputHistoryList().toString()));
    }

    public int inputNumberFromScanner(Scanner scanner) {
        int result = 0;
        while (true) {
            while (!scanner.hasNextInt()) {
                view.print(View.WRONG_NUMBER_FORMAT_MESSAGE);
                scanner.next();
            }
            if ((result = scanner.nextInt()) >= model.getUpperBound() ||
                    result <= model.getLowerBound()) {
                view.print(View.NUMBER_OUT_OF_BOUNDS_MESSAGE);
                continue;
            }
            break;
        }
        return result;
    }
}
