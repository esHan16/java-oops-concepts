package com.eshan.collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTypeClass {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        for (int i = 10; i > 0; i--) {
            set.add("A"+i);
        }
        for(String i : set){
            System.out.print(i+" ");
        }
    }
}
