package com.eshan.oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data; // We don't want the user to directly modify this data
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int number){
        if(full()){
            resize();
        }
        data[size++] = number;
    }

    private void resize() {
        int []temp = new int[data.length * 2];
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
    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
    CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 12; i++) {
            list.add((i+1)*4);
        }
        System.out.println(list);
    }
}
