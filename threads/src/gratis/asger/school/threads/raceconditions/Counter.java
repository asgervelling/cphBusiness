package gratis.asger.school.threads.raceconditions;

public class Counter {

    private long count = 0;

    /** Critical section */
    public long incAndGet() {
        synchronized (this) {
            this.count++;
            return this.count;
        }

    }

    public long get() {
        return this.count;
    }
}
