package com.hankzimmer;

public class Main {

    public static void main(String[] args) {
	    Car car = new Car("base car",4,4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,4);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Mustang mustang = new Mustang(8,2);
        System.out.println(mustang.startEngine());
        System.out.println(mustang.accelerate());
        System.out.println(mustang.brake());

        Corolla corolla = new Corolla();
        System.out.println(corolla.startEngine());
        System.out.println(corolla.accelerate());
        System.out.println(corolla.brake());
    }
}
