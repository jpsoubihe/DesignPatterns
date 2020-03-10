package PrototypePattern;

public class Nano extends BasicCar {

    int basePrice = 1000;

    public Nano(String model) {
        this.model = model;
    }

    @Override
    public Nano clone() throws CloneNotSupportedException {
        return (Nano)super.clone();
    }
}
