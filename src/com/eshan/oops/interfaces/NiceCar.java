package com.eshan.oops.interfaces;

public class NiceCar {
    private Engine engine; // Engine is an Interface
    NiceCar (){
        this.engine = new SuperCarEngine();
    }
    NiceCar (Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.engineStart();
    }
    public void stop(){
        engine.engineStop();
    }
    public  void accelerate(){
        engine.accelerate();
    }
}
