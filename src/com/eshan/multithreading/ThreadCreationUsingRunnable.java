package com.eshan.multithreading;

import java.util.Random;

class AnotherCounter implements Runnable {
    private int threadNo;
    AnotherCounter(int threadNo){
        this.threadNo = threadNo;
    }
    @Override
    public void run() {
        for (int i = 1 ; i <= 10 ; i++){
            try {
                Thread.sleep(new Random().nextInt(500));
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("The value of i is "+i+" and the threadNumber is "+ threadNo);
        }
    }
}
public class ThreadCreationUsingRunnable {
    public static void main(String[] args) {
        /*
        Thread thread1 = new Thread(new MyCounter(1));
        Thread thread2 = new Thread(new MyCounter(2));
        thread1.start();
        thread2.start();
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1 ; i <= 10 ; i++){
                    try {
                        Thread.sleep(new Random().nextInt(500));
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("The value of i - is "+i);
                }
            }
        }).start();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10 ; i <= 20 ; i++){
                    try {
                        Thread.sleep(new Random().nextInt(500));
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("The value of j -- is "+i);
                }
            }
        });
        thread.start();
    }
}
