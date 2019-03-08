package homework.task_refactoring;

import homework.task_refactoring.operations.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("result is: " + calculate(6,4, new Addition()));
        System.out.println("result is: " + calculate(6,4, new Subtraction()));
        System.out.println("result is: " + calculate(6,4, new Multiplication()));
        System.out.println("result is: " + calculate(6,4, new Division()));
        System.out.println("result is: " + calculate("6", "4", new Concatenation()));
    }

    public static <T> T calculate(T a, T b, Operation<T> operation) {
        return operation.calculate(a, b);
    }
}