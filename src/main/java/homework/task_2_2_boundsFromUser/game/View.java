package homework.task_2_2_boundsFromUser.game;

public class View {

    public static String ASK_FOR_BOUNDS_MESSAGE = "Would you like to specify bounds? (yes/no)";
    public static String ENTER_BOUND_MESSAGE = "Please enter lower and then upper bound";
    public static String WRONG_BOUNDS_MESSAGE = "Lower bound can not be higher or equal to upper bound!";
    public static String HELLO_MESSAGE = "Welcome to 'Greater or Less' game!";
    public static String GAME_STARTED_MESSAGE = "Ok, let's start. Try to guess now. (Bounds: [%d - %d])";
    public static String TRY_AGAIN_MESSAGE = "Try again (Bounds: [%d - %d])";
    public static String WRONG_NUMBER_FORMAT_MESSAGE = "Wrong number format";
    public static String NUMBER_OUT_OF_BOUNDS_MESSAGE = "Number is out of bounds";
    public static String CONGRATULATION_MESSAGE = "Congratulations! Attempts: %d " +
            "Entered numbers: %s";

    public void print(String message) {
        System.out.println(message);
    }
}
