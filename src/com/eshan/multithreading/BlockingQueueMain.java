package com.eshan.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> gueue) {
        this.queue = gueue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                queue.put(BlockingQueueMain.counter++);
                System.out.println("Producer Thread queue current value : "+BlockingQueueMain.counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;
    public Consumer(ArrayBlockingQueue<Integer> gueue) {
        this.queue = gueue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(5000);
                queue.take();
                BlockingQueueMain.counter--;
                System.out.println("Consumer Thread queue current value : "+BlockingQueueMain.counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class BlockingQueueMain {
    public static int counter = 0;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Thread thread1 = new Thread(producer);
        Consumer consume = new Consumer(queue);
        Thread thread2 = new Thread(consume);
        thread1.start();
        thread2.start();
    }
}
