package gratis.asger.school.threads.fibonacci;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Write Consumer/Producer threads to calculate fibonacci on
 * the integers in s1 (shared) and put them in s2 (shared).
 * */
public class Fibonacci {
    
    public BlockingQueue<Integer> initS1() {
        int[] initialValues = { 4, 5, 8, 12, 21, 22, 34, 35 };
        BlockingQueue<Integer> s1 = new ArrayBlockingQueue<>(8);
        for (int val : initialValues) {
            s1.add(val);
        }
        return s1;
    }
    
}
