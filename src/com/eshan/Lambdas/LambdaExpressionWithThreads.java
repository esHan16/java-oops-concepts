package com.eshan.Lambdas;

public class LambdaExpressionWithThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
        });
        thread.start();
    }
}
