package PrototypePattern;

public abstract class BasicCar implements Cloneable{

    String model;
    int basePrice;

//    public BasicCar(String model, int basePrice) {
//        this.model = model;
//        this.basePrice = basePrice;
//    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
