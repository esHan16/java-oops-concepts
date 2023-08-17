package com.eshan.oops.abstraction;

public abstract class Parent {
    int age;
    static void sayHi(){
        System.out.println("Hello");
    }

    Parent(int age){
        this.age = age;
    }
    abstract void getCareer();
    abstract void choosePartner();
}
