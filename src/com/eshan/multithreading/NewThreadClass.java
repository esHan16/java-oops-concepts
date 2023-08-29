package com.eshan.multithreading;

public class NewThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from :"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new NewThreadClass().start();

    }
}
