package com.eshan.oops.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int arr[];

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7};
    }

//    Human(Human human) {
//        this.age = human.age;
//        this.name = human.name;
//    }

    public Object clone() throws CloneNotSupportedException {
        /**
         // This is shallow copy

         * Primitive will be copied as it is but the reference variable of an object or the object type value will not be copied,
         * but it will point to the same object.

         return super.clone();
         */
        // Deep Copy
        Human twin = (Human) super.clone();
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
