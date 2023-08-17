package com.eshan.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(32);
        son.getCareer();
        son.choosePartner();
        Daughter daughter = new Daughter(34);
        daughter.choosePartner();
        daughter.getCareer();
//        Parent mother = new Parent(23); ERROR : We cannot make objects of abstract classes
        Parent.sayHi(); // We can call static method from abstract class

    }
}
