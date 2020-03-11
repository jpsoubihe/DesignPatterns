package BuilderPattern;

import BuilderPattern.models.Car;
import BuilderPattern.models.Motor;
import BuilderPattern.models.Parts;
import BuilderPattern.models.Tires;

public class CarBuilder implements Builder {

    private Motor motor;
    private Parts parts;
    private Tires tires;

    public CarBuilder buildParts(String name, int weight) {
        this.parts = new Parts(name, weight);
        return this;
    }

    public CarBuilder buildV4Motor(int horsepower, String brand) {
        this.motor = new Motor(horsepower,4,brand);
        return this;
    }

    public CarBuilder buildV6Motor(int horsepower,String brand) {
        this.motor = new Motor(horsepower,6,brand);
        return this;
    }

    public CarBuilder buildV8Motor(int horsepower,String brand) {
        this.motor = new Motor(horsepower,8,brand);
        return this;
    }

    public CarBuilder buildRainTires(int libs, String brand) {
        this.tires = new Tires(libs,brand,"RAIN");
        return this;
    }

    public CarBuilder buildDryTires(int libs,String brand) {
        this.tires = new Tires(libs,brand,"DRY");
        return this;
    }

    public CarBuilder buildMediumTires(int libs,String brand) {
        this.tires = new Tires(libs,brand,"MEDIUM");
        return this;
    }

    public Car getCar() {
        return new Car(motor,parts,tires);
    }
}
