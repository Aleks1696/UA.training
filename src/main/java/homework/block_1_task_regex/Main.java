package homework.block_1_task_regex;

import homework.block_1_task_regex.controller.Controller;
import homework.block_1_task_regex.model.Model;
import homework.block_1_task_regex.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
