package PrototypePattern;

public class Main {

    //client
    public static void main(String args[]) throws CloneNotSupportedException{
        BasicCar nano = new Nano("Green Nano");
        BasicCar ford = new Ford("Ford Fiesta");

        BasicCar otherNano = nano.clone();
        BasicCar otherFord = ford.clone();

        otherNano.setBasePrice(2400);
        otherFord.setBasePrice(5000);

        System.out.println(otherNano.getModel());
        System.out.println(otherFord.getModel());
        System.out.println(otherFord.getBasePrice());
    }
}
