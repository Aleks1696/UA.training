package homework.exceptions.part_2;

public class ExceptionExample26 {
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (Exception e) {
            System.out.println("caught");
        }
    }
}
