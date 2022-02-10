package mains;

public class MyThread3 implements Runnable {
    public int value;

    public MyThread3(int v) {
        this.value = v;
    }

    @Override
    public void run() {
        int limit = this.value / 2;

        System.out.println("*** The thread"
                + Thread.currentThread().getName()
                + "started with" + this.value);
        while (this.value >= 0) {
            System.out.println("From " + Thread.currentThread().getName()
                    + " value = " + this.value);
            this.value -=1;
            if(this.value >= limit && Thread.currentThread().isInterrupted()) {
                System.out.println("*** The thread is interrupted!!!");
                return;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("*** The thread "
                    + Thread.currentThread().getName()
                    + "has finished");
        }
    }
}
