package com.eshan.multithreading;

public class DeadLock {
    public static void main(String[] args) {
        String lock1 = "LOCK 1";
        String lock2 = "LOCK 2";
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Inside Thread 1 - Lock 1");
                    /* DEADLOCK */
                    synchronized (lock2){
                        System.out.println("Inside Thread 1 - Lock 2");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("Inside Thread 2 - Lock 2");
                    /* DEADLOCK */
                    synchronized (lock1){
                        System.out.println("Inside Thread 2 - Lock 1");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Inside main method");
    }
}
