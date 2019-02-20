package homework.exceptions.part_1;

public class ExceptionExample18 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }
}
