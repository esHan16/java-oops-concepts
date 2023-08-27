package com.eshan.collectionFramework;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedBlockingQueue<>(6);

        /*
        remove(), add(), element() -> throws Exception
        poll(), offer(), peek -> Doesn't throw Exception
         */
        try {
            queue.remove();
        } catch (Exception e){
            System.out.println("Queue is empty");
        }

        try {
            System.out.println(queue.element());
        } catch (Exception e){
            System.out.println("No Elements at top");
        }

        try {
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            queue.add(6);
            queue.add(7);
        } catch (Exception e){
            System.out.println("Queue is Full");
        }

        for (int element: queue){
            System.out.print(element+" ");
        }

        System.out.println();

        queue.remove();

        try {
            System.out.println(queue.element());
        } catch (Exception e){
            System.out.println("No Elements at top");
        }

        Queue<Integer> anotherQueue = new LinkedBlockingQueue<>(4);
        anotherQueue.poll();
        System.out.println(anotherQueue.peek());
        anotherQueue.offer(9);
        anotherQueue.offer(8);
        anotherQueue.offer(7);
        anotherQueue.offer(6);
        anotherQueue.offer(5);
        for(int element: anotherQueue){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println(anotherQueue.peek());
    }
}
