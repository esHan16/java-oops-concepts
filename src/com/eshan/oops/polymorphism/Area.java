package com.eshan.oops.polymorphism;

public class Area {
    void calculateArea(double side){
        System.out.println("Area of Square :"+ (side * side));
    }
    void calculateArea(double length, double width){
        System.out.println("Area of Rectangle :"+ (length * width));
    }

}
