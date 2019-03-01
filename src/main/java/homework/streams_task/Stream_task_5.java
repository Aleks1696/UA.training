package homework.streams_task;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream_task_5 {
    public static void main(String[] args) {
        int number = 4;
        int[] array = new int[]{4, 0, 76, -4, 0, -92, 22, 50, 0, -34};
        multiplyArrayElement(array, number);
    }

    private static void multiplyArrayElement(int[] array, int number) {
        IntStream.range(0, array.length)
                .forEachOrdered(i -> array[i] *= number);
        System.out.println(Arrays.toString(array));
    }
}
