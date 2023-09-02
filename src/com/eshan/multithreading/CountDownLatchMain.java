package com.eshan.multithreading;

import java.util.concurrent.CountDownLatch;

class AnotherThread extends Thread {
    private CountDownLatch latch;

    public AnotherThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Current thread :"+Thread.currentThread().getName());
        latch.countDown();
    }
}

public class CountDownLatchMain {
    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(4);

        AnotherThread anotherThread1 = new AnotherThread(latch);
        AnotherThread anotherThread2 = new AnotherThread(latch);
        AnotherThread anotherThread3 = new AnotherThread(latch);
        AnotherThread anotherThread4 = new AnotherThread(latch);

        anotherThread1.start();
        anotherThread2.start();
        anotherThread3.start();
        anotherThread4.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-----------------------------------");
        System.out.println("Inside main thread : "+Thread.currentThread().getName());
    }
}