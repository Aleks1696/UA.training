package homework.block_6_task_registrationForm.app.controller;

import homework.block_6_task_registrationForm.app.exceptions.WrongInputDataException;
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
            model.createNote(inController.getSurname(), inController.getName(),
                    inController.getFamilyName(), inController.getNickName(),
                    inController.getCommentary(), inController.getHomePhoneNumber(),
                    inController.getMobilePhoneNumber(), inController.getEmail(),
                    inController.getSkype());
            try {
                model.addNoteToDB();
                break;
            } catch (WrongInputDataException e) {
                e.printStackTrace();
                view.print(String.format(e.getMessage(), e.getEnteredData()));
            }
        }
        System.out.println((model.getNote().toString()));
    }
}
