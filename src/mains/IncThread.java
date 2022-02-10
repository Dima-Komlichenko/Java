package mains;

public class IncThread extends Thread {
    int limit;
    public IncThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 0; i < limit; i++) {
             synchronized (main.locker) {
                 main.counter++;
             }
        }
    }
}
