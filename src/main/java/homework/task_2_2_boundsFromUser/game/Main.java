package homework.task_2_2_boundsFromUser.game;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model, new View());
        controller.processUser();
    }
}
