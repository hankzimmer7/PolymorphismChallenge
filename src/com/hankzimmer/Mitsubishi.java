package com.hankzimmer;

public class Mitsubishi extends Car {

    public Mitsubishi( int cylinders, int doors) {
        super("Mitsubishi", cylinders, doors);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}
