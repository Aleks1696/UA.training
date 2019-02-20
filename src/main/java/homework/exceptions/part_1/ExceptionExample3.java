package homework.exceptions.part_1;

public class ExceptionExample3 {
    public static void main(String[] args) {
        Error err = new StackOverflowError();
        throw err;
//        >> Runtime: StackOverFlowError
    }
}
