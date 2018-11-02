package com.hankzimmer;

public class Mustang extends Car {

    public Mustang(int cylinders, int doors) {
        super("Mustang", cylinders, doors);
    }

    @Override
    public String startEngine() {
        return "Mustang -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mustang -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mustang -> brake()";
    }
}
