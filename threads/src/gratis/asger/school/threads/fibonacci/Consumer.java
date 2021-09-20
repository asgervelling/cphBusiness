package gratis.asger.school.threads.fibonacci;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Integer> s2;

    public Consumer(BlockingQueue<Integer> s2) {
        this.s2 = s2;
    }

    @Override
    public void run() {
        int counter = 0;
        long sum = 0;
        int taken = 0;

        while(!s2.isEmpty()){
            try {
                taken = s2.take();
                System.out.println("Fibonacci number:  " + taken);
                sum += taken;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            counter++;
            try {
                // What happens when you
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("here");
        }
        System.out.println("Amount of number retrived: " + counter);
        System.out.println("Sum of Fibonacci numbers: " + sum);
    }


}
