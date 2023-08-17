package com.eshan.oops.interfaces.extendsDemo2;

public interface B extends A {

    default void greet() {
        System.out.println("Hi I am Eshan Verma");
    }
}
