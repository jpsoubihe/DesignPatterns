package FactoryMethodPattern;

import FactoryMethodPattern.models.Car;
import FactoryMethodPattern.factory.VehicleFactory;
import FactoryMethodPattern.models.Vehicle;

public class Main {

    public static void main(String args[]) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle car = factory.getVehicle("car");
        System.out.println(car.getClass().getName());

        ((Car)car).turnOn();
    }
}
