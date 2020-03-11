package FactoryMethodPattern.models;

public class Car implements Vehicle {

    public void accelerate() {
        System.out.println("SPEED!");
    }

    public void brake() {
        System.out.println("PULL THE BRAKES!");
    }

    public void turnOn() {
        System.out.println("START THE ENGINE!");
    }
}
