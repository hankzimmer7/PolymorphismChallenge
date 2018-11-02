package com.hankzimmer;

public class Car {
    private String name;
    private boolean hasEngine;
    private int wheels;
    private int cylinders;
    private int doors;

    public Car(String name, int cylinders, int doors) {
        this.name = name;
        this.hasEngine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.doors = doors;
    }

    public String startEngine() {
        System.out.println("Started the " + name + "'s " + cylinders + " cylinder engine.");
        return "Car - > startEngine()";
    }

    public String accelerate() {
        System.out.println(name + " accelerated.");
        return "Car -> accelerate()";
    }

    public String brake() {
        System.out.println(name + " braked.");
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getDoors() {
        return doors;
    }
}
