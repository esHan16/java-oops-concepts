package com.eshan.oops.interfaces;

public class ElectricEngine  implements Engine{
    @Override
    public void engineStart() {
        System.out.println("Electric car engine started");
    }

    @Override
    public void engineStop() {
        System.out.println("Electric car engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car engine Accelerating");
    }
}
