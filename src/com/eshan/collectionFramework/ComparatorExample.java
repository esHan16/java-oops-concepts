package com.eshan.collectionFramework;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K, V>{
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
                if(o1.getValue().length() > o2.getValue().length()){
                    return -1;
                } else if(o1.getValue().length() < o2.getValue().length()){
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Set<Data<Integer, String>> set = new TreeSet<Data<Integer, String>>(COMPARE_KEY);
//        set.add(new Data("Key", "Value"));
        set.add(new Data(3, "Three"));
        set.add(new Data(5, "Five"));
        set.add(new Data(4, "Four"));
        set.add(new Data(2, "Two"));
        set.add(new Data(1, "One"));
        set.add(new Data(4, "Four"));
        set.add(new Data(6, "Six"));
        set.add(new Data(2, "Two"));

        for(Data data: set){
            System.out.println(data);
        }
    }

}
