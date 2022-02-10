package mains;

public class MyThread4 extends Thread {

    protected MyResource counter = null;

    public MyThread4(MyResource counter) {
        this.counter  = counter;
    }

    public void run() {
        for (int i = 0; i <= 10000; i++) {
            counter.add(i);
        }
    }
}
