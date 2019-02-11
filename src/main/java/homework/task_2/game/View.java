package homework.task_2.game;

public class View {

    public static final String HELLO_MESSAGE = "Welcome to 'Greater or Less' game";
    public static final String RANGE_MESSAGE = "Enter numbers range (example: 20-68) or 'default'";
    public static final String GAME_STARTED_MESSAGE = "Ok, try to guess now. (Range: %d - %d)";
    public static final String WRONG_NUMBER_FORMAT_MESSAGE = "Wrong number format.";
    public static final String GREATER_MESSAGE = "Greater";
    public static final String LESS_MESSAGE = "Less";
    public static final String ALREADY_ENTERED_NUMBERS_MESSAGE = "You have already tried: ";
    public static final String CONGRATULATION_MESSAGE = "Congratulation!!! Attempts: %d ";

    public void print(String ... messages){
        for (String s : messages) {
            System.out.println(s);
        }
    }
}
