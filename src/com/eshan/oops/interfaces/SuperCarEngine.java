package com.eshan.oops.interfaces;

public class SuperCarEngine implements Engine{
    @Override
    public void engineStart() {
        System.out.println("Supercar engine started");
    }

    @Override
    public void engineStop() {
        System.out.println("Supercar engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Supercar engine Accelerating");
    }
}
