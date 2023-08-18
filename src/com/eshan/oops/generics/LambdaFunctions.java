package com.eshan.oops.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
        list.forEach((item/** parameter */) -> {
            System.out.println(item * 2); /** body of a function */
        });

//        Also written as,
//        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
//        list.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunctions lambdaFunctions = new LambdaFunctions();
        System.out.println(lambdaFunctions.operate(5,3,(a, b) -> a + b));
        System.out.println(lambdaFunctions.operate(5,3,prod));
        System.out.println(lambdaFunctions.operate(5,3,sub));

    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}
interface Operation {
    int operation(int a, int b);
}
