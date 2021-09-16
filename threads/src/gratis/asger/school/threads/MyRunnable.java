package gratis.asger.school.threads;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.printf("Hello from thread %s\n",
                Thread.currentThread().getName());
    }
}
