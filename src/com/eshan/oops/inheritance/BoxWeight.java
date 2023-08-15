package com.eshan.oops.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double b, double h, double weight) {
        super(l, b, h); // Call the parent class constructor
        // Used to initialize values present in parents class
        System.out.println(super.h);
        this.weight = weight;
    }
    public BoxWeight (BoxWeight otherBox){
        super(otherBox); // Same as this examples : Box box2 = new BoxWeight(6, 7, 8, 9);
        this.weight = otherBox.weight;
    }
    static void greeting(){
        System.out.println("Box class is called");
    }
}
