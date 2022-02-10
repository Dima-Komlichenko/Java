package mains;

public class MyThread2 extends Thread {
    private int value;

    public MyThread2(int value) {
        this.value = value;
    }

    public void run() {
        while ((this.value >= 0)) {
            System.out.println("*** The thread"
                    + Thread.currentThread().getName()
                    + "started with" + this.value);
            while (this.value >= 0) {
                System.out.println("From " + Thread.currentThread().getName()
                        + " value = " + this.value);
                this.value -= 1;
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
}
