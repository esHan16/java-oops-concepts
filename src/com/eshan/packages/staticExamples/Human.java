package com.eshan.packages.staticExamples;

public class Human {
    int age;
    String name;
    float salary;
    boolean isMarried;
    static int population;
    static void sayHello(){
        System.out.println("Hello World!!");
//        System.out.println(this.age); can't use this keyword inside static method
    }
    public Human(int age, String name, float salary, boolean isMarried) {
        population++;
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        sayHello();
    }
}
