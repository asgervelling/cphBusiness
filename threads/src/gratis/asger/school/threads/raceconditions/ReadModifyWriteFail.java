package gratis.asger.school.threads.raceconditions;

/** Not thread safe. The two threads modify the same value in CPU register. */
public class ReadModifyWriteFail {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread0 = new Thread(getRunnable(counter, "Thread 0 count: "));
        Thread thread1 = new Thread(getRunnable(counter, "Thread 1 count: "));

        thread0.start();
        thread1.start();
    }

    private static Runnable getRunnable(Counter counter, String message) {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incAndGet();
            }
            System.out.println(message + counter.get());
        };
    }
}
