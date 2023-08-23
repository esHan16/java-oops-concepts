package com.eshan.collectionFramework;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("France");
        countries.add("Germany");
        countries.add("China");
        countries.add("Russia");
        printList(countries);
        countries.add(5,"Japan"); // Inserts the specified element at the specified position in this list.
        // Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
        printList(countries);
        countries.set(4,"Nepal"); // Replaces the element at the specified position in this list with the specified element.
        printList(countries);
        countries.remove(); // Retrieves and removes the head (first element) of this list.
        printList(countries);
        countries.remove(3); // emoves the element at the specified position in this list.
        // Shifts any subsequent elements to the left (subtracts one from their indices). Returns the element that was removed from the list.
        printList(countries);
    }
    static void printList(LinkedList<String> list){
        for(String element: list){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("******************");
    }
}
