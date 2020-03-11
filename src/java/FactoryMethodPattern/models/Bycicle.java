package FactoryMethodPattern.models;

public class Bycicle implements Vehicle {


    public void accelerate() {
        System.out.println("PEDAL");
    }

    public void brake() {
        System.out.println("PULL");
    }
}
