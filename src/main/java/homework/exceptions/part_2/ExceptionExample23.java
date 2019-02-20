package homework.exceptions.part_2;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample23 {
    public static void main(String[] args) throws IOException, InterruptedException {
        f0();
        f1();
        f2();

        f3();
    }
    public static void f0() throws EOFException {}
    public static void f1() throws FileNotFoundException {}
    public static void f2() throws InterruptedException {}

    public static void f3() throws RuntimeException {}
}
