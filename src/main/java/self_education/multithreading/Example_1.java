package self_education.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Example_1 {
    public static void main(String[] args) throws InterruptedException {
        List<Test1> threads = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            threads.add(new Test1());
        }
        threads.forEach(Thread::start);
        threads.forEach(Thread::interrupt);
        for (Test1 thread : threads) {
            thread.join();
        }
        System.out.println("finish");
    }
}

class Test1 extends Thread {
    private static volatile int number;

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Thread: " + Thread.currentThread().getId() + " Number: " + number);
            number++;
        }
    }
}

