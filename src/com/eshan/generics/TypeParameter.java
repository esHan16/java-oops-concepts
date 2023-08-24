package com.eshan.generics;

class DataType<K,V>{
    private K key;
    private V value;

    public DataType(K key, V value) {
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
        return "DataType{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public <E, N> void display(E element, N number){
        System.out.println("Element : "+element+" Number : "+number);
    }
}

public class TypeParameter {
    public static void main(String[] args) {
        DataType<Integer, String> data = new DataType<Integer, String>(1,"Eshan Verma");
        System.out.println("Key : "+data.getKey());
        System.out.println("Value : "+data.getValue());
        data.display(data.getValue(), data.getKey());
    }
}
