package self_education.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Example_4 {
    private static void check(Calculator calculator) throws InterruptedException {
        List<CalculationThread> calculators = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            CalculationThread thread = new CalculationThread(calculator);
            calculators.add(thread);
            thread.start();
        }
        for (CalculationThread calculationThread : calculators) {
            calculationThread.join();
        }
        System.out.println(calculator);
    }

    public static void main(String[] args) throws InterruptedException {
        check(new VolatileCalculator());
        check(new SynchronizedCalculator());
        check(new AtomicCalculator());
    }
}

interface Calculator {
    void calculate();
}

class VolatileCalculator implements Calculator {
    private volatile int number;

    public void calculate() {
        number++;
    }
    @Override
    public String toString() {
        return "Volatile: " + number;
    }
}

class SynchronizedCalculator implements Calculator {
    private int number;
    public synchronized void calculate() {
        number++;
    }

    @Override
    public String toString() {
        return "Synchronized: " + number;
    }
}

class AtomicCalculator implements Calculator {
    private AtomicInteger number = new AtomicInteger();
    public void calculate() {
        number.getAndIncrement();
    }
    @Override
    public String toString() {
        return "Atomic: " + number;
    }
}

class CalculationThread extends Thread {
    private Calculator calculator;

    public CalculationThread(Calculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
        calculator.calculate();
    }
}
