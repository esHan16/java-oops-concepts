package com.eshan.multithreading;

public class WaitAndNotify {
    public static int balance = 0;
    public void withdrawal(int amount) {
        synchronized (this){
            System.out.println("Amount of Rs."+amount+" is getting deducted from account");
            if(balance <= 0){
                try {
                    System.out.println("##### WAITING FOR UPDATED BALANCE #####");
                    wait();
//                    wait(6000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            balance = balance - amount;
            System.out.println("Amount of Rs."+amount+" deducted from account. Current Balance is = "+balance);
        }
    }
    public void deposit(int amount){
        System.out.println("Amount of Rs."+amount+" is getting deposited in the account ");
        synchronized (this){
            notify();
            balance = balance + amount;
            System.out.println("Amount of Rs."+amount+" deposited inside account. Current Balance is = "+balance);
        }
    }

    public static void main(String[] args) {
        WaitAndNotify bank = new WaitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bank.withdrawal(3000);
            }
        });
        thread1.setName("Thread - 1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                bank.deposit(2000);
            }
        });
        thread2.setName("Thread - 2");
        thread2.start();
    }
}
