package com.eshan.oops.abstraction;

public class Son extends Parent {
    Son(int age){
        super(age);
    }
    @Override
    void getCareer() {
        System.out.println("I am going to be Doctor");
    }

    @Override
    void choosePartner() {
        System.out.println("I am going to marry Ms. Kaju Katli");
    }
}
