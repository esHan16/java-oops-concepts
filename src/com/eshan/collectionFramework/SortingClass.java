package com.eshan.collectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class SortingClass {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("France");
        countries.add("Germany");
        countries.add("China");
        countries.add("Russia");
        countries.sort(null); // For sorting the list in an alphabetical ordering
        for(String element: countries){
            System.out.print(element+" ");
        }
        System.out.println();
        Collections.reverse(countries); // For reversing the list in an alphabetical ordering
        for(String element: countries){
            System.out.print(element+" ");
        }
    }
}
