package com.eshan.packages;

public class Main {
    public static void main(String[] args) {
        // In order to avoid confusion regarding the Greeting class present inside a package and b package and avoiding errors
        // I have declared the object in this manner (Application Of Packages)
        com.eshan.packages.a.Greeting greetingA = new com.eshan.packages.a.Greeting();
        com.eshan.packages.b.Greeting greetingB = new com.eshan.packages.b.Greeting();
        greetingA.printGreeting();
        greetingB.printGreeting();
    }
}
