package mains;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        /*MyThread1 t1 = new MyThread1();
        t1.setDaemon(true); // указывает потоку закрыться при закрытии основного потока
        //t1.setPriority(Thread.MIN_PRIORITY);
        t1.start(); // запустить поток
        int laps = 10000;
        while (laps > 0)
        {
            System.out.print(".");
            laps--;
        }*/



       /* int v = new Random().nextInt(10);
        MyThread2 t2 = new MyThread2(v);
        t2.setDaemon(true);
        v = new Random().nextInt(10);
        MyThread2 t22 = new MyThread2(v);
        t22.setDaemon(true);
        t2.start();
        t22.start();

        while (t2.isAlive()) {}
        try {
            Thread.sleep(5000);
            t2.join(10000);
            t22.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/



        /*int v = new Random().nextInt(10);
        MyThread3 r4 = new MyThread3(v);
        Thread t4 = new Thread(r4);
        t4.setDaemon(true);
        v = new Random().nextInt(10);
        MyThread3 r5 = new MyThread3(v);
        Thread t5 = new Thread(r4);
        t5.setDaemon(true);
        t4.start();
        t5.start();
        t5.interrupt();

        try {
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        /*int limit = 10000;
        IncThread t6 = new IncThread(limit);
        DecThread t7 = new DecThread(limit);
        t6.start();
        t7.start();

        try{
            t6.join();
            t7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter = " + counter);*/

        /*MyResource counter = new MyResource();
        Thread t1 = new MyThread4(counter);
        Thread t2 = new MyThread4(counter);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter : " + counter.getCounter());*/


        ExecutorService ex1 = Executors.newSingleThreadExecutor();
        ExecutorService ex2 = Executors.newFixedThreadPool(10);
        ExecutorService ex3 = Executors.newScheduledThreadPool(10);

        ex1.execute(() -> {
            String threadName = Thread.currentThread().getName();
            try {
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from " + threadName);
        });
    }

    public static int counter = 100000;

    public static Object locker = new Object();
}
