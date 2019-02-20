package homework.exceptions.part_1;

public class ExceptionExample20 {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
//            return 0;
            //or
            throw new RuntimeException();
        } finally {
            return 1;
            //or
//            throw new Exception();
        }
    }
}
