package homework.exceptions.part_1;

public class ExceptionExample5 {
    public static void main(String[] args) {
        System.out.println("sout");
        throw new Error();
//        System.out — buffered-поток вывода, а System.err — нет.
    }
}
