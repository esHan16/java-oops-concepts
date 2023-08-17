package com.eshan.oops.abstraction;

public class Daughter extends Parent{
    Daughter(int age){
        super(age);
    }
    @Override
    void getCareer() {
        System.out.println("I am going to become dancer");
    }

    @Override
    void choosePartner() {
        System.out.println("I am going to marry Iron Man");
    }
}
