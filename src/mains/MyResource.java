package mains;

public class MyResource {
    long counter = 0;

    public synchronized void add(long value) {
        this.counter += value;
    }

    public long getCounter() {
        return this.counter++;
    }
}
