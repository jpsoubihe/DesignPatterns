package PrototypePattern;

public class Ford extends BasicCar {

    int basePrice = 2000;

    public Ford(String model) {
        this.model = model;
    }

    @Override
    public Ford clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
