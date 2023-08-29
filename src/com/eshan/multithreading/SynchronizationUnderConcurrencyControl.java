package com.eshan.multithreading;

public class SynchronizationUnderConcurrencyControl {
    public static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    SynchronizationUnderConcurrencyControl.counter++;
                }
                System.out.println("Loop inside thread 1 is over");
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    SynchronizationUnderConcurrencyControl.counter++;
                }
                System.out.println("Loop inside thread 2 is over");
            }
        });


        /** the output will be zero because we are printing the value of counter before the complete iteration over
         * thread for this reason we have applied a sleep method over thread*/
        thread1.start();
        thread2.start();
        Thread.sleep(2000);
        System.out.println("The value of counter is "+SynchronizationUnderConcurrencyControl.counter);
        /**
         * Here as we can see the value of counter is not same all the time and is changing ,
         * because the counter is being shared by both the thread simultaneously at the same time.
         * And whenever two thread working on common data there will be inconsistency
         * The solution is Synchronization
         */
    }
}
