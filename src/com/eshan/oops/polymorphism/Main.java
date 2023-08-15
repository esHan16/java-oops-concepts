package com.eshan.oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Square square = new Square();
        Shapes circle = new Circle();
        // Examples of method Overriding
        /**
         * If you have the type of reference variable as parent class but the object is of typed subclass
         * then the method call depend upon the object that the reference variable is referring to.
         * This is known as upcasting. And the entire thing is known as Overriding.
         * Ques. How Java determines this thing?
         * Ans. Using Dynamic method dispatch
         * It is just a mechanism by which a call to a overridden method is resolved at runtime rather than compile time
         */
        circle.area();
        shape.area();
        square.area();
        Area area = new Area();
        // Examples of method overloading, It is done in compile time, hence it is known as compile time polymorphism
        area.calculateArea(5);
        area.calculateArea(4,5);
    }
}
