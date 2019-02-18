package homework.block_1_task_regex.app;

import homework.block_1_task_regex.app.controller.Controller;
import homework.block_1_task_regex.app.model.Model;
import homework.block_1_task_regex.app.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
