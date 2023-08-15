package com.eshan.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4.4,3.6,7.6);
        System.out.println(box.l+" "+box.b+" "+box.h);

        BoxWeight box3 = new BoxWeight(2,3,4,5);
        System.out.println(box3.weight+" "+box3.h);

        Box box2 = new BoxWeight(6,7,8,9);
        box2.greeting(); // OUTPUT: Box class is called
        /**
         * # NOTE: Although static methods can be inherited ,there is no point in overriding them in child classes because the
         * method in parent class will run always no matter from which object you call it. That is why static interface methods
         * cannot be inherited because these method will run from the parent interface and no matter if we were allowed to
         * override them, they will always run the method in parent interface.
         * That is why static interface method must have a body.
         */

//        System.out.println(box2.weight); Cannot access this weight property
        /**
         * It is actually the type of the reference variable that actually determines (not the object) what members can be accessed.
         * In above example box2 is a reference of type Box, and it is referencing to the object of type BoxWeight
         * So, when a reference to a subclass object is assigned to a super class reference variable, then you will only have access to
         * only those parts of the objects that are obviously defined inside the super class
         */
    }
}
