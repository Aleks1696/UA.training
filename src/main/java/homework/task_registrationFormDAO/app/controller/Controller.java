package homework.task_registrationFormDAO.app.controller;

import homework.task_registrationFormDAO.app.exceptions.NotUniqueInputData;
import homework.task_registrationFormDAO.app.model.Model;
import homework.task_registrationFormDAO.app.view.Messages;
import homework.task_registrationFormDAO.app.view.View;

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
            } catch (NotUniqueInputData e) {
                view.print(e.getMessage());
            }
        }
        view.simplePrint((model.getNote().toString()));
    }
}
