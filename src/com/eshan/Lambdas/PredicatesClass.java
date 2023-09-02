package com.eshan.Lambdas;

import java.util.function.IntPredicate;

public class PredicatesClass {
    public static void main(String[] args) {

        IntPredicate lessThan18 = new IntPredicate() {
            @Override
            public boolean test(int value) {
                if(value < 18){
                    return true;
                } else {
                    return false;
                }
            }
        };

//        IntPredicate lessThan18 = i -> i < 18;
        IntPredicate moreThan10 = i -> i > 10;
//        System.out.println(lessThan18.and(moreThan10).test(13));

//        demo(13,i -> i < 18,i -> i > 10); OR
        demo(14, lessThan18, moreThan10);
    }
    public static void demo(int value, IntPredicate lessThan18, IntPredicate moreThan10){
        if(lessThan18.and(moreThan10).test(value)){
            System.out.println("The value is less than 18 and more than 10");
        } else {
            System.out.println("The value is More than 18 or less than 10");
        }
    }
}
