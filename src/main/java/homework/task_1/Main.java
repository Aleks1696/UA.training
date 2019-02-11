package homework.task_1;

/**
 * Created by Borodavka Oleksandr 07.02.2019
 */

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
