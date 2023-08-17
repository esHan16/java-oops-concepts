package com.eshan.oops.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startMusic();
        car.brakes();
        System.out.println(Engine.cost);
        NiceCar niceCar = new NiceCar(new ElectricEngine());
        niceCar.start();
        niceCar.accelerate();
        niceCar.stop();
    }
}
