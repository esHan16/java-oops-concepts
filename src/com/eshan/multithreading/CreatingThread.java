package com.eshan.multithreading;
class MyCounter extends Thread {
    public int threadNo;

    public MyCounter(int counter) {
        this.threadNo = counter;
    }

    @Override
    public void run() {
        countMe();
    }

    public void countMe(){
        for(int i = 1 ; i <= 10 ; i++){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("The value of i is "+i+" and the threadNumber is "+ threadNo);
        }
    }
}
public class CreatingThread {
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);

        long startTime = System.currentTimeMillis();
        counter1.start();
        System.out.println("--------------------------");
        counter2.start();
        try {
            Thread.sleep(4501);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time required : "+(endTime - startTime));
    }
}
