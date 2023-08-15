package com.eshan.packages;
// initializing static variable
public class StaticBlock {
    static int a = 4;
    static int b;
    // Static block is required for initialization of static variable as static variables doesn't dependent upon
    // the object of the class
    // Static block will get executed exactly once when the class in loaded for the very first time.
    static {
        System.out.println("I am inside static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock obj3 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

    }
}
