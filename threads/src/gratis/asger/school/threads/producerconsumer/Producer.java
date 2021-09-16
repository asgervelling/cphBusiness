package gratis.asger.school.threads.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    BlockingQueue<String> queue = null;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            long timeMillis = System.currentTimeMillis();
            try {
                this.queue.put("" + timeMillis);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted.");
            }
        }
    }
}
