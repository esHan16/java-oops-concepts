package com.eshan.oops.generics;

import java.util.Arrays;

public class WildcardExample<T extends Number> { /** Wildcard : restricting the Type T to Number */
    private T[] data; // We don't want the user to directly modify this data
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample() {
        this.data = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T number){
        if(full()){
            resize();
        }
        data[size++] = number;
    }

    private void resize() {
        T []temp = (T[]) new Object[data.length * 2];
        // copy the current item in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean full() {
        return size == data.length;
    }

    // reducing the size of the data array by 1
    public T remove() {
        T removed = data[--size];
        return removed;
    }

    public T get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenericsArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildcardExample<Integer> list = new WildcardExample<Integer>();

        for (int i = 0; i < 12; i++) {
            list.add((i+1)*4);
        }
        System.out.println(list);
    }
}