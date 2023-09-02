package com.eshan.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread {
    String name;

    public SomeThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting thread : "+name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Ended : "+name);
    }
}
public class ThreadPool {
    public static void main(String[] args) {

        SomeThread someThread1 = new SomeThread("Thread 1");
        SomeThread someThread2 = new SomeThread("Thread 2");
        SomeThread someThread3 = new SomeThread("Thread 3");
        SomeThread someThread4 = new SomeThread("Thread 4");
        SomeThread someThread5 = new SomeThread("Thread 5");
        SomeThread someThread6 = new SomeThread("Thread 6");
        SomeThread someThread7 = new SomeThread("Thread 7");
        SomeThread someThread8 = new SomeThread("Thread 8");
        SomeThread someThread9 = new SomeThread("Thread 9");
        SomeThread someThread10 = new SomeThread("Thread 10");
        SomeThread someThread11 = new SomeThread("Thread 11");
        SomeThread someThread12 = new SomeThread("Thread 12");
        SomeThread someThread13 = new SomeThread("Thread 13");
        SomeThread someThread14 = new SomeThread("Thread 14");
        SomeThread someThread15 = new SomeThread("Thread 15");
        SomeThread someThread16 = new SomeThread("Thread 16");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // This will ensure that only 2 thread execute at a time.

        executorService.execute(someThread1);
        executorService.execute(someThread2);
        executorService.execute(someThread3);
        executorService.execute(someThread4);
        /*
        executorService.execute(someThread5);
        executorService.execute(someThread6);
        executorService.execute(someThread7);
        executorService.execute(someThread8);
        executorService.execute(someThread9);
        executorService.execute(someThread10);
        executorService.execute(someThread11);
        executorService.execute(someThread12);
        executorService.execute(someThread13);
        executorService.execute(someThread14);
        executorService.execute(someThread15);
        executorService.execute(someThread16);
        */

        executorService.shutdown(); // For shutdown the executor service

        /*
        someThread1.start();
        someThread2.start();
        someThread3.start();
        someThread4.start();
        someThread5.start();
        someThread6.start();
        someThread7.start();
        someThread8.start();
        someThread9.start();
        someThread10.start();
        someThread11.start();
        someThread12.start();
        someThread13.start();
        someThread14.start();
        someThread15.start();
        someThread16.start();
        */

    }
}
