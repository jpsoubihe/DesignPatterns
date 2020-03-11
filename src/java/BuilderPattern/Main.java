package BuilderPattern;

import BuilderPattern.models.Car;

public class Main {

    public static void main(String args[]) {
        Car car = new CarBuilder().buildDryTires(32,"Firestone").buildV4Motor(120,"Volkswagen").buildParts("Door",523).getCar();

        System.out.println(car);
    }
}
