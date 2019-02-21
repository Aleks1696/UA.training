package homework.block_6_task_registrationForm.app.controller;

import homework.block_6_task_registrationForm.app.exceptions.InputDataIsNotUniqueException;
import homework.block_6_task_registrationForm.app.model.Model;
import homework.block_6_task_registrationForm.app.view.Messages;
import homework.block_6_task_registrationForm.app.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        view.print(Messages.INFO_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        InputController inController = new InputController();
        while (true) {
            inController.getInput(new UtilityController(view, scanner));
            model.createNote(inController.getNickName(), inController.getEmail());
            try {
                model.addNoteToDB();
                break;
            } catch (InputDataIsNotUniqueException e) {
                e.printStackTrace();
                view.simplePrint(String.format(e.getMessage(), e.getEnteredData()));
            }
        }
        view.print((model.getNote().toString()));
    }
}
