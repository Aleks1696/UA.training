package homework.block_6_task_registrationForm.app;

import homework.block_6_task_registrationForm.app.controller.Controller;
import homework.block_6_task_registrationForm.app.model.Model;
import homework.block_6_task_registrationForm.app.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
