package com.eshan.collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        /**
         * Set - Elements inside the set are distinct
         * And the order of Set may not be same all the time
         */
        set.add("Apple");
        set.add("Blueberry");
        set.add("Banana");
        set.add("Guava");
        set.add("Cherry");
        set.add("Guava");
        set.add("Blueberry");
        for(String element: set){
            System.out.println(element);
        }
        System.out.println(set.contains("Apple"));
    }
}
