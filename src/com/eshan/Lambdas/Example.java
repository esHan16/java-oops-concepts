package com.eshan.Lambdas;

/**
 * We can make use of lambda expression for functional type interfaces only now.
 * What is a functional type of interface?
 * Functional type of interface is an interface where there is only one and exactly one abstract method.
 */


interface Lambda {
    public void printSatement();
}
public class Example {
    public static void main(String[] args) {

//        Lambda lambda = new Lambda() {
//            @Override
//            public void printSatement() {
//                System.out.println("Printing statement");
//            }
//        };

        // Example of lambda expression - single line
        Lambda lambda = () -> System.out.println("Printing statement");
//      Lambda lambda = (() -> System.out.println("Printing statement")); NOTE : BOTH ARE SAME

        // Example of lambda expression - multi-line
//        Lambda lambda = () -> {
//            System.out.println("Printing statement 1");
//            System.out.println("Printing statement 2");
//        };

        lambda.printSatement();
    }
}
