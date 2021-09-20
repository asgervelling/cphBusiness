package gratis.asger.school.threads.fibonacci;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Integer> s1;
    private BlockingQueue<Integer> s2;

    public Producer(BlockingQueue<Integer> s1, BlockingQueue<Integer> s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run() {
        calculate();
    }

    private synchronized void calculate() {
        System.out.printf("%s working...\n", Thread.currentThread().getName());
        while (true) {
            try {
                s2.put(fib(s1.take()));
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.printf("%s finished...\n", Thread.currentThread().getName());
    }

    public static int fib(int n) {
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
}

