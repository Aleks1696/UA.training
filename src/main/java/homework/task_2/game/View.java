package homework.task_2.game;

public class View {

    public static final String HELLO_MESSAGE = "Welcome to 'Greater or Less' game!";
    public static final String GAME_STARTED_MESSAGE = "Ok, let's start. Try to guess now. (Bounds: [%d - %d])";
    public static final String TRY_AGAIN_MESSAGE = "Try again (Bounds: [%d - %d])";
    public static final String WRONG_NUMBER_FORMAT_MESSAGE = "Wrong number format";
    public static final String NUMBER_OUT_OF_BOUNDS_MESSAGE = "Number is out of bounds";
    public static final String CONGRATULATION_MESSAGE = "Congratulations! Attempts: %d " +
            "Entered numbers: %s";

    public void print(String message) {
        System.out.println(message);
    }
}
