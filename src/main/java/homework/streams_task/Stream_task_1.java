package homework.streams_task;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_task_1 {
    public static void main(String[] args) {
        int [] array = new int[] {4, 34, 76, -4, 0, 92, 22};
        getAverageSimpleMethod(array);
        getAverageDifficultMethod(array);
    }

    private static void getAverageSimpleMethod(int [] array) {
        IntStream.of(array).average().ifPresent(System.out::println);
    }

    private static void getAverageDifficultMethod(int [] array) {
        double average = IntStream.of(array)
                .mapToObj(n -> n)
                .collect(Collectors.summarizingInt(Integer::intValue))
                .getAverage();
        System.out.println(average);
    }
}
