package FactoryMethodPattern.factory;

import FactoryMethodPattern.models.Bycicle;
import FactoryMethodPattern.models.Vehicle;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicle) {
        if(vehicle.equals("bike")) {
            return BycicleFactory.buildBycicle();
        }
        else {
            return CarFactory.buildCar();
        }
    }
}
