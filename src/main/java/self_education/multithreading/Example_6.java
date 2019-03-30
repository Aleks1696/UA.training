package self_education.multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Example_6 {
    private static int threads = 2;
    private static int size = 100_000;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int [] array = new int[size*threads];
        Arrays.fill(array, 1);
        ExecutorService service = Executors.newFixedThreadPool(threads);
        List<Future<Integer>> results = new ArrayList<>();
        int offset = 0;
        int result = 0;
        for (int i = 0; i < threads; i++) {
            Counter counter = new Counter(array, offset, size);
            offset += size;
            Future<Integer> future = service.submit(counter);
            results.add(future);
        }
        for (Future<Integer> future : results) {
            result += future.get();
        }
        System.out.println(result);
        service.shutdown();
    }
}

class Counter implements Callable<Integer> {
    private int[] array;
    private int from;
    private int to;

    public Counter(int[] array, int from, int to) {
        this.array = array;
        this.from = from;
        this.to = to;
    }

    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i = from; i < to; i++) {
            result += array[i];
        }
        return result;
    }
}