package com.eshan.oops.interfaces.extendsDemo2;

import jdk.jshell.JShell;

public interface A {
    // Static interface method should have the body.
    static void sayHi(){
        System.out.println("Hello World");
    }
    void func();
}
