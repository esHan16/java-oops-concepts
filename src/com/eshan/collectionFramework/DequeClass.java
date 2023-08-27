package com.eshan.collectionFramework;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeClass {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedBlockingDeque<>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        deque.offerLast(5);
        deque.offerLast(6);
        System.out.println("deque.peekFirst() : "+deque.peekFirst());
        System.out.println("deque.peekLast() : "+deque.peekLast());
        for(int element: deque){
            System.out.println(element);
        }
        System.out.println("-X-X-X-X-X-X-");
        deque.pollFirst();
        deque.pollLast();
        for(int element: deque){
            System.out.println(element);
        }
    }
}
