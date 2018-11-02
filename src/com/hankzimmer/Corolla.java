package com.hankzimmer;

public class Corolla extends Car {

    public Corolla() {
        super("Corolla", 4, 4);
    }

    @Override
    public String startEngine() {
        return "Corolla -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Corolla -> accelerate()";
    }

    @Override
    public String brake() {
        return "Corolla -> brake()";
    }
}
