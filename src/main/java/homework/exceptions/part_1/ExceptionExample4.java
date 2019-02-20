package homework.exceptions.part_1;

public class ExceptionExample4 {
    public static void main(String[] args) {
        f(null);
    }

    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
//        >> Runtime: StackOverFlowError (recursion)
    }
}
