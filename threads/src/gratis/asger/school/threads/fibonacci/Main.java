package gratis.asger.school.threads.fibonacci;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Fibonacci fibonacci = new Fibonacci();
        BlockingQueue<Integer> s1 = fibonacci.initS1();
        BlockingQueue<Integer> s2 = new ArrayBlockingQueue<>(s1.size());

        System.out.printf("Going to do fibonacci calculations for this sequence: %s\n",
                queueToString(s1));

        int numThreads = 4;
        Thread[] producers = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            producers[i] = new Thread(new Producer(s1, s2));
        }

        // Start work
        for (Thread thread : producers) {
            thread.start();
        }

        Thread c1 = new Thread(new Consumer(s2));
        c1.start();

        for (Thread thread : producers) {
            thread.join();
        }
        c1.join();

        System.out.println("Results: " + queueToString(s2));
        System.out.println("here");

    }

    public static String queueToString(BlockingQueue<Integer> queue) {
        StringBuilder sb = new StringBuilder();
        for (int i : queue) {
            sb.append(i + ", ");
        }
        return sb.toString();
    }


}
