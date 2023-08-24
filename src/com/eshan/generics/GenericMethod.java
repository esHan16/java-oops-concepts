package com.eshan.generics;

import java.util.ArrayList;
import java.util.List;

class Type {
    public <E> void printList(List<E> list){
        for (E element: list) {
            System.out.println(element);
        }
    }
    public <E> void printArray(E[] arr){
        for(E element: arr){
            System.out.println(element);
        }
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Mercedes");
        list.add("Audi");
        list.add("Jaguar");
        Type type = new Type();
        type.printList(list);

        String [] strArray = {"One", "Two", "Three", "Four", "Five", "Six"};
        type.printArray(strArray);
    }
}
