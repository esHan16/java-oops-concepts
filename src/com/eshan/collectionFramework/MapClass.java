package com.eshan.collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "Eshan");
        map.put(3, "Arpit");
        map.put(1, "Sahil");

//        for(Map.Entry<Integer, String> entry : map.entrySet()){
//            System.out.println(entry);
//            System.out.println("Value : "+entry.getValue()+" Key : "+entry.getKey());
//        }

//        for(Integer key: map.keySet()){
//            System.out.println("Key : "+key+" Value : "+map.get(key));
//        }

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while ((iterator.hasNext())){
            Map.Entry<Integer, String> temp = iterator.next();
            System.out.println(temp.getKey() +" | "+temp.getValue());
        }
    }
}
