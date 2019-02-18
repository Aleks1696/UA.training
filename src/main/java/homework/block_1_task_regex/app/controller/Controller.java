package homework.block_1_task_regex.app.controller;

import homework.block_1_task_regex.app.model.Model;
import homework.block_1_task_regex.app.view.Messages;
import homework.block_1_task_regex.app.view.View;

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
        inController.getInput(new UtilityController(view, scanner));
        model.createNote(inController.getSurname(), inController.getName(),
                inController.getFamilyName(), inController.getNickName(),
                inController.getCommentary(), inController.getHomePhoneNumber(),
                inController.getMobilePhoneNumber(), inController.getEmail(),
                inController.getSkype());
        model.createNoteBook();
        model.addCurrentNoteToNoteBook();
    }
}
