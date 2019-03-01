package homework.streams_task;

import java.util.stream.IntStream;

public class Stream_task_2 {
    public static void main(String[] args) {
        int [] array = new int[] {4, 34, 76, -4, 0, -92, 22, 55, 12, -34};
        getMinElement(array);
    }

    private static void getMinElement(int [] array) {
        IntStream.range(0, array.length)
                .filter(i -> array[i] == IntStream.of(array).min().getAsInt())
                .forEach(i -> System.out.println("Index: " + i + ", Value: " + array[i]));
    }
}
