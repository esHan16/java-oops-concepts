package com.eshan.collectionFramework;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stackObject = new Stack<>();
        stackObject.push(1);
        stackObject.push(2);
        stackObject.push(3);
        stackObject.push(4);
        stackObject.push(5);
        stackObject.push(6);
        stackObject.push(7);
        for (int element: stackObject) {
            System.out.print(element+" ");
        }
        // OUTPUT : 1 2 3 4 5 6 7
        System.out.println();
        System.out.println(stackObject.empty()); // Check whether the stack is empty or not
        System.out.println(stackObject.peek()); // return the topmost element of the stack
        stackObject.pop(); // for popping out the topmost value
        for (int element: stackObject) {
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println(stackObject.search(1)); // search the element inside the stack and return the index of that element
    }
}
