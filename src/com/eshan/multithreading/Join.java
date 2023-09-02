package com.eshan.multithreading;

public class Join {
    static int counter = 0;

    public static void main(String[] args) {
        /*
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1 ; i <= 1000 ; i++){
                    counter++;
                }
            }
        });
        thread1.start();
        try {
            thread1.join(); // join method will join the current thread with the thread with the reference.
            // Impact : The main thread will wait until thread1 completes its execution
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The value of counter is "+counter);
         */

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1 ; i <= 1000 ; i++){
                    counter++;
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for(int i = 1 ; i <= 1000 ; i++){
                    counter++;
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The value of counter is "+counter);
    }
}
