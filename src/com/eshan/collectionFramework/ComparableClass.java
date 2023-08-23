package com.eshan.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Name implements Comparable<Name> {
    String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Name o) {
        if(name.length() > o.name.length()){
            return -1;
        } else if(name.length() < o.name.length()){
            return 1;
        } else {
            return 0;
        }
    }
}
public class ComparableClass {
    public static void main(String[] args) {
        List<Name> list = new ArrayList<>();
        list.add(new Name("BMW"));
        list.add(new Name("Mercedes"));
        list.add(new Name("Volvo"));
        list.add(new Name("Audi"));
        list.add(new Name("Jaguar"));
        Collections.sort(list);
        Iterator<Name> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().name);
        }
    }
}
