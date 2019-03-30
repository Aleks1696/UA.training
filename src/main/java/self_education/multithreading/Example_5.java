package self_education.multithreading;

import java.util.concurrent.*;

public class Example_5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        SinOfNumber operation = new SinOfNumber(0d);
        ScheduledFuture<Double> result = service.schedule(operation, 3, TimeUnit.SECONDS);
        try {
            Double res = result.get();
            System.out.println(res);
        } catch (IllegalArgumentException | ExecutionException ex) {
            System.out.println(ex.getCause());
        } finally {
            service.shutdown();
        }
    }
}

class SinOfNumber implements Callable<Double> {
    private Double number;

    public SinOfNumber(Double number) {
        this.number = number;
    }

    @Override
    public Double call() throws Exception {
        if (number <= 0) {
            throw new IllegalArgumentException("Number less then or equal 0");
        }
        return Math.sin(number);
    }
}
