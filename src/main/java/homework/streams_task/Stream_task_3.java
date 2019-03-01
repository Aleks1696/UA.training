package homework.streams_task;

import java.util.stream.IntStream;

public class Stream_task_3 {
    public static void main(String[] args) {
        int [] array = new int[] {4, 0, 76, -4, 0, -92, 22, 50, 0, -34};
        getCountOfZeroElements(array);
    }

    private static void getCountOfZeroElements(int [] array) {
        long count = IntStream.of(array).filter(i -> i == 0).count();
        System.out.println(count);
    }
}
