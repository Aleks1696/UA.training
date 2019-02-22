package self_education.patterns.singleton;

public class Singleton {
    public static void main(String[] args) {
        int size = 100;
        Thread[] threads = new Thread[size];
        for (int i = 0; i < size; i++) {
            threads[i] = new Thread() {
                public void run() {
                    SingletonTest.getInstance();
                }
            };
        }
        for (int i = 0; i < size; i++) {
            threads[i].start();
        }
        System.out.println(SingletonTest.getCount());
    }
}

class SingletonTest {
    private static int count = 0;
    private static SingletonTest singleton;

    private SingletonTest() {
        count++;
    }

    public static SingletonTest getInstance() {
        if (singleton == null) {
            synchronized (SingletonTest.class) {
                if (singleton == null) {
                    singleton = new SingletonTest();
                }
            }
        }
        return singleton;
    }

    public static int getCount() {
        return count;
    }
}
