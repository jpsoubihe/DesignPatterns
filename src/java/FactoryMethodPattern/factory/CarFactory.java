package FactoryMethodPattern.factory;

import FactoryMethodPattern.models.Car;

public class CarFactory {

    public static Car buildCar() {
        return new Car();
    }
}
