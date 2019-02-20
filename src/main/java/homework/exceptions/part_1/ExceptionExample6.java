package homework.exceptions.part_1;

public class ExceptionExample6 {
    public static void main(String[] args) {

    }

    public static double sqr(double d) {
        if ((System.currentTimeMillis() & 1) == 0) {
            return 4;
        } else if ((System.currentTimeMillis() & 1) == 1){
            while (true);
        } else {
            throw new RuntimeException();
        }
    }
}
