package homework.task_refactoring.operations;

public class Addition implements Operation<Integer> {
    public Integer calculate(Integer a, Integer b) {
        return a + b;
    }
}