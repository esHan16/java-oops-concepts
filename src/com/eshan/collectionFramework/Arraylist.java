package com.eshan.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add("Apple");
        list.add("Samsung");
        list.add("Nokia");
        list.add("Google Pixel");
        list.add("Motorola");
        list.add("HTC");
        list.add("Mi");
        list.add("One Plus");
//        printElementAtIndex(5);
//        printList();
//        printAllElementOfList((ArrayList<String>) list);
//        removeElementByElement("Mi");
//        printList();
//        removeElementByPosition(3);

//        printList();
//        modifyContentOfList("Real Me",4);
//        printList();
//        list.add(6,"Nothing");
//        printList();
//        searchForElementAtIndex("Mi");
    }
    static void printElementAtIndex(int n){
        // For printing element at given index n
        System.out.println(list.get(n));
    }
    static void printList(){
        //For printing whole list
        System.out.println(list);
    }
    static void printAllElementOfList(ArrayList<String> list){
        for (String str: list) {
            System.out.println(str);
        }
    }
    static void removeElementByElement(String element){
        //For removing element by their name
        list.remove(element);
    }
    static void removeElementByPosition(int position){
        //For removing element by their position
        list.remove(position);
    }
    static void modifyContentOfList(String str, int position){
        // 0 based indexing - Arraylist indexing starts with zero an end at length of array - 1
//        list.add(position, str);
        // for modification inside the list
        list.set(position,str);
    }
    static void searchForElementAtIndex(String element){
        System.out.println(list.indexOf(element));
        // returns the index of the element at which it is present inside the list
    }
}
