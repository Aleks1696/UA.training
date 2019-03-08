package homework.task_refactoring.operations;

public class Concatenation implements Operation<String> {
    public String calculate(String a, String b) {
        return a.concat(b);
    }
}