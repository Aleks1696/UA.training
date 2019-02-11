package homework.task_2.game;

import homework.task_2.game.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.startGame();
    }
}
