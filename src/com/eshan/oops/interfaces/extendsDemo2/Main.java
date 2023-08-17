package com.eshan.oops.interfaces.extendsDemo2;

public class Main implements B {
    @Override
    public void func() {
        System.out.println("Hi");
    }

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        A.sayHi(); // A is an Interface
    }
}
