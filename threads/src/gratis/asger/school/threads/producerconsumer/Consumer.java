package gratis.asger.school.threads.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<String> queue = null;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String element = this.queue.take();
                System.out.println("Consumed " + element);
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted.");
                e.printStackTrace();
            }
        }
    }
}
