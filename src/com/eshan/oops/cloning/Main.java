package com.eshan.oops.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human eshan = new Human(34,"Eshan");
//        Human twin = new Human(eshan); // I am making the copy of eshan object
        Human twin = (Human)eshan.clone();
        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(eshan.arr));
        System.out.println(Arrays.toString(twin.arr));
        eshan.arr[0] = 100;
        System.out.println(Arrays.toString(eshan.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
