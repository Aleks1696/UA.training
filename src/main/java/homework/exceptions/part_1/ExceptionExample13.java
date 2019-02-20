package homework.exceptions.part_1;

public class ExceptionExample13 {
    public static void main(String[] args) throws Exception {
        RuntimeException exception = new RuntimeException();
        exception.printStackTrace();
        try {
            System.out.println(" 0");
            if (true) {throw new Exception();}
            System.err.print(" 1");
        }/* catch (Error e) {

        }*/ catch (RuntimeException e) {
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
}
