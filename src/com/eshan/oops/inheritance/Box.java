package com.eshan.oops.inheritance;

public class Box {
    double l;
    double b;
    double h;

    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    //cube
    Box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box box){
        this.l = box.l;
        this.b = box.b;
        this.h = box.h;
    }
    public void information(){
        System.out.println("Running the box");
    }

    static void greeting(){
        System.out.println("Box class is called");
    }
}
