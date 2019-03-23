package homework.task_registrationFormDAO.app;

import homework.task_registrationFormDAO.app.controller.Controller;
import homework.task_registrationFormDAO.app.model.Model;
import homework.task_registrationFormDAO.app.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
