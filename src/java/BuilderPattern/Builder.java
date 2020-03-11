package BuilderPattern;

import BuilderPattern.models.Car;
import BuilderPattern.models.Motor;
import BuilderPattern.models.Parts;
import BuilderPattern.models.Tires;

public interface Builder {
    public CarBuilder buildParts(String name,int weight);

    public CarBuilder buildV4Motor(int horsepower,String brand);

    public CarBuilder buildV6Motor(int horsepower,String brand);

    public CarBuilder buildV8Motor(int horsepower,String brand);

    public CarBuilder buildRainTires(int libs,String brand);

    public CarBuilder buildDryTires(int libs,String brand);

    public CarBuilder buildMediumTires(int libs,String brand);

    public Car getCar();
}
