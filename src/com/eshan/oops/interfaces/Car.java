package com.eshan.oops.interfaces;

public class Car implements Brakes, Media, Engine {
    @Override
    public void brakes() {
        System.out.println("Breaks are applied");
    }

    @Override
    public void engineStart() {
        System.out.println("Engine Started");
    }

    @Override
    public void engineStop() {
        System.out.println("Engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Engine Accelerated");
    }

    @Override
    public void startMusic() {
        System.out.println("Music Started");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music Stopped");
    }
}
