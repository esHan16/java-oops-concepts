package com.eshan.multithreading;

class Bank {
    public static int balance = 20000;
    public void withdrawal(int amount){
        System.out.println("Amount of Rs."+amount+" is getting withdrawal");
        if(balance <= 0 || balance < amount){
            synchronized (this){
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Program Got Interrupted!!");
                    System.out.println("Withdrawal Successful");
                    balance = balance - amount;
                    System.out.println("Current Balance : "+balance);
//                    return;
                }
            }
        } else {
            System.out.println("Withdrawal Successful");
            balance = balance - amount;
            System.out.println("Current Balance : "+balance);
        }
    }
    public void deposit(int amount){
        System.out.println("Rs. "+amount+" is getting deposited inside account");
        balance = balance + amount;
        System.out.println("Current balance is Rs."+balance);
    }
}

public class Interrupt {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bank.withdrawal(1000);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
//        if(Bank.balance <= 0){
//            thread.interrupt();
//        }
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                bank.deposit(2000);
                thread1.interrupt();
            }
        });
        thread2.start();
    }
}
